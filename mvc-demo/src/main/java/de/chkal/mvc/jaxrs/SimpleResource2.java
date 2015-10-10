package de.chkal.mvc.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/hello2")
public class SimpleResource2 {

  @GET
  @Path("/{name}")
  public String sayHello( @PathParam("name") String name ) {

    return "Hello " + name;

  }

}
