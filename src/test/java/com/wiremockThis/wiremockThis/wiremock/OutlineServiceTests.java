package com.wiremockThis.wiremockThis.wiremock;

import static org.hamcrest.Matchers.equalTo;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class OutlineServiceTests extends BaseWireMock {

  @Rule
  public WireMockRule wireMockRule = new WireMockRule(8089);

  @Before
  public void setUp() throws Exception {
    RestAssured.baseURI = "http://localhost:8089";
  }

  @Test
  public void returnDataFromService() {
    setupMockServer();
    Response res = confirmData();
    res.then().body("motherboard.nodeName", equalTo("Express"));

    res.prettyPrint();
  }

}//End of class
