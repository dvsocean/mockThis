package com.wiremockThis.wiremockThis.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.wiremockThis.wiremockThis.nodes.Nodes;

public interface SwitchStation {

  Nodes findNodeById(int id);

  boolean addSingleNode(Nodes node);

  Nodes retrieveByMotherboardName(String name);

  boolean returnNodeColor();

  void debugPrint() throws JsonProcessingException;

}//End of class
