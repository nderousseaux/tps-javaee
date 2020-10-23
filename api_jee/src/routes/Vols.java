package routes;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/vols")
public class Vols {
	@GET
	public String getAll() {
		return "vol";
	}
	
	@GET
	@Path("/volsJson")
	@Produces("application/json")
	public Response getAllJson() {
		controllers.Vols v = new controllers.Vols();
		return v.getAllVol();
	}
}
