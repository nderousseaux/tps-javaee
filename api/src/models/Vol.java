package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vol")
public class Vol {
	
	@Id
	@Column(name="numVol")
	 private String numVol;
	@Column(name="villeDepart")
	  private String villeDepart;
	@Column(name="villeArrivee")
	  private String villeArrivee;
	@Column(name="heureDepart")
	  private String heureDepart; // Format : 1230 = 12h30 

	  public Vol() { } 

	  public Vol(String numVol, String villeDepart, String villeArrivee, String heureDepart) { 
	    this.numVol= numVol; 
	    this.villeDepart = villeDepart; 
	    this.villeArrivee = villeArrivee; 
	    this.heureDepart = heureDepart; 
	  } 

	  public String getHeureDepart() { return heureDepart; } 	    
	  
	  public String getVilleDepart() {return this.villeDepart; }
	 	     
	  public String getVilleArrivee() {return this.villeArrivee; }
	  	 
	  public String getNumVol() {return this.numVol; }
	  	    
	} 
