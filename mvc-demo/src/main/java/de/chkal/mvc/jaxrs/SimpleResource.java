package de.chkal.mvc.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/jaxrs/hello/{name}")
public class SimpleResource {

  @PathParam("name")
  private String name;

  @GET
  public String sayHello() {
    return "Hello " + name;
  }

}
