package com.nf.interfaces;

import com.nf.luoliyi.entities.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsMapper {

    int insert(Goods goods);
    int update(Goods goods);
    int delete(@Param("id")int id);
    List<Goods> selectAllGoods();
    Goods selectOneById(@Param("id") int id);
}
