package org.gjimenez.infrasctructure.config;

import org.springframework.boot.actuate.autoconfigure.security.servlet.EndpointRequest;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HealthConfig {

  // Personalizar la seguridad de Actuator (opcional)
  @Bean
  public HealthIndicator customHealthIndicator() {
    return () -> Health.up()
        .withDetail("status", "Application is running")
        .withDetail("timestamp", System.currentTimeMillis())
        .build();
  }
}
