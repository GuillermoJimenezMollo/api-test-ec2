package org.gjimenez.infrasctructure.gateway.model;

public class Game {
  private String id;
  private String name;
  private String description;
  private String developer;
  private String publisher;
  private String released_date;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDeveloper() {
    return developer;
  }

  public void setDeveloper(String developer) {
    this.developer = developer;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public String getReleased_date() {
    return released_date;
  }

  public void setReleased_date(String released_date) {
    this.released_date = released_date;
  }
}
