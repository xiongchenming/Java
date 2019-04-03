package com.xiongchenming.goods.dao.impl;

import com.xiongchenming.commons.SystemConstantsUtils;
import com.xiongchenming.goods.bean.WxbGood;
import com.xiongchenming.goods.dao.IGoodsDAO;
import com.xiongchenming.goods.mapper.GoodsMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GoodsDAOImpl implements IGoodsDAO {
    @Autowired
    private SqlSession session;

    @Override
    public List<WxbGood> selectGoodsByPage(Integer page) throws Exception {
        //GoodsMapper mapper = MyBatisSessionFactoryUtils.getSession().getMapper(GoodsMapper.class);
        List<WxbGood> goods = session.getMapper(GoodsMapper.class).selectGoodsByPage(page, SystemConstantsUtils.page.PAGE_SIZE);
        return goods;
    }
}
