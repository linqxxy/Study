package com.linqxxy.service;

import com.linqxxy.po.Goods;

import java.util.List;

public interface GoodsService {
    public List<Goods> queryAllGoods();

    public boolean goodPutAway(Goods goods);
    public Goods getGoods(int goodsId);

    public boolean modifyGood(Goods goods);

    public boolean deleteGoods(int goodsId);

    public boolean updateAfterPay(Goods goods, Integer buyGoodsNum);
}
