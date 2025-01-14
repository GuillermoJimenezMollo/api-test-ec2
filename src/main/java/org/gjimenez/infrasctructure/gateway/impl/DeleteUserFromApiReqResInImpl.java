package org.gjimenez.infrasctructure.gateway.impl;

import org.gjimenez.infrasctructure.gateway.model.UpdateUserModel;
import org.gjimenez.infrasctructure.port.DeleteUserFormApiReqResIn;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class DeleteUserFromApiReqResInImpl implements DeleteUserFormApiReqResIn {

  private final RestTemplate restTemplate;

  @Value("${url_req_res_in}")
  private String url;

  public DeleteUserFromApiReqResInImpl(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }
  @Override
  public void delete(int id){
    HttpHeaders headers = new HttpHeaders();
    headers.set("Authorization", "Bearer your-token"); // Si es necesario
    HttpEntity<Void> requestEntity = new HttpEntity<>(headers);
    restTemplate.exchange(url + "api/users/" + id,
        HttpMethod.DELETE,
        requestEntity,
        Void.class);
  }
}
