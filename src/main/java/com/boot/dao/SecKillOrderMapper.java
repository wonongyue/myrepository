package com.boot.dao;

import com.boot.model.SecKillOrder;
import com.boot.model.SecKillOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecKillOrderMapper {
    long countByExample(SecKillOrderExample example);

    int deleteByExample(SecKillOrderExample example);

    int insert(SecKillOrder record);

    int insertSelective(SecKillOrder record);

    List<SecKillOrder> selectByExample(SecKillOrderExample example);

    int updateByExampleSelective(@Param("record") SecKillOrder record, @Param("example") SecKillOrderExample example);

    int updateByExample(@Param("record") SecKillOrder record, @Param("example") SecKillOrderExample example);
}