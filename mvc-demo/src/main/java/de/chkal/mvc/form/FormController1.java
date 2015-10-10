package de.chkal.mvc.form;

import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.annotation.Controller;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Controller
@Path("/form")
public class FormController1 {

  @Inject
  private Models models;

  @GET
  public String get() {
    return "form.jsp";
  }

  @POST
  public String post( @FormParam("name") String name ) {
    models.put( "message", "Hello " + name );
    return "form.jsp";
  }

}
