package de.chkal.mvc.validation;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;

public class ValidationForm {

  @FormParam("name")
  @NotNull(message = "Geben Sie ihren Namen ein")
  @Size(min = 3, message = "Der Name ist zu kurz")
  private String name;

  @FormParam("age")
  @NotNull(message = "Geben Sie ihr Alter ein")
  @Min(value = 18, message = "Sie müssen volljährig sein")
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
