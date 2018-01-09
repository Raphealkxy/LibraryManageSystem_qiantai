package com.timmy.service.impl;

import com.timmy.mapper.BookMapper;
import com.timmy.mapper.BookinfoMapper;
import com.timmy.mapper.ItemBookMapper;
import com.timmy.mapper.ItemsBookMapper;
import com.timmy.po.Bookinfo;
import com.timmy.po.ItemBook;
import com.timmy.po.ItemsBook;
import com.timmy.utils.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookServiceImp implements BookService {

    @Autowired
    private BookinfoMapper bookinfoMapper;
    @Autowired
    private ItemsBookMapper itemsBookMapper;

    @Autowired
    private ItemBookMapper itemBookMapper;

    @Autowired
    private BookMapper bookMapper;

    public void insertBook(ItemBook itemBook) throws Exception {
          bookMapper.insert(itemBook);
    }

    public List<ItemsBook> getBookList() throws Exception {

        return itemsBookMapper.findItemsBookinfos();
    }

    public void deleteBook(int id) throws Exception {
        bookMapper.deleteByPrimaryKey(id);
    }

    public Bookinfo dispalyToEditPage(int id) throws Exception {

        return bookinfoMapper.selectByPrimaryKey(id);
    }

    public int updateBookInfo(Bookinfo bookinfo) throws Exception {
           return bookinfoMapper.updateByPrimaryKey(bookinfo);
    }

    /**
     * 第一代后台模糊查询书籍
     * @param currentPage
     * @param name
     * @return
     * @throws Exception
     */
    public PageBean querySomeBookinfos(int currentPage,String name) throws Exception {
        PageBean<ItemsBook> pageBean =new PageBean();
        //设置功能标识
        pageBean.setType("querySomeBookinfos");
        //设置保存搜索喘
        pageBean.setQueryChar(name);
        //设置当前页
        pageBean.setCurrentPage(currentPage);
        //查询数据得到的总数
        int total=  itemsBookMapper.querySomeBookinfosCount(name);
        pageBean.setTotalCount(total);

        //设置每页显示的记录数
        int PageSize=5;
        int totalPage=0;
        if(total%PageSize==0)
        {
            totalPage=total/PageSize;
        }else {
            totalPage=total/PageSize+1;
        }
        pageBean.setTotalCount(total);
        pageBean.setTotalPage(totalPage);
        //每页查询list集合
        int begin = (currentPage-1)*PageSize;
        BookInfoQueryVo bookInfoQueryVo=new BookInfoQueryVo();
        ParaBean paraBean=new ParaBean();
        paraBean.setName(name);
        paraBean.setBegin(begin);
        paraBean.setPageSize(PageSize);
        bookInfoQueryVo.setParaBean(paraBean);
        List<ItemsBook> books=itemsBookMapper.querySomeBookinfos(bookInfoQueryVo);
        pageBean.setList(books);
        return pageBean;
    }

    /**
     * 第二代后台
     * @param currentPage
     * @return
     * @throws Exception
     */
    public PageBean getPageList(int currentPage) throws Exception {
        PageBean<ItemBook> pageBean =new PageBean();
        //设置功能标识
        pageBean.setType("getPageList");

        //设置当前页
        pageBean.setCurrentPage(currentPage);
        //查询数据得到的总数
      int total=  itemBookMapper.getbookcount();
      pageBean.setTotalCount(total);
      //设置每页显示的记录数
      int PageSize=9;
      int totalPage=0;
      if(total%PageSize==0)
      {
          totalPage=total/PageSize;
      }else {
          totalPage=total/PageSize+1;
      }
      pageBean.setTotalCount(total);
      pageBean.setTotalPage(totalPage);
      //每页查询list集合
        int begin = (currentPage-1)*PageSize;
      List<ItemBook> books=itemBookMapper.pagedQuery(begin,PageSize);
      pageBean.setList(books);
        return pageBean;
    }

    public List<ItemBook> getNewestBook(int i) throws Exception {
        return itemBookMapper.getNewestBook(i);
    }

    public List<ItemBook> getHotBook(int i) throws Exception {
        return itemBookMapper.gethotBook(i);
    }

    public ItemBook getBook(int i) throws Exception {
        return itemBookMapper.getBook(i);
    }

    public List<ItemBook> getRelativeBook(int cid) throws Exception {
        return itemBookMapper.getRelativeBook(cid);
    }

    public PageBean getCategoryBook(int cid,int currentPage) throws Exception {
        PageBean<ItemBook> pageBean =new PageBean();
        //设置功能标识
        pageBean.setType("getCategoryBook");

        //设置当前页
        pageBean.setCurrentPage(currentPage);
        //查询数据得到的总数
        int total=  itemBookMapper.getBookCategoryCount(cid);


        pageBean.setTotalCount(total);
        //设置每页显示的记录数
        int PageSize=12;
        int totalPage=0;
        if(total%PageSize==0)
        {
            totalPage=total/PageSize;
        }else {
            totalPage=total/PageSize+1;
        }
        pageBean.setTotalCount(total);
        pageBean.setTotalPage(totalPage);
        //每页查询list集合
        int begin = (currentPage-1)*PageSize;
        BookInfoQueryVo bookInfoQueryVo=new BookInfoQueryVo();
        BookParaBean bookParaBean=new BookParaBean();
        bookParaBean.setCid(cid);
        bookParaBean.setBegin(begin);
        bookParaBean.setPageSize(PageSize);
        bookInfoQueryVo.setBookParaBean(bookParaBean);
        List<ItemBook> itemBooks=itemBookMapper.getCategoryBook(bookInfoQueryVo);
        pageBean.setList(itemBooks);
        return pageBean;

    }

    public PageBean getSomeBook(String name, int currentPage) throws Exception {
        PageBean<ItemBook> pageBean =new PageBean();
        //设置功能标识
        pageBean.setType("getSomeBook");
        //设置保存搜索喘
        pageBean.setQueryChar(name);
        //设置当前页
        pageBean.setCurrentPage(currentPage);
        //查询数据得到的总数
        int total=  itemBookMapper.querySomeBookCount(name);
        pageBean.setTotalCount(total);

        //设置每页显示的记录数
        int PageSize=5;
        int totalPage=0;
        if(total%PageSize==0)
        {
            totalPage=total/PageSize;
        }else {
            totalPage=total/PageSize+1;
        }
        pageBean.setTotalCount(total);
        pageBean.setTotalPage(totalPage);
        //每页查询list集合
        int begin = (currentPage-1)*PageSize;
        BookInfoQueryVo bookInfoQueryVo=new BookInfoQueryVo();
        ParaBean paraBean=new ParaBean();
        paraBean.setName(name);
        paraBean.setBegin(begin);
        paraBean.setPageSize(PageSize);
        bookInfoQueryVo.setParaBean(paraBean);
        List<ItemBook> itemBooks=itemBookMapper.querySomeBook(bookInfoQueryVo);
        pageBean.setList(itemBooks);
        return pageBean;
    }

    public int updateBook(com.timmy.po.Book book) throws Exception {
        return bookMapper.updateByPrimaryKey(book);
    }

    public int getBookCount() throws Exception {
        return itemBookMapper.getbookcount();
    }

    public ItemBook getBookByNameAndAuthorname(CheckBookRepeatBean checkBookRepeatBean) throws Exception {
        return itemBookMapper.getBookByNameAndAuthorname(checkBookRepeatBean);
    }
}
