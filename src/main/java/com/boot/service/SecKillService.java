package com.boot.service;

import com.boot.dao.SecKillGoodsMapper;
import com.boot.dao.SecKillOrderMapper;
import com.boot.model.SecKillGoods;
import com.boot.model.SecKillOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class SecKillService {

    @Autowired
    SecKillGoodsMapper secKillGoodsDao;

    @Autowired
    SecKillOrderMapper secKillOrderDao;

    /**
     * 购买成功,保存订单
     * @param consumer
     * @param goodsId
     * @param num
     */
    public void generateOrder(String consumer, String goodsId, Integer num) {
        secKillOrderDao.insert(new SecKillOrder(consumer,goodsId,num));
    }
}
