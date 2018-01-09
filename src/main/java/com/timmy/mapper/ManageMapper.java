package com.timmy.mapper;

import com.timmy.po.ManageExample;
import com.timmy.po.ManageKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ManageMapper {
    int countByExample(ManageExample example);

    int deleteByExample(ManageExample example);

    int deleteByPrimaryKey(ManageKey key);

    int insert(ManageKey record);

    int insertSelective(ManageKey record);

    List<ManageKey> selectByExample(ManageExample example);

    int updateByExampleSelective(@Param("record") ManageKey record, @Param("example") ManageExample example);

    int updateByExample(@Param("record") ManageKey record, @Param("example") ManageExample example);
}