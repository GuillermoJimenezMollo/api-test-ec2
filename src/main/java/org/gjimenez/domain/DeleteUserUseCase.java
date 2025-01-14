package org.gjimenez.domain;

import org.gjimenez.infrasctructure.port.DeleteUserFormApiReqResIn;
import org.springframework.stereotype.Service;

@Service
public class DeleteUserUseCase {

  private final DeleteUserFormApiReqResIn deleteUserFormApiReqResIn;

  public DeleteUserUseCase(DeleteUserFormApiReqResIn deleteUserFormApiReqResIn) {
    this.deleteUserFormApiReqResIn = deleteUserFormApiReqResIn;
  }

  public void execute(int id){
    deleteUserFormApiReqResIn.delete(id);
  }
}
