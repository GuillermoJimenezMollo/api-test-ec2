package org.gjimenez.infrasctructure.gateway;

import java.util.List;

import org.gjimenez.infrasctructure.gateway.model.DataGame;
import org.gjimenez.infrasctructure.gateway.model.Game;
import org.gjimenez.infrasctructure.port.GetAllGamesGateway;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class GetAllGamesFromApiZeldaV2 implements GetAllGamesGateway {

  private final RestTemplate restTemplate;
  @Value("${url_api_zelda_games_v2}")
  private String url;

  public GetAllGamesFromApiZeldaV2(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }
  @Override
  public List<Game> getGames() {

    DataGame dataGame = restTemplate.getForEntity(url, DataGame.class).getBody();
    return dataGame.getData();
  }

}
