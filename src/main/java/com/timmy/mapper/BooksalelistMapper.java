package com.timmy.mapper;

import com.timmy.po.Booksalelist;
import com.timmy.po.BooksalelistExample;
import com.timmy.po.BooksalelistKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BooksalelistMapper {
    int countByExample(BooksalelistExample example);

    int deleteByExample(BooksalelistExample example);

    int deleteByPrimaryKey(BooksalelistKey key);

    int insert(Booksalelist record);

    int insertSelective(Booksalelist record);

    List<Booksalelist> selectByExample(BooksalelistExample example);

    Booksalelist selectByPrimaryKey(BooksalelistKey key);

    int updateByExampleSelective(@Param("record") Booksalelist record, @Param("example") BooksalelistExample example);

    int updateByExample(@Param("record") Booksalelist record, @Param("example") BooksalelistExample example);

    int updateByPrimaryKeySelective(Booksalelist record);

    int updateByPrimaryKey(Booksalelist record);
}