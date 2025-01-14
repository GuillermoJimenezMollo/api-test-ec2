package org.gjimenez.domain;

import org.gjimenez.domain.entity.CreateUser;
import org.gjimenez.infrasctructure.controller.model.CreateUserRequest;
import org.gjimenez.infrasctructure.port.SaveUserFromApiReqRestInGateway;
import org.springframework.stereotype.Service;

@Service
public class SaveUserUseCase {

  private final SaveUserFromApiReqRestInGateway saveUserFromApiReqRestInGateway;

  public SaveUserUseCase(SaveUserFromApiReqRestInGateway saveUserFromApiReqRestInGateway) {
    this.saveUserFromApiReqRestInGateway = saveUserFromApiReqRestInGateway;
  }

  public CreateUser execute(CreateUserRequest createUserRequest){
    return saveUserFromApiReqRestInGateway.save(createUserRequest);
  }
}
