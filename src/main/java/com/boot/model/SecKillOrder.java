package com.boot.model;

public class SecKillOrder {
    private Integer id;

    private String consumer;

    private String goodsId;

    private Integer num;

    public SecKillOrder(String consumer, String goodsId, Integer num) {
        this.consumer = consumer;
        this.goodsId = goodsId;
        this.num = num;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConsumer() {
        return consumer;
    }

    public void setConsumer(String consumer) {
        this.consumer = consumer == null ? null : consumer.trim();
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}