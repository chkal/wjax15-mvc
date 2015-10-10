package de.chkal.mvc.model;

import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.annotation.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Controller
@Path("/controller1")
public class ModelsController {

  @Inject
  private Models models;

  @GET
  public String get() {
    models.put( "message", "Hello world" );
    return "simple.jsp";
  }

}
