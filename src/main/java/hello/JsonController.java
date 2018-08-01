package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.Msg;
import pojo.RestfulUtil;

/**
 * @author:Nina
 * @version:
 * @Project: springbootdemo
 * @Package: hello
 * @Description:
 * @Date date: 2018/7/31
 */
@RestController
@RequestMapping("/buyer/product")
public class JsonController {
    /**
     * @Author Nina
     * @Description 用对象存储json数据
     * @Date: 17:09 2018/7/31
     * @Param  * @param
     * @return pojo.Msg
     */
    @GetMapping(value = "/list")
    public Msg msg() throws Exception{
        return RestfulUtil.success();
    }



}