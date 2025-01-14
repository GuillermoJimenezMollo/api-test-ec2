package org.gjimenez.infrasctructure.gateway.mapper;

import org.gjimenez.domain.entity.UpdateUser;
import org.gjimenez.infrasctructure.gateway.model.UpdateUserModel;
import org.springframework.stereotype.Component;

@Component
public class UpdateUserModelToUpdateUserMapper {
  public UpdateUser map(UpdateUserModel updateUserModel){
    UpdateUser updateUser = new UpdateUser();
    updateUser.setName(updateUserModel.getName());
    updateUser.setJob(updateUserModel.getJob());
    updateUser.setUpdatedAt(updateUserModel.getUpdatedAt());
    return updateUser;
  }

}
