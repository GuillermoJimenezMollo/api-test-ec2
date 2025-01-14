package org.gjimenez.infrasctructure.gateway.mapper;

import org.gjimenez.domain.entity.CreateUser;
import org.gjimenez.infrasctructure.gateway.model.CreateUserModel;
import org.springframework.stereotype.Component;

@Component
public class CreateUserModelToCreateUserMapper {

  public CreateUser map(CreateUserModel createUserModel) {
    CreateUser createUser = new CreateUser();
    createUser.setId(createUserModel.getId());
    createUser.setName(createUserModel.getName());
    createUser.setJob(createUserModel.getJob());
    return createUser;
  }


}
