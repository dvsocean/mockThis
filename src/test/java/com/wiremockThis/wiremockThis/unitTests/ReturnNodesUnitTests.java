package com.wiremockThis.wiremockThis.unitTests;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wiremockThis.wiremockThis.applicationImpl.ZportStation;
import com.wiremockThis.wiremockThis.boards.Motherboard;
import com.wiremockThis.wiremockThis.nodes.Nodes;
import com.wiremockThis.wiremockThis.service.SwitchStation;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class ReturnNodesUnitTests {

  private SwitchStation station = new ZportStation();

  @Test
  public void addNodeToBase(){
    Nodes node = new Nodes(1, new Motherboard("MSI"));
    Assert.assertTrue(station.addSingleNode(node));
  }

  @Test
  public void retrieveNodeByColor() {
    List<Nodes> nodesList = new ArrayList<>();
    nodesList.add(new Nodes(1, new Motherboard("Intel")));
    nodesList.add(new Nodes(2, new Motherboard("Sony")));
    nodesList.add(new Nodes(3, new Motherboard("AMD")));

    for(Nodes node: nodesList) {
      station.addSingleNode(node);
    }
    Assert.assertTrue(station.returnNodeColor());
  }

  @Test
  public void findMotherBoard() throws JsonProcessingException {
    station.addSingleNode(new Nodes(1, new Motherboard("Intel")));
    station.addSingleNode(new Nodes(2, new Motherboard("ASUS")));
    Nodes node = station.retrieveByMotherboardName("ASUS");

    ObjectMapper mapper = new ObjectMapper();
    String output = mapper.writeValueAsString(node);
    System.out.println("Results --> " + output);

    Assert.assertEquals("ASUS", node.getMotherboard().getNodeName());
  }

}//End of class
