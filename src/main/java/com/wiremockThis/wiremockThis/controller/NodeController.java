package com.wiremockThis.wiremockThis.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.wiremockThis.wiremockThis.applicationImpl.ZportStation;
import com.wiremockThis.wiremockThis.nodes.Nodes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NodeController {

  @Autowired
  private ZportStation zportStation;

  @RequestMapping(value = "/findNode/{name}")
  public Nodes findSingleNode(@PathVariable("name") String name) {
    return zportStation.retrieveByMotherboardName(name);
  }

  @RequestMapping(value = "/createNode/{name}")
  public Nodes createSingleNode(@PathVariable("name") String name) {
    zportStation.addNodeForMvcTest(name);
    return zportStation.retrieveByMotherboardName(name);
  }

  @RequestMapping(value = "/showAll")
  public List<Nodes> showAllNodes() {
    return zportStation.getNodesGarage();
  }

  /*
  To send object data using curl use this format
  curl -H "Content-Type: application/json" -d '{"engine":"SuperChargedJavaScript", "color":"Stripped and coiled"}' -X POST http://localhost:5050/updateNode/{name}
  or to be more explicit use..
  curl --header "Content-Type: application/json" --data '{"engine":"V55","color":"black and yellow"}' -X POST http://localhost:5050/updateNode/{name}
  below is the controller
  * */
  @PostMapping(value = "/updateNode/{name}")
  public Nodes updateNode(@PathVariable("name") String name, @RequestBody Nodes node){
    Nodes updatedNode = zportStation.retrieveByMotherboardName(name);
    updatedNode.setEngine(node.getEngine());
    updatedNode.setColor(node.getColor());
    return updatedNode;
  }

}//End of class
