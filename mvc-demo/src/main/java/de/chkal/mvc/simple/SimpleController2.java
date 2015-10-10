package de.chkal.mvc.simple;

import javax.mvc.annotation.Controller;
import javax.mvc.annotation.View;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Controller
@Path("/simple2")
public class SimpleController2 {

  @GET
  @View("simple.jsp")
  public void get() {
    // empty
  }

}
