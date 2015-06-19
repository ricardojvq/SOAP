package rest;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/SearchLyricDirect")
@Produces(MediaType.APPLICATION_JSON)
public class RestLike {
	
	@GET
	public String getSong(@MatrixParam("artist") String artist,
			@MatrixParam("song") String song) {
		return artist;
	}
	

}
