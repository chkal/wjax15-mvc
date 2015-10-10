package de.chkal.mvc.model;

import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.annotation.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Controller
@Path("/models")
public class ModelsController {

  @Inject
  private Models models;

  @GET
  public String greet() {
    models.put( "message", "Hello world!" );
    return "models.jsp";
  }

}
