package routes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import controllers.ControllerVol;

import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/vols")
public class VolRoute {

	private ControllerVol volControllerInstance = new ControllerVol();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllVols() {
		return Response.ok().entity(volControllerInstance.getAll()).build();
	}
	
	@GET
	@Path("/numVol-{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getVolId(@PathParam("id") String id) {
		return Response.ok().entity(volControllerInstance.getById(id)).build();
	}
	
	@GET
	@Path("/search")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getVolParam(@QueryParam("numVol") String num,@QueryParam("departure") String villeD,@QueryParam("arrival") String villeA,@QueryParam("departureTime") String heureD) {
		return Response.ok().entity(volControllerInstance.getParam(num, villeA, villeD, heureD)).build();
	}
}
