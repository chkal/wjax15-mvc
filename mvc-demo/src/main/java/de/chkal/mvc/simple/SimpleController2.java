package de.chkal.mvc.simple;

import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.annotation.Controller;
import javax.mvc.annotation.View;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Controller
@Path("/simple2")
public class SimpleController2 {

  @Inject
  private Models models;

  @GET
  @View("simple.jsp")
  public void get() {
    models.put( "message", "Hello world" );
  }

}
