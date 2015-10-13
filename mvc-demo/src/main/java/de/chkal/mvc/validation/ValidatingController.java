package de.chkal.mvc.validation;

import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.annotation.Controller;
import javax.mvc.binding.BindingResult;
import javax.validation.executable.ExecutableType;
import javax.validation.executable.ValidateOnExecution;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Controller
@Path("/validation")
public class ValidatingController {

  @Inject
  private Models models;

  @Inject
  private ValidationMessages messages;

  @Inject
  private BindingResult bindingResult;

  @GET
  public String get() {
    return "validation.jsp";
  }

  @POST
  @ValidateOnExecution(type = ExecutableType.NONE)
  public String post( @BeanParam ValidationForm form ) {

    if( bindingResult.isFailed() ) {
      messages.addAll( bindingResult.getAllMessages() );
      return "validation.jsp";
    }

    // process the form here
    messages.add( "Validierung erfolgreich." );
    return "validation.jsp";

  }

}
