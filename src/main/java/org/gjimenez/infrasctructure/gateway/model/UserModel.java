package org.gjimenez.infrasctructure.gateway.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserModel {

  private int id;
  private String email;
  @JsonProperty("first_name")
  private String firstName;
  @JsonProperty("last_name")

  private String lastName;
  private String avatar;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
}
