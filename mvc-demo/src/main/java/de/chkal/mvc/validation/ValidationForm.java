package de.chkal.mvc.validation;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;

public class ValidationForm {

  @FormParam("name")
  @Size(min = 3, message = "Geben Sie Ihren Namen ein")
  private String name;

  @FormParam("age")
  @NotNull(message = "Geben Sie Ihr Alter ein")
  @Min(value = 18, message = "Sie müssen 18 Jahre sein")
  private Integer age;

  public String getName() {
    return name;
  }

  public void setName( String name ) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge( Integer age ) {
    this.age = age;
  }

}
