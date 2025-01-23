package org.gjimenez.infrasctructure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.HealthEndpoint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootHealthController {

  @Autowired
  private HealthEndpoint healthEndpoint;

  @GetMapping("/")
  public String health() {
    return healthEndpoint.health().getStatus().toString(); // Devuelve "UP" o "DOWN"
  }
}