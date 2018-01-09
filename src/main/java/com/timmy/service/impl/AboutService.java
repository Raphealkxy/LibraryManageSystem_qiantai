package com.timmy.service.impl;

import com.timmy.po.ItemAboutus;

import java.util.List;

public interface AboutService {

    /**
     * 获取图书馆信息
     */
    public List<ItemAboutus> getLibData() throws Exception;
}
