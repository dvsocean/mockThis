package com.wiremockThis.wiremockThis.nodes;

import com.wiremockThis.wiremockThis.boards.Motherboard;

public class Nodes {

  private String name;
  private String color;
  private String type;
  private String engine;
  private Motherboard motherboard = new Motherboard(45, "Sabertooth");

  public Nodes(String name, String color, String type, String engine) {
    this.name = name;
    this.color = color;
    this.type = type;
    this.engine = engine;
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

  public void setName(String name) {
    this.name = name;
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
