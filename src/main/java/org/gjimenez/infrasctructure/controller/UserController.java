package org.gjimenez.infrasctructure.controller;

import org.gjimenez.domain.DeleteUserUseCase;
import org.gjimenez.domain.GetUserUseCase;
import org.gjimenez.domain.SaveUserUseCase;
import org.gjimenez.domain.UpdateUserUseCase;
import org.gjimenez.domain.entity.CreateUser;
import org.gjimenez.infrasctructure.controller.mapper.CreateUserToCreateUserResponseMapper;
import org.gjimenez.infrasctructure.controller.mapper.UpdateUserToUpdateUserResponseMapper;
import org.gjimenez.infrasctructure.controller.mapper.UserToUserResponseMapper;
import org.gjimenez.infrasctructure.controller.model.CreateUserRequest;
import org.gjimenez.infrasctructure.controller.model.CreateUserResponse;
import org.gjimenez.infrasctructure.controller.model.UpdateUserRequest;
import org.gjimenez.infrasctructure.controller.model.UpdateUserResponse;
import org.gjimenez.infrasctructure.controller.model.UserResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class UserController {

  private final GetUserUseCase getUserUseCase;
  private final SaveUserUseCase saveUserUseCase;
  private final UserToUserResponseMapper userToUserResponseMapper;
  private final CreateUserToCreateUserResponseMapper createUserToCreateUserResponseMapper;
  private final UpdateUserToUpdateUserResponseMapper updateUserToUpdateUserResponseMapper;
  private final UpdateUserUseCase updateUserUseCase;

  private final DeleteUserUseCase deleteUserUseCase;
  public UserController(GetUserUseCase getUserUseCase, SaveUserUseCase saveUserUseCase, UserToUserResponseMapper userToUserResponseMapper,
                        CreateUserToCreateUserResponseMapper createUserToCreateUserResponseMapper,
                        UpdateUserToUpdateUserResponseMapper updateUserToUpdateUserResponseMapper, UpdateUserUseCase updateUserUseCase,
                        DeleteUserUseCase deleteUserUseCase) {
    this.getUserUseCase = getUserUseCase;
    this.saveUserUseCase = saveUserUseCase;
    this.userToUserResponseMapper = userToUserResponseMapper;
    this.createUserToCreateUserResponseMapper = createUserToCreateUserResponseMapper;
    this.updateUserToUpdateUserResponseMapper = updateUserToUpdateUserResponseMapper;
    this.updateUserUseCase = updateUserUseCase;
    this.deleteUserUseCase = deleteUserUseCase;
  }


  @GetMapping("/users/{id}")
  public UserResponse getUser(@PathVariable int id){
    return userToUserResponseMapper.map(getUserUseCase.execute(id));
  }

  @PostMapping("/users")
  public CreateUserResponse save(@RequestBody CreateUserRequest createUserRequest){
    CreateUser createUser = saveUserUseCase.execute(createUserRequest);
    return createUserToCreateUserResponseMapper.map(createUser);
  }
  @PutMapping("/users/{id}")
  public UpdateUserResponse save(@PathVariable int id, @RequestBody UpdateUserRequest updateUserRequest){
    return updateUserToUpdateUserResponseMapper.map(updateUserUseCase.execute(id, updateUserRequest));
  }
  @DeleteMapping("/users/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void delete(@PathVariable int id){
    deleteUserUseCase.execute(id);
  }

}
