package com.amiapp.bonjour.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/Salutions")
public class BonjourResource {

	  @GET
	  @Path("/bonjour")
	    @Produces(MediaType.APPLICATION_JSON)
	    public String bonjour() {
	        return "Bonjour tout le monde!";
	    }
	    
	    @GET
		@Path("/bonsoir")
	    @Produces(MediaType.APPLICATION_JSON)
	    public String bonsoir() {
	        return "Bonsoir tout le monde";
	    }
	    
	    @GET
		@Path("/salut")
	    @Produces(MediaType.APPLICATION_JSON)
	    public String salut() {
	        return "Salut";
	    }
}
