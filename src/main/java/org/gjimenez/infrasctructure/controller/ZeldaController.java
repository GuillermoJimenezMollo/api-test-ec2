package org.gjimenez.infrasctructure.controller;

import java.util.List;

import org.gjimenez.domain.GetAllGamesWithCharactersUseCase;
import org.gjimenez.domain.entity.GameEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class ZeldaController {

  private final GetAllGamesWithCharactersUseCase useCase;

  public ZeldaController(GetAllGamesWithCharactersUseCase useCase) {
    this.useCase = useCase;
  }

  @GetMapping("/games")
  public List<GameEntity> getGamesWithCharacters(){
    return useCase.execute();
  }

}
