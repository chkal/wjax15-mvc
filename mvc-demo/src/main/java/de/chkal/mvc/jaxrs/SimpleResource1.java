package de.chkal.mvc.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello1")
public class SimpleResource1 {

  @GET
  public String greet() {
    return "Hello world";
  }

}
