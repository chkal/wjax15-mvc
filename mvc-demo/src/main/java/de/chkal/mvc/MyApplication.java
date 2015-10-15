package de.chkal.mvc;

import javax.mvc.security.Csrf;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashMap;
import java.util.Map;

@ApplicationPath("/mvc")
public class MyApplication extends Application {

  @Override
  public Map<String, Object> getProperties() {
    Map<String, Object> properties = new HashMap<>();
    properties.put( Csrf.CSRF_PROTECTION, Csrf.CsrfOptions.EXPLICIT );
    return properties;
  }

}
