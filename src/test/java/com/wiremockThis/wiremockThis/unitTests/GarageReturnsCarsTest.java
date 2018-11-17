package com.wiremockThis.wiremockThis.unitTests;

import com.wiremockThis.wiremockThis.applicationImpl.ZportStation;
import com.wiremockThis.wiremockThis.nodes.Nodes;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class GarageReturnsCarsTest {

  private ZportStation station = new ZportStation();

  @Test
  public void addNodeToGarage(){
    Nodes node = new Nodes("Panther","Black", "digital", "java");
    Assert.assertTrue(station.addSingleNode(node));
  }

  @Test
  public void retrieveNodeByColor() {
    List<Nodes> nodesList = new ArrayList<>();
    nodesList.add(new Nodes("Scarlet","Red", "hifi", "js"));
    nodesList.add(new Nodes("Nerd","Black", "digital", "ruby"));
    nodesList.add(new Nodes("Bee","Yellow", "tech", "nodeJS"));

    for(Nodes node: nodesList) {
      station.addSingleNode(node);
    }
    Assert.assertEquals("Black", station.findElementByColor("Black"));
  }

  @Test
  public void findNode() {
    station.addSingleNode(new Nodes("Titan", "Grey", "Fighter", "V12"));
    station.addSingleNode(new Nodes("BeachBum", "Silver", "Surf", "i4"));
    Nodes node = station.retrieveNode("Titan");
    Assert.assertEquals("Titan", node.getName());
  }

}//End of class
