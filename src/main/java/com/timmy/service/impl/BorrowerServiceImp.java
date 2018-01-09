package com.timmy.service.impl;

import com.timmy.mapper.*;
import com.timmy.po.*;
import com.timmy.utils.BookInfoQueryVo;
import com.timmy.utils.BorrowerInfoQueryVo;
import com.timmy.utils.PageBean;
import com.timmy.utils.ParaBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BorrowerServiceImp implements BorrowerService {

    @Autowired
    private BorrowerMapper borrowerMapper;
    @Autowired
    private ItemsBorrowerMapper itemsBorrowerMapper;

    @Autowired
    private BorrowbookMapper borrowbookMapper;
    @Autowired
    private CheckUserBorrowBooksMapper checkUserBorrowBooksMapper;

    public void insertBorrower(Borrower borrower) throws Exception {
            itemsBorrowerMapper.insertBorrower(borrower);
    }

    public List<ItemsBorrower> getBorrowerList() throws Exception {
        List<ItemsBorrower>list=itemsBorrowerMapper.findItemsBorrowers();
        return list;
    }

    public void deleteBorrower(int id) throws Exception {
              borrowerMapper.deleteByPrimaryKey(id);
    }

    public Borrower dispalyToEditPage(int id) throws Exception {
        return borrowerMapper.selectByPrimaryKey(id);
    }

    public int updateBorrowerInfo(Borrower borrower) throws Exception {

        return  borrowerMapper.updateByPrimaryKey(borrower);

    }

    public PageBean querySomeBorrowerinfos(int currentPage, String name) throws Exception {
        PageBean<ItemsBorrower> pageBean =new PageBean();
        //设置功能标识
        pageBean.setType("querySomeBorrowerinfos");
        //设置保存搜索喘
        pageBean.setQueryChar(name);
        //设置当前页
        pageBean.setCurrentPage(currentPage);
        //查询数据得到的总数
        int total=  itemsBorrowerMapper.querySomeBorrowerinfosCount(name);
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
       // BookInfoQueryVo bookInfoQueryVo=new BookInfoQueryVo();
        BorrowerInfoQueryVo borrowerInfoQueryVo=new BorrowerInfoQueryVo();
        ParaBean paraBean=new ParaBean();
        paraBean.setName(name);
        paraBean.setBegin(begin);
        paraBean.setPageSize(PageSize);
       borrowerInfoQueryVo.setParaBean(paraBean);
        List<ItemsBorrower> borrowers=itemsBorrowerMapper.querySomeBorrowerinfos(borrowerInfoQueryVo);
        pageBean.setList(borrowers);
        return pageBean;
    }

    public PageBean getPageList(int currentPage) throws Exception {

        PageBean<ItemsBorrower> pageBean =new PageBean();
        //设置功能标识
        pageBean.setType("getPageList");

        //设置当前页
        pageBean.setCurrentPage(currentPage);
        //查询数据得到的总数
        int total=  itemsBorrowerMapper.getBorrowerCount();
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
        List<ItemsBorrower> borrowers=itemsBorrowerMapper.pagedQuery(begin,PageSize);
        pageBean.setList(borrowers);
        return pageBean;
    }

    public int insertBorrowBook(Borrowbook borrowbook) throws Exception {
        return borrowbookMapper.insert(borrowbook);
    }

    public List<User> getBorrrowBook(int uid) throws Exception {
        return checkUserBorrowBooksMapper.getBorrowList(uid);
    }

    public Borrowbook getborrowbookitem(int id) throws Exception {
        return borrowbookMapper.selectByPrimaryKey(id);
    }

    public int Deleteborrowbook(int id) throws Exception {
        return borrowbookMapper.deleteByPrimaryKey(id);
    }
}
