package com.training.maikun.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:Nina
 * @version:
 * @Project: springbootdemo
 * @Package: com.training.maikun.product
 * @Description:
 * @Date date: 2018/8/1
 */
@RestController
@RequestMapping("/buyer/product")
public class ProductController {
    /**
     * @Author Nina
     * @Description 用对象存储json数据
     * @Date: 17:09 2018/7/31
     * @Param  * @param
     * @return pojo.Msg
     */
    @GetMapping(value = "/list")
    public Msg msg() throws Exception{
        return com.training.maikun.result.RestfulUtil.success();
    }

}
