package routes;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/vols")
public class Vols {
	@GET
	public String getAll() {
		return "vol";
	}
	
	@GET
	@Path("/volsJson")
	@Produces("application/json")
	public String getAllJson() {
		return "volJson";
	}
}
