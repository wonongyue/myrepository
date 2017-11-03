package com.boot.controller;

import com.boot.dao.SecKillGoodsMapper;
import com.boot.model.SecKillGoods;
import com.boot.model.SecKillGoodsExample;
import com.boot.service.SecKillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SecKillController {

    @Autowired
    SecKillGoodsMapper secKillGoodsDao;

    @Autowired
    SecKillService secKillService;

    /**
     * 普通写法
     *
     * @param consumer
     * @param goodsId
     * @return
     */
    @RequestMapping("/seckill")
    @ResponseBody
    public String SecKill(String consumer, String goodsId, Integer num) throws InterruptedException {
        //查找出用户要买的商品
        SecKillGoodsExample example = new SecKillGoodsExample();
        example.createCriteria().andGoodsNameEqualTo(goodsId);
        SecKillGoods goods = secKillGoodsDao.selectByExample(example).get(0);
        //如果有这么多库存
        if (goods.getRemainNum() >= num) {
            //模拟网络延时
            Thread.sleep(1000);
            if (goods.getRemainNum() > 0) {
                //先减去库存
                SecKillGoods secKillGoods = new SecKillGoods();
                secKillGoods.setRemainNum(num);
                secKillGoods.setId(goods.getId());
                int i = secKillGoodsDao.updateGoods(secKillGoods);
                if (i != 0) {
                    //保存订单
                    secKillService.generateOrder(consumer, goodsId, num);
                    return "购买成功";
                }
            }
        }
        return "购买失败,库存不足";
    }

}
