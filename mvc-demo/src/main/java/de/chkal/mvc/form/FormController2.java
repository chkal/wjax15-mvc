package de.chkal.mvc.form;

import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.annotation.Controller;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Controller
@Path("/form2")
public class FormController2 {

  @Inject
  private Models models;

  @GET
  public String get() {
    return "form2.jsp";
  }

  @POST
  public String post( @BeanParam HelloForm form ) {
    models.put( "message", "Hello " + form.getName() );
    return "form2.jsp";
  }

}
