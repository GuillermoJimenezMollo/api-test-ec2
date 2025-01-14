package org.gjimenez.infrasctructure.port;

import org.gjimenez.domain.entity.CreateUser;
import org.gjimenez.infrasctructure.controller.model.CreateUserRequest;


public interface SaveUserFromApiReqRestInGateway {

  CreateUser save(CreateUserRequest createUserRequest);
}
