package org.gjimenez.infrasctructure.controller.mapper;

import org.gjimenez.domain.entity.UpdateUser;
import org.gjimenez.infrasctructure.controller.model.UpdateUserResponse;
import org.springframework.stereotype.Component;

@Component
public class UpdateUserToUpdateUserResponseMapper {
  public UpdateUserResponse map(UpdateUser updateUser){
    UpdateUserResponse updateUserResponse = new UpdateUserResponse();
    updateUserResponse.setName(updateUser.getName());
    updateUserResponse.setJob(updateUser.getJob());
    updateUserResponse.setUpdatedAt(updateUser.getUpdatedAt());
    return updateUserResponse;
  }
}
