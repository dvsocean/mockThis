package com.wiremockThis.wiremockThis.mockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.wiremockThis.wiremockThis.applicationImpl.ZportStation;
import com.wiremockThis.wiremockThis.nodes.Nodes;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class MockMvcForNodeController {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void shouldReturnNodeObject() throws Exception {
    MockHttpServletResponse res = mockMvc.perform(get("/findNode/Batman"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("name").value("Batman"))
        .andExpect(jsonPath("type").value("Superhero"))
        .andReturn().getResponse();

    System.out.println("Results --> " + res.getContentAsString());
  }
}
