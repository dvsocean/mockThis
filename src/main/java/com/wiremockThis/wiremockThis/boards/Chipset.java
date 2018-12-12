package com.wiremockThis.wiremockThis.boards;

import java.util.List;

public class Chipset {

  private int modelNumber;
  private int nodeCount;
  private String[] chipsetFamily;
  private List<String> tags;
  private int[] nodeFamily;

  public Chipset(int modelNumber, int nodeCount, String[] chipsetFamily, int[] nodeFamily, List<String> tags) {
    this.modelNumber = modelNumber;
    this.nodeCount = nodeCount;
    this.chipsetFamily = chipsetFamily;
    this.tags = tags;
    this. nodeFamily = nodeFamily;
  }

  public int getModelNumber() {
    return modelNumber;
  }

  public int getNodeCount() {
    return nodeCount;
  }

  public String[] getChipsetFamily() {
    return chipsetFamily;
  }

  public List<String> getTags() {
    return tags;
  }

  public int[] getNodeFamily() {
    return nodeFamily;
  }

}//End of class
