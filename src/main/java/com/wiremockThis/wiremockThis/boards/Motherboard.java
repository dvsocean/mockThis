package com.wiremockThis.wiremockThis.boards;

public class Motherboard {

    private String nodeName;
    private String nodeColor;
    private String nodeType;
    private String nodeEngine;

    public Motherboard(String name) {
        this.nodeName = name;
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
