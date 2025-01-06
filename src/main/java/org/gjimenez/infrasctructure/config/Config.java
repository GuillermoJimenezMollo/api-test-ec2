package org.gjimenez.infrasctructure.config;

import org.gjimenez.infrasctructure.gateway.GetAllGamesFromApiZelda;
import org.gjimenez.infrasctructure.gateway.GetAllGamesFromApiZeldaV2;
import org.gjimenez.infrasctructure.port.GetAllGamesGateway;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Primary
    @Bean
    public GetAllGamesGateway getAllGamesGateway(RestTemplate restTemplate){
        return new GetAllGamesFromApiZelda(restTemplate);
    }


}
