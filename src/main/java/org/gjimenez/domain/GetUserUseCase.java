package org.gjimenez.domain;

import org.gjimenez.domain.entity.User;
import org.gjimenez.infrasctructure.port.GetUserFromApiReqResInGateway;
import org.springframework.stereotype.Service;

@Service
public class GetUserUseCase {

  private final GetUserFromApiReqResInGateway getUserFromApiReqResIn;

  public GetUserUseCase(GetUserFromApiReqResInGateway getUserFromApiReqResIn) {
    this.getUserFromApiReqResIn = getUserFromApiReqResIn;
  }


  public User execute(int id){

    return getUserFromApiReqResIn.getUser(id);
  }
}
