package com.wiremockThis.wiremockThis.cucumber.wiremockInCucumber.extraTools;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlMatching;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wiremockThis.wiremockThis.boards.Motherboard;
import com.wiremockThis.wiremockThis.nodes.Nodes;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class WiremockServerSetup {

  protected void setupMockServer(){
    Nodes node = new Nodes(new Motherboard("Express"));
    stubFor(get(urlMatching("/findExtraNodes"))
        .willReturn(aResponse()
            .withStatus(200)
            .withHeader("Content-Type", "application/json")
            .withBody(convertToJson(node))));
  }

  private String convertToJson(Nodes node){
    ObjectMapper mapper = new ObjectMapper();
    String json = "";
    try {
      json = mapper.writeValueAsString(node);
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }
    return json;
  }

  protected Response confirmData(){
    return RestAssured.given().when().get("/findExtraNodes");
  }

}
