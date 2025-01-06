package org.gjimenez.domain;

import org.gjimenez.domain.entity.CharacterDto;
import org.gjimenez.domain.entity.GameEntity;
import org.gjimenez.domain.mapper.MapperGamesToGameDto;
import org.gjimenez.infrasctructure.gateway.GetAllCharactersFromApiZelda;
import org.gjimenez.infrasctructure.gateway.model.Character;
import org.gjimenez.infrasctructure.gateway.model.Game;
import org.gjimenez.infrasctructure.port.GetAllGamesGateway;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GetAllGamesWithCharactersUseCase {

    private final GetAllGamesGateway gatewayGames;
    private final GetAllCharactersFromApiZelda gatewayCharacters;

    private final MapperGamesToGameDto mapper;

    public GetAllGamesWithCharactersUseCase(GetAllGamesGateway gatewayGames,
                                            GetAllCharactersFromApiZelda gatewayCharacters, MapperGamesToGameDto mapper) {
        this.gatewayGames = gatewayGames;
        this.gatewayCharacters = gatewayCharacters;
        this.mapper = mapper;
    }
    public List<GameEntity> execute(){

        List<Game> games = gatewayGames.getGames();
        List<Character> characters = gatewayCharacters.getCharacters();
        return mapper.map(games,characters);

    }
}
