package de.chkal.mvc.simple;

import javax.mvc.annotation.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Controller
@Path("/simple1")
public class SimpleController1 {

  @GET
  public String render() {
    return "simple.jsp";
  }

}
