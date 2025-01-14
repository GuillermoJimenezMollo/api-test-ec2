package org.gjimenez.infrasctructure.controller.mapper;

import org.gjimenez.domain.entity.User;
import org.gjimenez.infrasctructure.controller.model.UserResponse;
import org.springframework.stereotype.Component;

@Component
public class UserToUserResponseMapper {

  public UserResponse map (User user){
    UserResponse userResponse = new UserResponse();
    userResponse.setId(user.getId());
    userResponse.setFirstName(user.getFirstName());
    userResponse.setLastName(user.getLastName());
    userResponse.setAvatar(user.getAvatar());
    userResponse.setEmail(user.getEmail());
    return userResponse;
  }
}
