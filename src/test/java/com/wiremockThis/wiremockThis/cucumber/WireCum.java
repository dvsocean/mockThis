package com.wiremockThis.wiremockThis.cucumber;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.wiremockThis.wiremockThis.boards.Motherboard;
import com.wiremockThis.wiremockThis.nodes.Nodes;
import com.wiremockThis.wiremockThis.wiremock.BaseWireMock;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Rule;

public class WireCum extends BaseWireMock {

  @Rule
  private WireMockRule wireMockRule = new WireMockRule(5550);

  @Before
  public void setup(){
    RestAssured.baseURI = "http://localhost:5550";
  }

  @Given("^I have element space inside of my array$")
  public void i_have_element_space_inside_of_my_array() throws Exception {
    station.addSingleNode(new Nodes(new Motherboard("Johnson")));
    for(Nodes node: station.getNodesGarage()){
      System.out.println("Res --> " + node.getMotherboard().getNodeName());
    }
  }

  @When("^I create a board named \"([^\"]*)\"$")
  public void i_create_a_board_named(String name) throws Exception {
    wireMockRule.start();
    setupMockServer(wireMockRule, name);

    Response res = confirmData();
    res.prettyPrint();

    wireMockRule.stop();
  }

  @Then("^I should still see available space$")
  public void i_should_still_see_available_space() throws Exception {

  }
}
