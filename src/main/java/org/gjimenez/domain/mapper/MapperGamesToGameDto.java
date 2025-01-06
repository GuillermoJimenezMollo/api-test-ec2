package org.gjimenez.domain.mapper;

import org.gjimenez.domain.entity.CharacterDto;
import org.gjimenez.domain.entity.GameEntity;
import org.gjimenez.infrasctructure.gateway.model.Character;
import org.gjimenez.infrasctructure.gateway.model.Game;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class MapperGamesToGameDto {

    public List<GameEntity> map( List<Game> games, List<Character> characters){
        List<GameEntity> gamesList = new ArrayList<>();

        for (Game game : games) {
            List<CharacterDto> characterDtoList = new ArrayList<>();
            for( Character character : characters ){

                boolean isAppearance = Arrays.asList(character.getAppearances()).stream()
                    .filter(x -> x.contains(game.getId()))
                    .findFirst()
                    .isPresent();
                if(isAppearance) {
                    CharacterDto characterDto = new CharacterDto();
                    characterDto.setId(character.getId());
                    characterDto.setName(character.getName());
                    characterDto.setGender(character.getGender());
                    characterDto.setRace(character.getRace());
                    characterDtoList.add(characterDto);
                }
            }
            GameEntity gameDto = new GameEntity();
            gameDto.setId(game.getId());
            gameDto.setName(game.getName());
            gameDto.setDescription(game.getDescription());
            gameDto.setReleasedDate(game.getReleased_date());
            gameDto.setCharacters(characterDtoList);
            gamesList.add(gameDto);
        }
        return gamesList;
    }
}
