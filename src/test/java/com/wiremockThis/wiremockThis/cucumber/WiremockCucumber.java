package com.wiremockThis.wiremockThis.cucumber;

import static org.junit.Assert.assertEquals;

import com.wiremockThis.wiremockThis.boards.Motherboard;
import com.wiremockThis.wiremockThis.nodes.Nodes;
import com.wiremockThis.wiremockThis.wiremock.BaseWireMock;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class WiremockCucumber extends BaseWireMock {

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

  @Given("^a motherboard by the name of \"([^\"]*)\" has already been created$")
  public void a_motherboard_by_the_name_of_has_already_been_created(String arg1) throws Exception {
    wireMockRule.start();
    setupMockServer(arg1);

    Response res = confirmData();
    res.prettyPrint();

    wireMockRule.stop();
  }

  @When("^I create a board named \"([^\"]*)\"$")
  public void i_create_a_board_named(String name) {
    wireMockRule.start();
    setupMockServer(name);

    Response res = confirmData();
    res.prettyPrint();

    wireMockRule.stop();
  }

  @When("^I have a free node$")
  public void i_have_a_free_node() throws Exception {
    System.out.println("AND Clause passed!");
  }

  @Then("^I should still see available space$")
  public void i_should_still_see_available_space() throws Exception {
    station.addSingleNode(new Nodes(new Motherboard("Matrix75")));
    Nodes node = station.retrieveByMotherboardName("Matrix75");
    assertEquals("Matrix75", node.getMotherboard().getNodeName());
    System.out.println("Results of motherboard name --> " + node.getMotherboard().getNodeName());
  }
}
