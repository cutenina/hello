package com.training.maikun.hello;

import org.springframework.web.bind.annotation.*;

/**
 * @author:Nina
 * @version:
 * @Project: springbootdemo
 * @Package: com.training.maikun.hello
 * @Description:
 * @Date date: 2018/8/1
 */
@RestController
public class FourMethodController {
    private static final String TEMPLATE="hi~";

    /**
     * @Author Nina
     * @Description 测试get请求
     * @Date: 16:59 2018/7/30
     * @Param  * @param name
     * @return java.lang.String
     */
    @GetMapping(value = "/sayhi")
    public String sayHello(@RequestParam(value = "name",defaultValue = "MyDream")String name){
        return TEMPLATE+name;
    }
    /**
     * @Author Nina
     * @Description 测试post请求
     * @Date: 21:32 2018/7/30
     * @Param  * @param name
     * @param password
     * @return java.lang.String
     */
    @PostMapping(value = "login")
    public String login(@RequestParam("account")String name,@RequestParam("password")String password){
        return "account:"+name+",password"+password;
    }
    /**
     * @Author Nina
     * @Description 测试put方法
     * @Date: 22:10 2018/7/30
     * @Param  * @param id
     * @return java.lang.String
     */
    @PutMapping("/put")
    public String myput(@RequestParam(value = "id")Integer id){
        return "id:"+id;
    }
    /**
     * @Author Nina
     * @Description 测试del方法
     * @Date: 22:10 2018/7/30
     * @Param  * @param id
     * @return java.lang.String
     */
    @DeleteMapping("/del")
    public String mydelete(@RequestParam(value = "id")Integer id){
        return "ninadeleteid:"+id;
    }

}
