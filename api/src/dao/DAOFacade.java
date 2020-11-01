package dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.criteria.CriteriaQuery;


public abstract class DAOFacade<T> {
	@PersistenceUnit(unitName="api")
	private static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("api");
	
	@PersistenceContext(unitName="api")
	private static EntityManager em = null;
	private Class<T> classeEntite;

	public DAOFacade(Class<T> classeEntite) {
		this.classeEntite = classeEntite;
	}


	public EntityManager getEntityManager() {
		if (em == null)
			em = emfactory.createEntityManager();
		return em;
	}


	public T find(Object id) {
		return getEntityManager().find(classeEntite, id);
	}

	public List<T> findAll() {
		CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(classeEntite));
        return (List<T>) this.getEntityManager().createQuery(cq).getResultList();
        
	}

	public T create(T entite) {
		getEntityManager().persist(entite);
		return entite;

	}

}
