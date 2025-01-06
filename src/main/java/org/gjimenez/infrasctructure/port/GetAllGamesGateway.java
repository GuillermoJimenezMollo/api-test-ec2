package org.gjimenez.infrasctructure.port;

import java.util.List;

import org.gjimenez.infrasctructure.gateway.model.Game;

public interface GetAllGamesGateway {

    List<Game> getGames();
}
