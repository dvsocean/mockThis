package com.wiremockThis.wiremockThis.applicationImpl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wiremockThis.wiremockThis.boards.Motherboard;
import com.wiremockThis.wiremockThis.nodes.Nodes;
import com.wiremockThis.wiremockThis.service.SwitchStation;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class ZportStation implements SwitchStation {

  private List<Nodes> nodesGarage = new ArrayList<Nodes>();

  public Nodes findNodeById(int id) {
    for(Nodes node: nodesGarage) {
      if(node.getId() == id){
        return node;
      }
    }
    return null;
  }

  public boolean addSingleNode(Nodes node) {
    return nodesGarage.add(node);
  }

  public Nodes retrieveByMotherboardName(String name) {
    for(Nodes node : nodesGarage) {
      if(node.getMotherboard().getNodeName().equalsIgnoreCase(name)){
        return node;
      }
    }
    return null;
  }

  @Override
  public boolean returnNodeColor() {
    for(Nodes node : nodesGarage) {
      if(node.getColor().length() > 0){
        return true;
      }
    }
    return false;
  }

  @Override
  public void debugPrint() throws JsonProcessingException {
    ObjectMapper mapper = new ObjectMapper();
    for(Nodes node : nodesGarage) {
      System.out.println(mapper.writeValueAsString(node));
    }
  }

  public void addNodeForMvcTest(String name) {
    nodesGarage.add(new Nodes(1, new Motherboard(name)));
  }

  public Nodes validateNodeIfJavascriptEngineFound(Nodes toValidate){
    if(nodesGarage.size() > 0){
      for(Nodes node : nodesGarage) {
        if(node.getEngine().equalsIgnoreCase(toValidate.getEngine())){
          toValidate.setValid(true);
        }
      }
    }
    return toValidate;
  }

}//End of class
