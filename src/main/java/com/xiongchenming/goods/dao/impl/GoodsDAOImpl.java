package com.xiongchenming.goods.dao.impl;

import com.xiongchenming.commons.SystemConstantsUtils;
import com.xiongchenming.commons.mybatis.MyBatisSessionFactoryUtils;
import com.xiongchenming.goods.bean.WxbGood;
import com.xiongchenming.goods.dao.IGoodsDAO;
import com.xiongchenming.goods.mapper.GoodsMapper;

import java.util.List;

public class GoodsDAOImpl implements IGoodsDAO {

    @Override
    public List<WxbGood> selectGoodsByPage(Integer page) throws Exception {
        GoodsMapper mapper = MyBatisSessionFactoryUtils.getSession().getMapper(GoodsMapper.class);
        List<WxbGood> goods = mapper.selectGoodsByPage(page, SystemConstantsUtils.page.PAGE_SIZE);
        return goods;
    }
}
