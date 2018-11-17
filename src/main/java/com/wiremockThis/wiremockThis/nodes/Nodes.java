package com.wiremockThis.wiremockThis.nodes;

import com.wiremockThis.wiremockThis.boards.Motherboard;

public class Nodes extends NodeSelector {

  private int id;
  private String name = randomNodeNameSelector();
  private String color = randomNodeColorSelector();
  private String type = randomNodeTypeSelector();
  private String engine = randomNodeEngineSelector();
  public Motherboard motherboard;

  public Nodes(int id, Motherboard motherboard) {
    this.id = id;
   this.motherboard = motherboard;

  }

  public Nodes(){
    //So mockito wont complain
  }

  public int getId() {
    return id;
  }

  public Motherboard getMotherboard() {
    return motherboard;
  }

  public void setMotherboard(Motherboard motherboard) {
    this.motherboard = motherboard;
  }

  public String getName() {
    return name;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }
}
