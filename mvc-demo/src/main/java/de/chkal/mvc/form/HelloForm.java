package de.chkal.mvc.form;

import javax.ws.rs.FormParam;

public class HelloForm {

  @FormParam("name")
  private String name;

  public String getName() {
    return name;
  }

  public void setName( String name ) {
    this.name = name;
  }

}
