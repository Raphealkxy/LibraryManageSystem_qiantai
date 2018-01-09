package com.timmy.mapper;

import com.timmy.po.Bookinfo;
import com.timmy.po.ItemsBook;
import com.timmy.utils.BookInfoQueryVo;
import com.timmy.utils.ParaBean;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface ItemsBookMapper {
    /**
     * 获取书籍列表
     * @return
     * @throws Exception
     */
    public List<ItemsBook>findItemsBookinfos() throws Exception;
    /**
     * 对书籍进行模糊模糊查询
     */
    public List<ItemsBook>querySomeBookinfos(BookInfoQueryVo bookInfoQueryVo) throws Exception;
    /**
     * 统计模糊查询的个数
     */
    public Integer querySomeBookinfosCount(String name) throws Exception;
    /**
     * 获取bookinfo表中一共有多少记录
     */
    public Integer getBookinfoCount() throws Exception;
    /**
     * 获取分页查询数据
     */
    public List<ItemsBook>pagedQuery(int begin, int pageSize) throws Exception;



}
