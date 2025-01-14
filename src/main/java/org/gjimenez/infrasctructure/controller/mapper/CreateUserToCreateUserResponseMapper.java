package org.gjimenez.infrasctructure.controller.mapper;

import org.gjimenez.domain.entity.CreateUser;
import org.gjimenez.infrasctructure.controller.model.CreateUserResponse;
import org.springframework.stereotype.Component;

@Component
public class CreateUserToCreateUserResponseMapper {

  public CreateUserResponse map(CreateUser createUser) {
    CreateUserResponse createUserResponse = new CreateUserResponse();
    createUserResponse.setName(createUser.getName());
    createUserResponse.setJob(createUser.getJob());
    createUserResponse.setId(createUser.getId());
    return createUserResponse;
  }

}
