package dal;

import java.io.IOException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import dal.Database;

@Path("api/backlogitems")
public class BacklogItemDetails {

	 @Context
	 private UriInfo context;

	 public BacklogItemDetails() {
			
	 }
	 
	 //GET ALL
	 @GET
	 @Produces({MediaType.APPLICATION_JSON})
	 public Response getBacklogItems(String paramBacklogItems) {
		 Response.ResponseBuilder response = Response.status(Response.Status.OK);
		 Database db = newInstance();
	     
	     try {
	        
	     } catch (Exception e) {
	        response.status(Response.Status.BAD_REQUEST);
	        response.entity("[ERROR] " + e.getMessage());
	     }
	     System.out.println("Webservice GET ALL called");
	     return response.build();
	 }
	 
	 //GET BY ID
	 @GET
	    @Produces({MediaType.APPLICATION_JSON})
	    @Path("{backlogitemId}")
	    public Response getBacklogItem(@PathParam("backlogitemId") String paramBacklogItemId) {
	        Response.ResponseBuilder response = Response.status(Response.Status.OK);
	        Database db = newInstance();
	        
	        try {
	           
	        } catch (Exception e) {
	            response.status(Response.Status.BAD_REQUEST);
	            response.entity("[ERROR] " + e.getMessage());
	        }
	        System.out.println("Webservice GET BY ID called");
	        return response.build();
	    }
	 
	 //POST
	 @POST
	    @Consumes({MediaType.APPLICATION_JSON})
	    public Response newBacklogItem(String paramBacklogItem) throws Exception {
	        Response.ResponseBuilder response = Response.status(Response.Status.OK);
	        Database db = newInstance();

	        try {
	           
	        } catch (Exception e) {
	            response.status(Response.Status.BAD_REQUEST);
	            response.entity("[ERROR] " + e.getMessage());
	        }
	        System.out.println("Webservice POST new book: " + paramBacklogItem);
	        return response.build();
	    }
	 
	 //DELETE
	 @DELETE
	    @Consumes({MediaType.APPLICATION_JSON})
	    public Response deleteBacklogItem(@QueryParam("backlogItemId") String paramBacklogItem) throws IOException {
	        Response.ResponseBuilder response = Response.status(Response.Status.OK);
	        Database db = newInstance();

	        try {
	            
	        } catch (Exception e) {
	            response.status(Response.Status.BAD_REQUEST);
	            response.entity("[ERROR] " + e.getMessage());
	        }
	        System.out.println("Webservice DELETE delete book: " + paramBacklogItem);
	        return response.build();
	    }
	 
	 //PUT
	 @PUT
	    @Consumes({MediaType.APPLICATION_JSON})
	    public Response updateBacklogItem(String paramBacklogItem) throws IOException {
	        Database db = newInstance();
	        Response.ResponseBuilder response = Response.status(Response.Status.OK);

	        try {
	            
	        } catch (Exception e) {
	            response.status(Response.Status.BAD_REQUEST);
	            response.entity("[ERROR] " + e.getMessage());
	        }
	        System.out.println("Webservice PUT updated book: " + paramBacklogItem);
	        return response.build();
	    }
	 
	 public Database newInstance() {
		 return Database.newInstance();
	 }
}