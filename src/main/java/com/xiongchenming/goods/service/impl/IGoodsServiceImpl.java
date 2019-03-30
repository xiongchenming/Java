package com.xiongchenming.goods.service.impl;

import com.xiongchenming.commons.SystemConstantsUtils;
import com.xiongchenming.goods.bean.WxbGood;
import com.xiongchenming.goods.dao.IGoodsDAO;
import com.xiongchenming.goods.dao.impl.GoodsDAOImpl;
import com.xiongchenming.goods.service.IGoodsService;

import java.util.List;

public class IGoodsServiceImpl implements IGoodsService {
    private IGoodsDAO dao = new GoodsDAOImpl();
    @Override
    public List<WxbGood> selectGoodsByPage(Integer page) throws Exception {
        if (page < 1){
            throw new IndexOutOfBoundsException("页码不能小于1");
        }
        int index = (page-1) * SystemConstantsUtils.page.PAGE_SIZE;
        List<WxbGood> goods = dao.selectGoodsByPage(index);
        return goods;
    }
}
