package com.wiremockThis.wiremockThis.boards;

import java.util.ArrayList;
import java.util.List;

public class ChipsetInitializer {

  protected int createNewIndexNode(){
    int[] nameCollections = new int[]{
       34, 87, 567, 238, 4, 8766, 232, 21, 9, 15, 12, 44, 346, 81
    };

    int index = (int) (Math.random() * nameCollections.length);
    return nameCollections[index];
  }

  protected String[] createChipsetFamily(){
    String[] storage = new String[5];
    for (int i = 0; i < storage.length - 1; i++) {
      storage[i] = "Chipset Family --> " + createListItem();
    }
    return storage;
  }

  protected List<String> createTags(){
    List<String> storage = new ArrayList<>();
    storage.add(generateNewTag());
    storage.add(generateNewTag());
    storage.add(generateNewTag());
    storage.add(generateNewTag());
    storage.add(generateNewTag());
    storage.add(generateNewTag());
    storage.add(generateNewTag());
    return storage;
  }

  private String generateNewTag(){
    String[] nameCollections = new String[]{
        "GoogleEngine", "Angular", "React V3", "Fallout", "Cross domain protect", "InterException"
    };

    int index = (int) (Math.random() * nameCollections.length);
    return nameCollections[index];
  }

  private String createListItem(){
    String[] nameCollections = new String[]{
        "Hardliner", "SeriesFifteen", "XXS Scripting protection", "Thread protection",
        "MultiLine Support", "BreakPoint extraction", "NodeFinder", "NodeCounter"
    };

    int index = (int) (Math.random() * nameCollections.length);
    return nameCollections[index];
  }

  protected int[] createNodeFamily(){
    int[] storage = new int[8];
    for (int i = 0; i < storage.length - 1; i++) {
      storage[i] = createNewIndexNode();
    }
    return storage;
  }

}//End of class
