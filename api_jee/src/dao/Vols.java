package dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Vols {
	private static EntityManager em;
	
	public Vols() {
		em = Persistence.createEntityManagerFactory("api_jee").createEntityManager();
	}
	
	public models.Vols findVolbyId(int id) {
		models.Vols v = em.find(models.Vols.class, id);
		return v;
	}
}
