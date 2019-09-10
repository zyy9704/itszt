package com.itszt.appprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.itszt.domian.Goods;
import com.itszt.inters.IGoodsServoce;

/**
 * Created by zyy on 2019/9/10.
 */
@Service
public class GoodsServiceImpl implements IGoodsServoce {
    @Override
    public Goods getGoods() {
        System.out.println("GoodsServiceImpl.getGoods");
        return null;
    }
}
