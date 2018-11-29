package com.wiremockThis.wiremockThis.mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.wiremockThis.wiremockThis.applicationImpl.ZportStation;
import com.wiremockThis.wiremockThis.boards.Motherboard;
import com.wiremockThis.wiremockThis.nodes.Nodes;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

@RunWith(MockitoJUnitRunner.class)
public class MockitoTests {

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  private ZportStation station = new ZportStation();

  @InjectMocks
  private Nodes node;

  @InjectMocks
  private Nodes foundById = station.findNodeById(5);

  //partial mocking, real methods are invoked but still can be verified and stubbed
  @Spy
  private Nodes ifJSFound = station.validateNodeIfJavascriptEngineFound(node);

  //create mock
  @Mock
  private Motherboard motherboard;

  @Test
  public void addBoard() {
    assertTrue(station.addSingleNode(node));
  }

  @Test
  public void returnNameAndType() {
    when(node.getMotherboard().getNodeType()).thenReturn("XP-5400");
    when(node.getMotherboard().getNodeName()).thenReturn("CircuitBreaker");

    assertEquals("CircuitBreaker", node.getMotherboard().getNodeName());
    assertEquals("XP-5400", node.getMotherboard().getNodeType());
  }

  @Test
  public void fetchNodeById() {
    when(foundById.getMotherboard().getNodeName()).thenReturn("Superbad");
    assertEquals("Superbad", node.getMotherboard().getNodeName());
  }

  @Test
  public void returnTrueIfJavascriptEngineFound() {
    when(ifJSFound.isValid()).thenReturn(true);
    assertTrue(ifJSFound.isValid());
  }

}//End of class
