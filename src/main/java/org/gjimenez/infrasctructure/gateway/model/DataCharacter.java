package org.gjimenez.infrasctructure.gateway.model;

import java.util.List;

public class DataCharacter {

  private boolean success;
  private int count;
  private List<Character> data;


  public boolean isSuccess() {
    return success;
  }

  public void setSuccess(boolean success) {
    this.success = success;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public List<Character> getData() {
    return data;
  }

  public void setData(List<Character> data) {
    this.data = data;
  }
}
