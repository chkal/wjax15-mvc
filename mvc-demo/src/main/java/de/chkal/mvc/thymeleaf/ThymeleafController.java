package de.chkal.mvc.thymeleaf;

import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.annotation.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Arrays;
import java.util.List;

@Controller
@Path("/thymeleaf")
public class ThymeleafController {

  @Inject
  private Models models;

  @GET
  public String render() {

    List<String> messages = Arrays.asList(
      "Text #1",
      "Text #2",
      "Text #3"
    );

    models.put( "messages", messages );
    return "thymeleaf.html";

  }

}
