package com.xiongchenming.goods.service.impl;

import com.xiongchenming.commons.SystemConstantsUtils;
import com.xiongchenming.goods.bean.WxbGood;
import com.xiongchenming.goods.dao.IGoodsDAO;
import com.xiongchenming.goods.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class IGoodsServiceImpl implements IGoodsService {
    @Autowired
    private IGoodsDAO dao ;
    @Override
    public List<WxbGood> selectGoodsByPage(Integer page) throws Exception {
        if (page < 1){
            throw new IndexOutOfBoundsException("页码不能小于1");
        }
        int index = (page-1) * SystemConstantsUtils.page.PAGE_SIZE;
        List<WxbGood> goods = dao.selectGoodsByPage(index);
        return goods;
    }

    @Override
    public void insertGood(WxbGood good) throws Exception {
        dao.insertGood(good);
    }
}
