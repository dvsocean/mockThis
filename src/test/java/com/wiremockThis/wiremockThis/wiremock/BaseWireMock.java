package com.wiremockThis.wiremockThis.wiremock;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlMatching;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.wiremockThis.wiremockThis.applicationImpl.ZportStation;
import com.wiremockThis.wiremockThis.boards.Motherboard;
import com.wiremockThis.wiremockThis.nodes.Nodes;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Rule;

public class BaseWireMock {

  protected ZportStation station = new ZportStation();

  protected Response confirmData(){
    return RestAssured.given().when().get("/findExtraNodes");
  }

  protected Response confirmDataWhenJavascriptEngineFound(){
    return RestAssured.given().when().post("/lookForJs");
  }

  protected void setupMockServerForJSEngine(WireMockRule rule){
    Nodes node1 = new Nodes(new Motherboard("Express2"));
    node1.setEngine("Javascript");
    Nodes node2 = new Nodes(new Motherboard("FlyIntel"));
    station.addSingleNode(node1);

    Nodes validatedNode = station.validateNodeIfJavascriptEngineFound(node2);

    rule.stubFor(post(urlMatching("/lookForJs"))
        .willReturn(aResponse()
            .withStatus(200)
            .withHeader("Content-Type", "application/json")
            .withBody(convertToJson(validatedNode))));
  }

  protected void setupMockServer(WireMockRule rule, String name){
    Nodes node = new Nodes(new Motherboard(name));
    rule.stubFor(get(urlMatching("/findExtraNodes"))
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

}//End of class
