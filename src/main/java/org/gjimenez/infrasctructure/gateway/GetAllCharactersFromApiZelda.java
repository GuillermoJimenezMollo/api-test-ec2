package org.gjimenez.infrasctructure.gateway;

import java.util.List;

import org.gjimenez.infrasctructure.gateway.model.Character;
import org.gjimenez.infrasctructure.gateway.model.DataCharacter;
import org.gjimenez.infrasctructure.gateway.model.DataGame;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class GetAllCharactersFromApiZelda {

  private final RestTemplate restTemplate;
  @Value("${url_api_zelda_characters}")
  private String url;

  public GetAllCharactersFromApiZelda(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  public List<Character> getCharacters(){
    DataCharacter dataCharacter = restTemplate.getForEntity(url, DataCharacter.class).getBody();
    return dataCharacter.getData();
  }

}
