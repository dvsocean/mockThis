package com.wiremockThis.wiremockThis.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class XolodniySever {

  @Given("^ya sazhus na poezd$")
  public void ya_sazhus_na_poezd() throws Exception {
    System.out.println("Steps def 2 Given method passed");
  }

  @When("^ya edu (\\d+) dney na zapalyriyu$")
  public void ya_edu_dney_na_zapalyriyu(int arg1) throws Exception {
    System.out.println("Steps def 2 When method passed arg1 --> " + arg1);
  }

  @Then("^ya priezhau na xolodniy kray$")
  public void ya_priezhau_na_xolodniy_kray() throws Exception {
    System.out.println("Steps def 2 Then method passed");
  }

}//End of class
