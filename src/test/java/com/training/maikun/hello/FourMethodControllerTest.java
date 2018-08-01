package com.training.maikun.hello;

import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
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
@WebMvcTest(FourMethodController.class)
public class FourMethodControllerTest {
    private static final String TEMPLATE="hi~";
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
     * @Description 测试get请求
     * @Date: 16:59 2018/7/30
     * @Param  * @param name
     * @return java.lang.String
     */

    @Test
    public void sayHello() throws Exception {
        this.mvc.perform(get("/sayhi")
                .contentType(MediaType.APPLICATION_JSON_UTF8).param("name","leenina")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(print())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(content().string(Matchers.containsString("leenina")));

    }

    @Test
    public void login() throws Exception{
        this.mvc.perform(post("/login")
                .contentType(MediaType.APPLICATION_JSON_UTF8).param("account","leenina")
                .param("password","123456")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(print())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(content().string(Matchers.containsString("leenina")));
    }

    @Test
    public void myput() throws Exception{
        this.mvc.perform(put("/put")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .param("id","123")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(print())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(content().string(Matchers.containsString("123")));
    }

    @Test
    public void mydelete() throws Exception{
        this.mvc.perform(delete("/del")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .param("id","123")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(print())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(content().string(Matchers.containsString("123")));
    }
}