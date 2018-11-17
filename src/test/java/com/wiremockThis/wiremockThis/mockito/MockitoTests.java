package com.wiremockThis.wiremockThis.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wiremockThis.wiremockThis.applicationImpl.ZportStation;
import com.wiremockThis.wiremockThis.boards.Motherboard;
import com.wiremockThis.wiremockThis.nodes.Nodes;
import com.wiremockThis.wiremockThis.service.SwitchStation;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import wiremock.com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import wiremock.com.fasterxml.jackson.annotation.PropertyAccessor;

public class MockitoTests {

  private SwitchStation station = new ZportStation();

//  @Mock
//  Motherboard motherboard;
//
//  @Rule
//  public MockitoRule mockitoRule = MockitoJUnit.rule();

  @Test
  public void findMotherboard() throws JsonProcessingException {
    Nodes node = mock(Nodes.class);
    when(node.getId()).thenReturn(3);
    assertEquals(node.getId(), 3);
  }
}
