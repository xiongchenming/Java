package com.xiongchenming.goods.mapper;

import com.xiongchenming.goods.bean.WxbGood;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsMapper {
    List<WxbGood> selectGoodsByPage(@Param("index") Integer index,@Param("size") Integer size);
    void insertGood(WxbGood wxbGood);
}
