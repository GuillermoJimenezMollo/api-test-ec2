package org.gjimenez.infrasctructure.gateway.mapper;

import org.gjimenez.domain.entity.User;
import org.gjimenez.infrasctructure.gateway.model.UserModel;
import org.springframework.stereotype.Component;

@Component
public class UserModelToUserMapper {

  public User map (UserModel userModel){
    User user = new User();
    user.setId(userModel.getId());
    user.setFirstName(userModel.getFirstName());
    user.setLastName(userModel.getLastName());
    user.setAvatar(userModel.getAvatar());
    user.setEmail(userModel.getEmail());
    return user;
  }

}
