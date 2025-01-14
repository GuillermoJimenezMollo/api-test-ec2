package org.gjimenez.infrasctructure.gateway.impl;


import org.gjimenez.domain.entity.User;
import org.gjimenez.infrasctructure.gateway.mapper.UserModelToUserMapper;
import org.gjimenez.infrasctructure.gateway.model.DataUser;
import org.gjimenez.infrasctructure.gateway.model.UserModel;
import org.gjimenez.infrasctructure.port.GetUserFromApiReqResInGateway;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class GetUserFromApiReqResInImpl implements GetUserFromApiReqResInGateway {

  private final RestTemplate restTemplate;

  private final UserModelToUserMapper mapper;
  @Value("${url_req_res_in}")
  private String url;

  public GetUserFromApiReqResInImpl(RestTemplate restTemplate, UserModelToUserMapper mapper) {
    this.restTemplate = restTemplate;
    this.mapper = mapper;
  }

  @Override
  public User getUser(int id) {
    ResponseEntity<DataUser> forEntity = restTemplate.getForEntity(url + "api/users/" + id, DataUser.class);
    UserModel userModel = forEntity.getBody().getData();
    return mapper.map(userModel);
  }
}
