package com.wiremockThis.wiremockThis.nodes;

import java.util.Random;

public class NodeSelector {

  protected String randomNodeNameSelector(){
    Random random = new Random();
    String[] storage = {"ASUS", "Intel", "AMD", "Sony",
                        "MSI", "Sabertooth", "ACER", "TeslaBoards",
                        "FireBase", "ElectricCircuit", "Jasmine",
                        "MatrixBoards", "FirstNationComponents"};
    int index = random.nextInt(storage.length);
    return storage[index];
  }

  protected String randomNodeColorSelector(){
    Random random = new Random();
    String[] storage = {"Red", "Green", "Blue", "Cyan",
                        "Magenta", "Navy Blue", "Yellow",
                        "Black", "Indigo", "White", "Purple",
                        "Orange", "Pink", "Sky Blue", "Cream"};
    int index = random.nextInt(storage.length);
    return storage[index];
  }

  protected String randomNodeTypeSelector(){
    Random random = new Random();
    String[] storage = {"HeavyDuty", "LightWeight", "HorsePower", "Agile"};
    int index = random.nextInt(storage.length);
    return storage[index];
  }

  protected String randomNodeEngineSelector(){
    Random random = new Random();
    String[] storage = {"Javascript", "Javascript", "Javascript", "Javascript"};
    int index = random.nextInt(storage.length);
    return storage[index];
  }

  protected int generateUniqueID(){
    int[] namesArray = new int[500];
    int index = (int) (Math.random() * namesArray.length);

    for (int i = 0; i < namesArray.length - 1; i++) {
      namesArray[i] = index;
    }
    return namesArray[index];
  }

}//End of class
