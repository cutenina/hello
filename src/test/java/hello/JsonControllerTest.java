package hello;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;

/**
 * @author:Nina
 * @version:
 * @Project: springbootdemo
 * @Package: hello
 * @Description:
 * @Date date: 2018/7/31
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class JsonControllerTest {
    private MockMvc mvc;

    @Before
    public void setUp() throws Exception {
        mvc= MockMvcBuilders.standaloneSetup(new JsonController()).build();
    }

    @After
    public void tearDown() throws Exception {
    }
    /**
     * @Author Nina
     * @Description 测试返回的json数据
     * @Date: 22:04 2018/7/31
     * @Param  * @param
     * @return void
     */
    @Test
    public void msg() throws Exception {

        mvc.perform(MockMvcRequestBuilders.get("/list")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }
}