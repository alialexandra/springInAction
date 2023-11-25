package com.example.demo;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@RunWith(SpringRunner.class)
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = { SpringTestConfiguration.class })
@WebMvcTest(HomeController.class)
public class HomeControllerTest {

    // inject mocks
    @Autowired // daca nu pun asta da NPE
    private MockMvc mockMvc;


    @Test
    public void testHomePage() throws Exception{
        mockMvc.perform(get("/home"))
                .andExpect(status().isOk())
                .andExpect(view().name("home"))

                .andExpect(content().string(containsString("Welcome to...")));
    }
}
