package com.wiremockThis.wiremockThis.applicationImpl;

import com.wiremockThis.wiremockThis.nodes.Nodes;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class ZportStation {

  private List<Nodes> nodesGarage = new ArrayList<Nodes>();

  public String findElementByColor(String color) {
    for(Nodes node: nodesGarage) {
      if(node.getColor().equalsIgnoreCase(color)){
        return node.getColor();
      }
    }
    return null;
  }

  public boolean addSingleNode(Nodes node) {
    return nodesGarage.add(node);
  }

  public Nodes retrieveNode(String name) {
    for(Nodes node: nodesGarage) {
      if(node.getName().equalsIgnoreCase(name)){
        return node;
      }
    }
    return null;
  }

}//End of class
