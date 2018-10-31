package com.nf.luoliyi.entities;

import java.io.Serializable;
import java.math.BigDecimal;

public class Goods implements Serializable {
    private int id;
    private String gname;
    private BigDecimal price;
    private String picture;
    public Goods(){}

    public Goods( String gname, BigDecimal price, String picture) {
        this.gname = gname;
        this.price = price;
        this.picture = picture;
    }

    public Goods(int id, String gname, BigDecimal price, String picture) {
        this.id = id;
        this.gname = gname;
        this.price = price;
        this.picture = picture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGName() {
        return gname;
    }

    public void setGName(String gname) {
        this.gname = gname;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" +gname + '\'' +
                ", price=" + price +
                ", picture='" + picture + '\'' +
                '}';
    }
}
