package com.wiremockThis.wiremockThis.boards;

public class Motherboard extends ChipsetInitializer {

    private String nodeName;
    private String nodeColor;
    private String nodeType;
    private String nodeEngine;
    private Chipset chipset = new Chipset(createNewIndexNode(), createNewIndexNode(), createChipsetFamily(), createNodeFamily(), createTags());

    public Motherboard(String name) {
        this.nodeName = name;
    }

    public Chipset getChipset() {
        return chipset;
    }

    public void setChipset(Chipset chipset) {
        this.chipset = chipset;
    }

    public String getNodeName() {
        return nodeName;
    }

    public String getNodeColor() {
        return nodeColor;
    }

    public void setNodeColor(String nodeColor) {
        this.nodeColor = nodeColor;
    }

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public String getNodeEngine() {
        return nodeEngine;
    }

    public void setNodeEngine(String nodeEngine) {
        this.nodeEngine = nodeEngine;
    }
}
