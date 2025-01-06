package org.gjimenez.infrasctructure.gateway.model;


public class Character {
  private String id;
  private String race;
  private String gender;
  private String name;
  private String description;

  private String[] appearances;

  public Character() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getRace() {
    return race;
  }

  public void setRace(String race) {
    this.race = race;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String[] getAppearances() {
    return appearances;
  }

  public void setAppearances(String[] appearances) {
    this.appearances = appearances;
  }
}
