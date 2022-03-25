package com.tks.demo.springwebdemo.controller;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IndexControllerIT {

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    private TestRestTemplate restTemplate;

    private MockMvc mockMvc;

    @Test
    public void verifyGreetPageLoads(){
        String forObject = this.restTemplate.getForObject("/greet",String.class);
        System.out.print(forObject);
        assertTrue(forObject.contains("Hello, World"));
    }

    @Test
    public void verifyViewReturnedWithAttribute() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
        this.mockMvc.perform(MockMvcRequestBuilders.get("/greet").param("name", "Tech-Know-School"))
                .andExpect(MockMvcResultMatchers.view().name("greeting"))
                .andExpect(MockMvcResultMatchers.model().attribute("messageName", "Tech-Know-School"));
    }
}

