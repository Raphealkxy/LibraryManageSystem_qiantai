package com.timmy.utils;

import com.timmy.po.ItemsBook;

import java.util.List;

public class  PageBean<T> {
    //当前页
    private Integer currentPage=1;
    //总记录数
    private Integer totalCount;
    //总页数
    private Integer totalPage;
    //每页显示的记录数
    private Integer pageSize;
    //总页数
    private Integer begin;
    //开始位置
    private List<T>list;
    //每页记录的list集合
    private String type;
    //每次模糊查询输入字符
    private String queryChar;

    public String getQueryChar() {
        return queryChar;
    }

    public void setQueryChar(String queryChar) {
        this.queryChar = queryChar;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getBegin() {
        return begin;
    }

    public void setBegin(Integer begin) {
        this.begin = begin;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }
}
