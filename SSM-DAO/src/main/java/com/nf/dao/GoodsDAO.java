package com.nf.dao;

import MybatisUtil.MyBatisUtil;
import com.nf.interfaces.GoodsMapper;
import com.nf.luoliyi.entities.Goods;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

/*声明Repository，让ioc自动扫描，自动装配*/
@Repository
public class GoodsDAO implements GoodsMapper {
    @Override
    public int insert(Goods goods) {
        System.out.println(goods);
        SqlSession sqlSession=MyBatisUtil.openSqlSession(true);
        GoodsMapper goodsMapper=sqlSession.getMapper(GoodsMapper.class);
        int result=goodsMapper.insert(goods);
        sqlSession.close();
        return  result;
    }

    @Override
    public int update(Goods goods) {
       SqlSession sqlSession=MyBatisUtil.openSqlSession(true);
       GoodsMapper goodsMapper=sqlSession.getMapper(GoodsMapper.class);
       int result=goodsMapper.update(goods);
       sqlSession.close();
       return result;
    }

    @Override
    public int delete(int id) {
        SqlSession sqlSession=MyBatisUtil.openSqlSession(true);
        GoodsMapper goodsMapper=sqlSession.getMapper(GoodsMapper.class);
        int result=goodsMapper.delete(id);
        sqlSession.close();
        return result;
    }

    @Override
    public List<Goods> selectAllGoods() {
        SqlSession sqlSession=MyBatisUtil.openSqlSession(true);
        GoodsMapper goodsMapper=sqlSession.getMapper(GoodsMapper.class);
        List<Goods> goodsList=goodsMapper.selectAllGoods();
        sqlSession.close();
        return goodsList;
    }

    @Override
    public Goods selectOneById(int id) {
        SqlSession sqlSession=MyBatisUtil.openSqlSession(true);
        GoodsMapper goodsMapper=sqlSession.getMapper(GoodsMapper.class);
        Goods good=goodsMapper.selectOneById(id);
        sqlSession.close();
        return good;
    }
}
