package de.chkal.mvc.model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Greeting {

  private String text;

  public String getText() {
    return text;
  }

  public void setText( String text ) {
    this.text = text;
  }

}
