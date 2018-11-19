package com.wiremockThis.wiremockThis.nodes;

import com.wiremockThis.wiremockThis.boards.LightHouseBoard;

public class MockedNode {

  private int id;
  private LightHouseBoard lightHouse;

  public MockedNode(LightHouseBoard lightHouse) {
    this.lightHouse = lightHouse;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public LightHouseBoard getLightHouse() {
    return lightHouse;
  }

}//End of class
