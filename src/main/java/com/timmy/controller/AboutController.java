package com.timmy.controller;

import com.timmy.po.ItemAboutus;
import com.timmy.service.impl.AboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
public class AboutController {

    @Autowired
private AboutService aboutService;

    @RequestMapping("/getlibdata")
   public ModelAndView getLibData() throws Exception {

        List<ItemAboutus>itemAboutuses=aboutService.getLibData();
        ItemAboutus itemAboutus=itemAboutuses.get(0);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("itemAboutus",itemAboutus);
        modelAndView.setViewName("/qiantai/about");
        return modelAndView;

   }
}
