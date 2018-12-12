package com.wiremockThis.wiremockThis.cucumber;

import static org.junit.Assert.assertEquals;

import com.wiremockThis.wiremockThis.WiremockThisApplicationTests;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CherniyBumer extends WiremockThisApplicationTests {

  @Given("^ya edu na mercedese$")
  public void ya_edu_na_mercedese() throws Exception {
    System.out.println("Given method works --> check");
  }

  @When("^ya razgonyaus bolshe chem (\\d+) mil v chas$")
  public void ya_razgonyaus_bolshe_chem_mil_v_chas(int arg1) throws Exception {
    assertEquals(100, arg1);
  }

  @Then("^moi krilya opuskautsa$")
  public void moi_krilya_opuskautsa() throws Exception {
    System.out.println("Then method works --> check");
  }

}//End of class
