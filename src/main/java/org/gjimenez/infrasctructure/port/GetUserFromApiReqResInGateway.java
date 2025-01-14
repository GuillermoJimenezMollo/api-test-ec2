package org.gjimenez.infrasctructure.port;

import org.gjimenez.domain.entity.User;

public interface GetUserFromApiReqResInGateway {

    public User getUser(int id);
}
