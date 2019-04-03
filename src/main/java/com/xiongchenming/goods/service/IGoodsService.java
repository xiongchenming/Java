package com.xiongchenming.goods.service;

import com.xiongchenming.goods.bean.WxbGood;

import java.util.List;

public interface IGoodsService {
    List<WxbGood> selectGoodsByPage(Integer page)throws Exception;
    void insertGood(WxbGood good)throws Exception;
}
