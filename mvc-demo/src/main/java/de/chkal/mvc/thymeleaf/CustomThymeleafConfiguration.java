package de.chkal.mvc.thymeleaf;

import org.glassfish.ozark.engine.ViewEngineConfig;
import org.glassfish.ozark.ext.thymeleaf.DefaultTemplateEngineProducer;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;
import org.thymeleaf.templateresolver.TemplateResolver;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.Specializes;

@Specializes
public class CustomThymeleafConfiguration extends DefaultTemplateEngineProducer {

  @Produces
  @ViewEngineConfig
  @Override
  public TemplateEngine getTemplateEngine() {

    TemplateResolver resolver = new ServletContextTemplateResolver();

    // Improved developer experience
    resolver.setCacheable( false );

    TemplateEngine engine = new TemplateEngine();
    engine.setTemplateResolver( resolver );
    return engine;

  }
}
