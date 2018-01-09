package com.timmy.service.impl;

import com.timmy.po.*;
import com.timmy.utils.PageBean;

import java.util.List;

public interface BorrowerService {
        /**
         * 插入借阅人
         * @param borrower
         * @throws Exception
         */
        public void insertBorrower(Borrower borrower) throws Exception;

        /**
         * 查询数据列表
         * @return
         * @throws Exception
         */
        public List<ItemsBorrower>getBorrowerList() throws Exception;

        /**
         * 删除借阅人
         */

        public void deleteBorrower(int id) throws  Exception;

        /**
         * 将数据灌入修改页面
         */

        public Borrower dispalyToEditPage(int id) throws Exception;

        /**
         * 修改借阅人信息
         */
        public int updateBorrowerInfo(Borrower borrower) throws Exception;
        /**
         * 对借阅人进行模糊查询
         */
        public PageBean querySomeBorrowerinfos(int currentPage, String name)throws Exception;

        /**
         * 添加分页查询
         */
       public PageBean getPageList(int currentPage)throws Exception;

        /**
         * 借阅人进行借阅
         */

        public int insertBorrowBook(Borrowbook borrowbook)throws Exception;

        /**
         * 根据用户查询借书
         */

        public List<User>getBorrrowBook(int uid) throws Exception;

    /**
     * 获取借书记录
     */

    public Borrowbook getborrowbookitem(int id) throws Exception;

    /**
     * 删除借书激励
     */
    public int Deleteborrowbook(int id)throws Exception;

}
