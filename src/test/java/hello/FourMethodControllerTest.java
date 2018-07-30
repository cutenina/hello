package hello;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author:Nina
 * @version:
 * @Project: springbootdemo
 * @Package: hello
 * @Description:
 * @Date date: 2018/7/30
 */
@RunWith(SpringRunner.class)
@WebMvcTest(FourMethodController.class)
public class FourMethodControllerTest {
    @Autowired
    private MockMvc mvc;

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
    public void myput() throws Exception {
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