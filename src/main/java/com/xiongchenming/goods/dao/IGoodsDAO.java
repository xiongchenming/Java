package com.xiongchenming.goods.dao;

import com.xiongchenming.goods.bean.WxbGood;

import java.util.List;

public interface IGoodsDAO {
    List<WxbGood> selectGoodsByPage(Integer page)throws Exception;
}
