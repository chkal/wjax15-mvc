package de.chkal.mvc.validation;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Named
@RequestScoped
public class ValidationMessages {

  private final List<String> messages = new ArrayList<>();

  public void add( String m ) {
    messages.add( m );
  }

  public void addAll( Collection<String> m ) {
    messages.addAll( m );
  }

  public List<String> getMessages() {
    return messages;
  }

}
