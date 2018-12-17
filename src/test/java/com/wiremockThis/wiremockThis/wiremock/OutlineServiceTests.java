package com.wiremockThis.wiremockThis.wiremock;


import io.restassured.response.Response;
import org.junit.Test;

public class OutlineServiceTests extends BaseWireMock {

  @Test
  public void verify_creation(){
    setupMockServer("Express");
    Response res = confirmData();
    System.out.println("RES XXS QP/240--> " + res.prettyPrint());
  }

}//End of class
