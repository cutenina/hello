package com.training.maikun.product;

/**
 * @author:Nina
 * @version:
 * @Project: springbootdemo
 * @Package: com.training.maikun.product
 * @Description:
 * @Date date: 2018/8/1
 */
public class Product {
    private String name;
    private Integer type;
    private Object foods;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Object getFoods() {
        return foods;
    }

    public void setFoods(Object foods) {
        this.foods = foods;
    }
}
