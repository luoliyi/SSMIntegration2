package com.nf.Test;

import com.nf.interfaces.GoodsMapper;
import com.nf.luoliyi.entities.Goods;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

public final class GoodsDAOTest {
    //自动装配IOC 扫描对象
    @Autowired
    GoodsMapper goodsMapper;

    @Before
    public void setUp() throws Exception {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beansOfAOP.xml");
        goodsMapper=applicationContext.getBean(GoodsMapper.class);
    }

    @Test
    public void insert() {
        Goods goods=new Goods("旺旺小馒头",BigDecimal.valueOf(23),"");
        int result=goodsMapper.insert(goods);
        System.out.println(result);
    }

    @Test
    public void update() {
        Goods goods=new Goods(12,"旺旺碎冰冰",BigDecimal.valueOf(13),"");
        int result=goodsMapper.update(goods);
        System.out.println(result);
    }

    @Test
    public void delete() {
    }

    @Test
    public void selectAllGoods() {
        List<Goods> goodsList=goodsMapper.selectAllGoods();
        System.out.println(goodsList);
    }

    @Test
    public void selectOneById() {
        Goods goods=goodsMapper.selectOneById(3);
        System.out.println(goods);
    }
}