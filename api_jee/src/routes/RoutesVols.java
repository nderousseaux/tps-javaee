package routes;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/vols")
public class RoutesVols {
	@GET
	public String getAll() {
		return "vol";
	}
}
