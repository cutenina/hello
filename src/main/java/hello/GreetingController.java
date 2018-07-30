package hello;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author:Nina
 * @version:
 * @Project: springbootdemo
 * @Package: hello
 * @Description:
 * @Date date: 2018/7/30
 */
@RestController
public class GreetingController {
    private static final String TEMPLATE="Hello,%s!";
    private final AtomicLong counter=new AtomicLong();

    /**
     * @Author Nina
     * @Description //TODO
     * @Date: 16:45 2018/7/30
     * @Param  * @param name
     * @return hello.Greeting
     */
    @RequestMapping(value = "greeting",method = RequestMethod.GET)
    public Greeting greeting(@RequestParam(value = "name",defaultValue = "nina")String name){
        return new Greeting(counter.incrementAndGet(),String.format(TEMPLATE,name));
    }


}
