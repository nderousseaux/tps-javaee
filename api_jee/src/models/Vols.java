package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="vol")
public class Vols {
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="numVol")
	private String numVol;
	
	@Column(name="villeDepart")
	private String villeDepart;
	
	@Column(name="villeArrivee")
	private String villeArrivee;
	
	@Column(name="heureDepart")
	private int heureDepart; // Format : 1230 = 12h30
	
	public Vols() { }
	
	public Vols(int id, String numVol, String villeDepart, String villeArrivee, int heureDepart) {
		this.id = id;
		this.numVol = numVol;
		this.villeDepart = villeDepart;
		this.villeArrivee = villeArrivee;
		this.heureDepart = heureDepart;
	}
	    
	public String getNumVol() {
		return numVol;
	}
	public void setNumVol(String numVol) {
		this.numVol = numVol;
	}
	
	public String getVilleDepart() {
		return villeDepart;
	}
	public void setVilleDepart(String villeDepart) {
		this.villeDepart = villeDepart;
	}
	
	public String getVilleArrivee() {
		return villeArrivee;
	}
	public void setVilleArrivee(String villeArrivee) {
		this.villeArrivee = villeArrivee;
	}
	
	public int getHeureDepart() {
		return heureDepart; 
	}
	public void setHeureDepart(int heureDepart) {
		this.heureDepart = heureDepart; 
	}
}
