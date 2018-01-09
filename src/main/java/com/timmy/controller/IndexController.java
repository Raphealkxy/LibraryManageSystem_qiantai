package com.timmy.controller;

import com.timmy.po.ItemAboutus;
import com.timmy.po.ItemBook;
import com.timmy.po.ItemCategory;
import com.timmy.service.impl.AboutService;
import com.timmy.service.impl.BookService;
import com.timmy.service.impl.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private AboutService aboutService;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private BookService bookService;
    @RequestMapping("/index")
    public String getToIndex()
    {

        return "index";
    }

    @RequestMapping("/addlibary")
    public String getToAddLibrary()
    {
        return "/library/add";
    }

    @RequestMapping("top")
    public String getToTop()
    {
        return "top";
    }

    @RequestMapping("menu")
    public String getToMenu()
    {
        return "menu";
    }

    @RequestMapping("welcome")
    public String getToWelcome()
    {
        return "welcome";
    }

    @RequestMapping("listlibrary")
    public String getToListLibrary()
    {

        return "/library/list";
    }

    @RequestMapping("/edit")
    public String getToEdit()
    {
        return "/library/edit";
    }

    @RequestMapping("/bookstore")
    public String getToQianTaiIndex(HttpSession httpSession) throws Exception {

        List<ItemAboutus> itemAboutuses=aboutService.getLibData();
        ItemAboutus itemAboutus=itemAboutuses.get(0);
        httpSession.setAttribute("aboutourstore",itemAboutus.getAboutourstore());
        List<ItemCategory>itemCategories=categoryService.queryCategory();
        httpSession.setAttribute("itemCategories",itemCategories);
        List<ItemBook>newestBook=bookService.getNewestBook(6);
        httpSession.setAttribute("newestBook",newestBook);

        List<ItemBook>hotBook=bookService.getHotBook(2);
        httpSession.setAttribute("hotBook",hotBook);



        return "/qiantai/index";
    }

    @RequestMapping("/register")
    public String getToQianTairegister(){


        return "/qiantai/register";
    }

    @RequestMapping("/contact")
    public String getToQianTaicontact(){


        return "/qiantai/contact";
    }

    @RequestMapping("/category")
    public String getToQianTaicategory(){


        return "/qiantai/category";
    }

    @RequestMapping("/details")
    public String getToQianTaidetails(){


        return "/qiantai/details";
    }

    @RequestMapping("/myaccount")
    public String getToQianTaimyaccount(){


        return "/qiantai/myaccount";
    }

    @RequestMapping("/specials")
    public String getToQianTaispecials(){


        return "/qiantai/specials";
    }

    @RequestMapping("/about")
    public String getToQianTaiabout(){


        return "/qiantai/about";
    }

    @RequestMapping("/cart")
    public String getToQianTaicart(){


        return "/qiantai/cart";
    }
}
