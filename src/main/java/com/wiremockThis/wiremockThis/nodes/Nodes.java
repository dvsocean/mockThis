package com.wiremockThis.wiremockThis.nodes;

import com.wiremockThis.wiremockThis.boards.Motherboard;

public class Nodes extends NodeSelector {

  private int id = generateUniqueID();
  private String name = randomNodeNameSelector();
  private String color = randomNodeColorSelector();
  private String type = randomNodeTypeSelector();
  private String engine = randomNodeEngineSelector();

  private boolean isValid;

  public Motherboard motherboard;

  public Nodes(Motherboard motherboard) {
   this.motherboard = motherboard;

  }

  public Nodes(){
    //So mockito wont complain
  }

  public boolean isValid() {
    return isValid;
  }

  public void setValid(boolean valid) {
    isValid = valid;
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
