package com.training.maikun.hello;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author:Nina
 * @version:
 * @Project: springbootdemo
 * @Package: com.training.maikun.hello
 * @Description:
 * @Date date: 2018/8/1
 */
@RunWith(SpringRunner.class)
@WebMvcTest(GreetingController.class)
public class GreetingControllerTest {
    @Autowired
    private MockMvc mvc;


    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * @Author Nina
     * @Description //TODO
     * @Date: 14:12 2018/7/30
     * @Param  * @param null
     */
    @Test
    public void greeting() throws Exception{
        this.mvc.perform(get("/greeting").param("name","Test").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

    }
}