package com.wiremockThis.wiremockThis.controller;

import com.wiremockThis.wiremockThis.applicationImpl.ZportStation;
import com.wiremockThis.wiremockThis.nodes.Nodes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NodeController {

  @Autowired
  private ZportStation zportStation;

  @RequestMapping(value = "/findNode/{name}")
  public Nodes findSingleNode(@PathVariable("name") String name){
    Nodes node = new Nodes("Batman", "Black", "Superhero", "NA");
    zportStation.addSingleNode(node);
    return zportStation.retrieveNode(name);
  }

}//End of class
