package de.chkal.mvc.model;

import javax.inject.Inject;
import javax.mvc.annotation.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Controller
@Path("/named")
public class NamedController {

  @Inject
  private Greeting greeting;

  @GET
  public String greet() {
    greeting.setText( "Hello world!" );
    return "named.jsp";
  }

}
