package com.wiremockThis.wiremockThis.cucumber.nodePackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Node {

  @Given("^I have (\\d+) space for domestic node$")
  public void i_have_space_for_domestic_node(int arg1) throws Exception {
    System.out.println("RES --> space for --> " + arg1 + " node creation");
  }

  @When("^I issue command programaticaly$")
  public void i_issue_command_programaticaly() throws Exception {
    System.out.println("Command issued correctly");
  }

  @Then("^I should see (\\d+) element in station occupied$")
  public void i_should_see_element_in_station_occupied(int arg1) throws Exception {
    System.out.println("Station element has decreased by --> " + arg1 + " element");
  }

}//End of class
