package controllers;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class Vols {
	
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllVol() {
		dao.Vols dao = new dao.Vols();
		models.Vols vol = dao.findVolbyId(1);
		return Response.ok().entity(vol).build();
	}
}
