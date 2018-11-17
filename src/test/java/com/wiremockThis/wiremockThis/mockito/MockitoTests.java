package com.wiremockThis.wiremockThis.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.wiremockThis.wiremockThis.applicationImpl.ZportStation;
import com.wiremockThis.wiremockThis.boards.Motherboard;
import com.wiremockThis.wiremockThis.nodes.Nodes;
import com.wiremockThis.wiremockThis.service.SwitchStation;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

@RunWith(MockitoJUnitRunner.class)
public class MockitoTests {

  private SwitchStation station = new ZportStation();

  @InjectMocks
  private Nodes node;

  @Mock
  Motherboard motherboard;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  @Test
  public void addMotherboard() throws JsonProcessingException {
    station.addSingleNode(node);
    when(node.getMotherboard().getNodeName()).thenReturn("Charles");
    assertEquals("Charles", node.getMotherboard().getNodeName());
  }

  @Test
  public void locateMotherboard() {
    station.retrieveByMotherboardName("TechJunkie");
    when(node.getMotherboard().getNodeEngine()).thenReturn("TechJunkie");
    assertEquals("TechJunkie", node.getMotherboard().getNodeEngine());
  }
  
  //  @Test
//  public void findMotherboard() throws JsonProcessingException {
//    MockedNode node = new MockedNode(mock(LightHouseBoard.class));
//
//    when(node.getLightHouse().getName()).thenReturn("Charles");
//
//    assertEquals("Charles", node.getLightHouse().getName());
//  }

}//End of class
