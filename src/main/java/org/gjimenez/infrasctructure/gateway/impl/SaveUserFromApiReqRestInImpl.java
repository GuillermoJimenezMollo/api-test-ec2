package org.gjimenez.infrasctructure.gateway.impl;

import org.gjimenez.domain.entity.CreateUser;
import org.gjimenez.infrasctructure.controller.model.CreateUserRequest;
import org.gjimenez.infrasctructure.gateway.mapper.CreateUserModelToCreateUserMapper;
import org.gjimenez.infrasctructure.gateway.model.CreateUserModel;
import org.gjimenez.infrasctructure.port.SaveUserFromApiReqRestInGateway;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
@Repository
public class SaveUserFromApiReqRestInImpl implements SaveUserFromApiReqRestInGateway {

  private final RestTemplate restTemplate;

  private final CreateUserModelToCreateUserMapper mapper;

  @Value("${url_req_res_in}")
  private String url;

  public SaveUserFromApiReqRestInImpl(RestTemplate restTemplate, CreateUserModelToCreateUserMapper mapper) {
    this.restTemplate = restTemplate;
    this.mapper = mapper;
  }

  @Override
  public CreateUser save(CreateUserRequest createUser) {
    HttpHeaders headers = new HttpHeaders();
    headers.set("Content-Type", "application/json");

    ResponseEntity<CreateUserModel> response = restTemplate.postForEntity(url+"api/users", createUser, CreateUserModel.class);
    CreateUserModel createUserModel = response.getBody();
    return mapper.map(createUserModel);
  }
}
