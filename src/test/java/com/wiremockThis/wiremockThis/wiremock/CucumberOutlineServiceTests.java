package com.wiremockThis.wiremockThis.wiremock;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.urlMatching;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.wiremockThis.wiremockThis.boards.Motherboard;
import com.wiremockThis.wiremockThis.nodes.Nodes;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Rule;
import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock;

@AutoConfigureWireMock(port = 5050)
public class CucumberOutlineServiceTests extends BaseWireMock {

  @Rule
  public WireMockRule wireMockRule = new WireMockRule(5050);


  @Given("^I have element space inside of my array$")
  public void i_have_element_space_inside_of_my_array() throws Exception {

  }

  @When("^I create a board named$")
  public void i_create_a_board_named() throws Exception {
    Nodes node = new Nodes(new Motherboard("Express"));
    wireMockRule.stubFor(get(urlMatching("/findExtraNodes"))
        .willReturn(aResponse()
            .withStatus(200)
            .withHeader("Content-Type", "application/json")
            .withBody(convertToJson(node))));

//    setupMockServer();
//    Response res = confirmData();
//    res.then().body("motherboard.nodeName", equalTo("Express"));
  }

  @Then("^I should still see available space$")
  public void i_should_still_see_available_space() throws Exception {

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

}
