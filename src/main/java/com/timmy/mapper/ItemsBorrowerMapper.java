package com.timmy.mapper;

import com.timmy.po.Borrower;
import com.timmy.po.ItemsBook;
import com.timmy.po.ItemsBorrower;
import com.timmy.utils.BookInfoQueryVo;
import com.timmy.utils.BorrowerInfoQueryVo;

import java.util.List;

public interface ItemsBorrowerMapper {

    /**
     * 插入借阅人数据
     */
    public void insertBorrower(Borrower borrower) throws Exception;
    /**
     * 获取书籍列表
     * @return
     * @throws Exception
     */

    public List<ItemsBorrower>findItemsBorrowers() throws Exception;
    /**
     * 对书籍进行模糊模糊查询
     */
public List<ItemsBorrower>querySomeBorrowerinfos(BorrowerInfoQueryVo borrowerInfoQueryVo) throws Exception;
    /**
     * 统计模糊查询的个数
     */
    public Integer querySomeBorrowerinfosCount(String name) throws Exception;
    /**
     * 获取bookinfo表中一共有多少记录
     */
    public Integer getBorrowerCount() throws Exception;
    /**
     * 获取分页查询数据
     */
    public List<ItemsBorrower>pagedQuery(int begin, int pageSize) throws Exception;


}
