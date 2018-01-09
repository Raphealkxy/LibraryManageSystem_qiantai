package com.timmy.mapper;

import com.timmy.po.Borrower;
import com.timmy.po.BorrowerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BorrowerMapper {
    int countByExample(BorrowerExample example);

    int deleteByExample(BorrowerExample example);

    int deleteByPrimaryKey(Integer borrowerid);

    int insert(Borrower record);

    int insertSelective(Borrower record);

    List<Borrower> selectByExample(BorrowerExample example);

    Borrower selectByPrimaryKey(Integer borrowerid);

    int updateByExampleSelective(@Param("record") Borrower record, @Param("example") BorrowerExample example);

    int updateByExample(@Param("record") Borrower record, @Param("example") BorrowerExample example);

    int updateByPrimaryKeySelective(Borrower record);

    int updateByPrimaryKey(Borrower record);
}