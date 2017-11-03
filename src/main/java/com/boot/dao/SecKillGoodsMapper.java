package com.boot.dao;

import com.boot.model.SecKillGoods;
import com.boot.model.SecKillGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecKillGoodsMapper {
    long countByExample(SecKillGoodsExample example);

    int deleteByExample(SecKillGoodsExample example);

    int insert(SecKillGoods record);

    int insertSelective(SecKillGoods record);

    List<SecKillGoods> selectByExample(SecKillGoodsExample example);

    int updateByExampleSelective(@Param("record") SecKillGoods record, @Param("example") SecKillGoodsExample example);

    int updateByExample(@Param("record") SecKillGoods record, @Param("example") SecKillGoodsExample example);

    int updateGoods(SecKillGoods record);
}