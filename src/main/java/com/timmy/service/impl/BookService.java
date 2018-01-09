package com.timmy.service.impl;

import com.timmy.po.Book;
import com.timmy.po.Bookinfo;
import com.timmy.po.ItemBook;
import com.timmy.po.ItemsBook;
import com.timmy.utils.CheckBookRepeatBean;
import com.timmy.utils.PageBean;
import com.timmy.utils.ParaBean;
import org.apache.ibatis.executor.ExecutorException;

import java.util.List;

public interface BookService {
        /**
         * 插入书籍
         * @param bookinfo
         * @throws Exception
         */
        public void insertBook(ItemBook itemBook) throws Exception;

        /**
         * 查询数据列表
         * @return
         * @throws Exception
         */
        public List<ItemsBook>getBookList() throws Exception;

        /**
         * 删除book
         */

        public void deleteBook(int id) throws  Exception;

        /**
         * 将数据灌入修改页面
         */

        public Bookinfo dispalyToEditPage(int id) throws Exception;

        /**
         * 修改图书信息
         */
        public int updateBookInfo(Bookinfo bookinfo) throws Exception;
        /**
         * 对图书进行模糊查询
         */
        public PageBean querySomeBookinfos(int currentPage,String name)throws Exception;

        /**
         * 添加分页查询
         */
       public PageBean getPageList(int currentPage)throws Exception;


        /**
         * 获取最新的书籍
         */
        public List<ItemBook>getNewestBook(int i) throws Exception;

        /**
         * 获取热点书籍
         */

        public List<ItemBook>getHotBook(int i) throws Exception;

    /**
     * 获取某一个书籍
     */
      public ItemBook getBook(int i) throws  Exception;

    /**
     * 获取相关书籍
     * @param cid
     * @return
     * @throws Exception
     */
      public List<ItemBook>getRelativeBook(int cid) throws Exception;

    /**
     * 根据目录获取书籍
     */
      public PageBean getCategoryBook(int cid, int currentPage)throws Exception;

    /**
     * 获取模糊查询书籍
     */
    public PageBean getSomeBook(String name ,int currentPage)throws Exception;

    /**
     * 更新书籍信息
     */
    public int updateBook(Book book) throws Exception;

    /**
     * 获取图书总数
     */

    public int getBookCount()throws Exception;

    /**
     * 根据书名，作者名查询书籍
     * @return
     * @throws Exception
     */
   public ItemBook getBookByNameAndAuthorname(CheckBookRepeatBean checkBookRepeatBean) throws Exception;
}
