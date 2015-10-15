package de.chkal.mvc.csrf;

import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.annotation.Controller;
import javax.mvc.annotation.CsrfValid;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Controller
@Path("/csrf")
public class CsrfController {

  @Inject
  private Models models;

  @GET
  public String get() {
    return "csrf.jsp";
  }

  @POST
  @CsrfValid
  public String post( @FormParam("name") String name ) {

    models.put( "message", "CSRF token validated!" );
    return "csrf.jsp";

  }

}
