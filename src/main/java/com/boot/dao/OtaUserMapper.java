package com.boot.dao;

import com.boot.model.OtaUser;
import com.boot.model.OtaUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OtaUserMapper {
    long countByExample(OtaUserExample example);

    int deleteByExample(OtaUserExample example);

    int insert(OtaUser record);

    int insertSelective(OtaUser record);

    List<OtaUser> selectByExample(OtaUserExample example);

    int updateByExampleSelective(@Param("record") OtaUser record, @Param("example") OtaUserExample example);

    int updateByExample(@Param("record") OtaUser record, @Param("example") OtaUserExample example);
}