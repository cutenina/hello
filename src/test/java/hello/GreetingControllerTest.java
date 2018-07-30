package hello;

import org.jboss.logging.Param;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
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
@WebMvcTest(GreetingController.class)

public class GreetingControllerTest {
    @Autowired
   private MockMvc mvc;

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