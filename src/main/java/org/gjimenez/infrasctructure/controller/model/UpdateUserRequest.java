package org.gjimenez.infrasctructure.controller.model;

public class UpdateUserRequest {
  private String name;
  private String job;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }
}
