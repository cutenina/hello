package com.training.maikun.result;

import com.training.maikun.product.Food;
import com.training.maikun.product.Msg;
import com.training.maikun.product.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Nina
 * @version:
 * @Project: springbootdemo
 * @Package: com.training.maikun.product
 * @Description:
 * @Date date: 2018/8/1
 */
public class RestfulUtil {
    /**
     * @Author Nina
     * @Description //TODO
     * @Date: 17:01 2018/7/31
     * @Param  * @param
     * @return pojo.Msg
     */
    public static Msg success() throws Exception{
        Msg msg=new Msg();
        msg.setCode(0);
        msg.setMsg("成功");
        Product product=new Product();
        product.setName("热榜");
        product.setType(1);
        Food food1=new Food();
        food1.setId(123456);
        food1.setName("皮蛋粥");
        food1.setPrice(1.2);
        food1.setDescription("好吃的皮蛋粥");
        Food food2=new Food();
        food2.setId(123457);
        food2.setName("鱼香肉丝");
        food2.setPrice(1.3);
        food2.setDescription("美味的鱼香肉丝");
        List<Food> foods=new ArrayList<>();
        foods.add(food1);
        foods.add(food2);
        product.setFoods(foods);
        msg.setData(product);
        return msg;
    }
}
