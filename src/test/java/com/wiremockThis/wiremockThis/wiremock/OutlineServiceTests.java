package com.wiremockThis.wiremockThis.wiremock;


import static org.junit.Assert.assertEquals;

import com.wiremockThis.wiremockThis.applicationImpl.ZportStation;
import com.wiremockThis.wiremockThis.nodes.Nodes;
import io.restassured.response.Response;
import org.junit.Test;

public class OutlineServiceTests extends BaseWireMock {

  private ZportStation station = new ZportStation();

  @Test
  public void verify_creation(){
    setupMockServer("Express");
    Response res = confirmData();
    System.out.println("RES XXS QP/240--> " + res.prettyPrint());
  }

  @Test
  public void verifyDestruction(){
    System.out.println("Node destroyed!!");
  }

  @Test
  public void verifyUnitNodeCreation(){
    station.addSingleNode(new Nodes());
    assertEquals(1, station.getNodesGarage().size());
  }

}//End of class
