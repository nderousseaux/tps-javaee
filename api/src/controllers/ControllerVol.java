package controllers;
import dao.*;

import java.util.ArrayList;
import java.util.List;

import models.Vol;


public class ControllerVol {
	
	private static VolDao volDaoInstance = new VolDao();
	
	public ControllerVol() {
	}
	  
	public List<Vol> getAll() { return volDaoInstance.findAll(); }
  
  
	public List<Vol> getParam(String numeroVol,String villeDepart,String villeArrivee, String heureDepart)
	{
		List<Vol> allVol = volDaoInstance.findAll();
		
		List<Vol> volsSelected = new ArrayList<Vol>();
		
		for(Vol v : allVol) {
			
			//On vérifie que le vol correspond aux paramètres
			Boolean ok = true;
			if(numeroVol!=null && !v.getNumVol().equals(numeroVol)) {
				ok=false;
			}
			if(villeArrivee!=null && !v.getVilleArrivee().toUpperCase().equals(villeArrivee.toUpperCase())) {
				ok=false;
			}
			if(villeDepart!=null && !v.getVilleDepart().toUpperCase().equals(villeDepart.toUpperCase())) {
				ok=false;
			}
			if(heureDepart!=null && !v.getHeureDepart().equals(heureDepart)) {
				ok=false;
			}
			if(ok) {
				volsSelected.add(v);
			}
		}
		return volsSelected; 
	}  	
  
  
	public Vol getById(String num) {
	  return volDaoInstance.find(num);
	}
}
