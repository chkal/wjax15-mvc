package de.chkal.mvc.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello1")
public class SimpleResource1 {

  @GET
  public String hellWorld() {
    return "Hello world";
  }

}
