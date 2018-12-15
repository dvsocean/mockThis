//package com.wiremockThis.wiremockThis.wiremock;
//
//import com.github.tomakehurst.wiremock.junit.WireMockRule;
//import io.restassured.RestAssured;
//import io.restassured.response.Response;
//import org.junit.Before;
//import org.junit.Rule;
//import org.junit.Test;
//
//public class OutlineServiceTests extends BaseWireMock {
//
//  @Rule
//  private WireMockRule wireMockRule = new WireMockRule(5550);
//
//  @Before
//  public void setUp() throws Exception {
//    RestAssured.baseURI = "http://localhost:5550";
//  }
//
//  @Test
//  public void returnDataFromService() {
//    wireMockRule.start();
//    setupMockServer(wireMockRule, "Express");
//    Response res = confirmData();
//    //res.then().body("motherboard.nodeName", equalTo("Express"));
//
//    res.prettyPrint();
//
//    wireMockRule.stop();
//  }
//
//  @Test
//  public void returnTrueIfJSFound() {
////    setupMockServerForJSEngine();
////    Response res = confirmDataWhenJavascriptEngineFound();
////
////    res.prettyPrint();
////
////    res.then().body("valid", equalTo(true));
//  }
//
//}//End of class
