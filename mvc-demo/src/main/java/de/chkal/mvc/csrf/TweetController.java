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
@Path("/tweet")
public class TweetController {

  @Inject
  private Models models;

  @GET
  public String get() {
    return "tweet.jsp";
  }

  @POST
  @CsrfValid
  public String post( @FormParam("text") String text ) {

    models.put( "message", "You tweeted: " + text );
    return "tweet.jsp";

  }

}
