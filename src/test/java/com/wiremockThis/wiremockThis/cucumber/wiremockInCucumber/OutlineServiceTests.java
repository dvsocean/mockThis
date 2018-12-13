package com.wiremockThis.wiremockThis.cucumber.wiremockInCucumber;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.wiremockThis.wiremockThis.cucumber.wiremockInCucumber.extraTools.WiremockServerSetup;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Rule;

public class OutlineServiceTests extends WiremockServerSetup {


  @Rule
  public WireMockRule wireMockRule = new WireMockRule(8089);

  @Before
  public void setUp() throws Exception {
    RestAssured.baseURI = "http://localhost:8089";
    RestAssured.useRelaxedHTTPSValidation();
    given().when().get("/findExtraNodes").then().statusCode(200);
  }

  @Given("^I have element space inside of my array$")
  public void i_have_element_space_inside_of_my_array() throws Exception {
    System.out.println("I have available space bitches");
  }

  @When("^I create a board named \"([^\"]*)\"$")
  public void i_create_a_board_named(String arg1) throws Exception {
    setupMockServer();
    Response res = confirmData();
    res.then().body("motherboard.nodeName", equalTo("Express"));

    res.prettyPrint();

    System.out.println("RES --> " + arg1);
  }

  @Then("^I should still see available space$")
  public void i_should_still_see_available_space() throws Exception {
    System.out.println("I stil have room for more");
  }

}
