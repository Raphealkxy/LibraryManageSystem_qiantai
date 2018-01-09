package com.timmy.service.impl;

import com.timmy.mapper.AboutusMapper;
import com.timmy.mapper.ItemAboutusMapper;
import com.timmy.po.ItemAboutus;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AboutServiceImp implements AboutService {

    @Autowired
    private AboutusMapper aboutusMapper;
    @Autowired
    private ItemAboutusMapper itemAboutusMapper;
    public List<ItemAboutus> getLibData() throws Exception {
        return itemAboutusMapper.getLibData();
    }
}
