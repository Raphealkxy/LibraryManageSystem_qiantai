package com.timmy.mapper;

import com.timmy.po.Aboutus;
import com.timmy.po.AboutusExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AboutusMapper {
    int countByExample(AboutusExample example);

    int deleteByExample(AboutusExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(Aboutus record);

    int insertSelective(Aboutus record);

    List<Aboutus> selectByExample(AboutusExample example);

    Aboutus selectByPrimaryKey(Integer aid);

    int updateByExampleSelective(@Param("record") Aboutus record, @Param("example") AboutusExample example);

    int updateByExample(@Param("record") Aboutus record, @Param("example") AboutusExample example);

    int updateByPrimaryKeySelective(Aboutus record);

    int updateByPrimaryKey(Aboutus record);
}