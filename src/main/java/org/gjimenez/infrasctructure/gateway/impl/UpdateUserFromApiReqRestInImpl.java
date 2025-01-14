package org.gjimenez.infrasctructure.gateway.impl;

import java.util.HashMap;
import java.util.Map;

import org.gjimenez.domain.entity.UpdateUser;
import org.gjimenez.infrasctructure.controller.model.UpdateUserRequest;
import org.gjimenez.infrasctructure.gateway.mapper.CreateUserModelToCreateUserMapper;
import org.gjimenez.infrasctructure.gateway.mapper.UpdateUserModelToUpdateUserMapper;
import org.gjimenez.infrasctructure.gateway.model.UpdateUserModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
@Repository
public class UpdateUserFromApiReqRestInImpl {

  private final RestTemplate restTemplate;

  private final UpdateUserModelToUpdateUserMapper mapper;

  @Value("${url_req_res_in}")
  private String url;

  public UpdateUserFromApiReqRestInImpl(RestTemplate restTemplate, CreateUserModelToCreateUserMapper mapper,
                                        UpdateUserModelToUpdateUserMapper mapper1) {
    this.restTemplate = restTemplate;
    this.mapper = mapper1;
  }

  public UpdateUser update(int id, UpdateUserRequest updateUserRequest){
    Map<String, String> uriVariables = new HashMap<>();
    HttpHeaders headers = new HttpHeaders();
    headers.set("Content-Type", "application/json");
    HttpEntity<UpdateUserRequest> requestEntity = new HttpEntity<>(updateUserRequest, headers);

    uriVariables.put("id", "2");
    ResponseEntity<UpdateUserModel> responseEntity = restTemplate.exchange(url + "api/users/" + id,
        HttpMethod.PUT,
        requestEntity,
        UpdateUserModel.class);
    return mapper.map(responseEntity.getBody());

  }

}
