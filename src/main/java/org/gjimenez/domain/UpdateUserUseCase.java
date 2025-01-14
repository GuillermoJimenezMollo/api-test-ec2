package org.gjimenez.domain;

import org.gjimenez.domain.entity.UpdateUser;
import org.gjimenez.infrasctructure.controller.model.UpdateUserRequest;
import org.gjimenez.infrasctructure.gateway.impl.UpdateUserFromApiReqRestInImpl;
import org.springframework.stereotype.Service;

@Service
public class UpdateUserUseCase {
  private final UpdateUserFromApiReqRestInImpl updateUserFromApiReqRestIn;

  public UpdateUserUseCase(UpdateUserFromApiReqRestInImpl updateUserFromApiReqRestIn) {
    this.updateUserFromApiReqRestIn = updateUserFromApiReqRestIn;
  }

  public UpdateUser execute(int id, UpdateUserRequest updateUserRequest){
    return updateUserFromApiReqRestIn.update(id, updateUserRequest);

  }
}
