package com.training.maikun.product;

/**
 * @author:Nina
 * @version:
 * @Project: springbootdemo
 * @Package: com.training.maikun.product
 * @Description:
 * @Date date: 2018/8/1
 */
public class Food {
    private long id;
    private String name;
    private double price;
    private String description;
    private String icon;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
