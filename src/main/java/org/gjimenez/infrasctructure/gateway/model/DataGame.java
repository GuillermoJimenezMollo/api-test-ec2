package org.gjimenez.infrasctructure.gateway.model;

import java.util.List;

public class DataGame {
  private boolean success;
  private int count;

  private List<Game> data;

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

  public List<Game> getData() {
    return data;
  }

  public void setData(List<Game> data) {
    this.data = data;
  }
}
