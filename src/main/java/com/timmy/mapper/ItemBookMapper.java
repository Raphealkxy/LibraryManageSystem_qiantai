package com.timmy.mapper;

import com.timmy.po.Book;
import com.timmy.po.BookExample;
import com.timmy.po.ItemBook;
import com.timmy.utils.BookInfoQueryVo;
import com.timmy.utils.CheckBookRepeatBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemBookMapper {
    /**
     * 查询最新书籍6个
     */
    List<ItemBook>getNewestBook(int i) throws Exception;

    /**
     * 查询热门书籍2个
     */
    List<ItemBook>gethotBook(int i) throws Exception;

    /**
     * 获取某一本书籍
     * @param i
     * @return
     * @throws Exception
     */
    ItemBook getBook(int i)throws Exception;

    /**
     * 获取相关书籍列表
     * @param cid
     * @return
     * @throws Exception
     */
    List<ItemBook>getRelativeBook(int cid) throws Exception;

    /**
     * 根据目录获取书籍
     */
    List<ItemBook>getCategoryBook(BookInfoQueryVo bookInfoQueryVo)throws Exception;

    /**
     * 获取目录书籍总数
     */
    int getBookCategoryCount(int cid) throws Exception;

    /**
     * 获取模糊查询的总数
     * @param name
     * @return
     * @throws Exception
     */
    int querySomeBookCount(String name) throws Exception;

    List<ItemBook>querySomeBook(BookInfoQueryVo bookInfoQueryVok)throws Exception;

    /**
     * 获取图书的总数
     */
    public int getbookcount() throws Exception;

    List<ItemBook>pagedQuery(int begin, int PageSize) throws Exception;

    ItemBook getBookByNameAndAuthorname(CheckBookRepeatBean checkBookRepeatBean) throws Exception;
}