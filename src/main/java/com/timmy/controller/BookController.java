package com.timmy.controller;

import com.timmy.po.Bookinfo;
import com.timmy.po.Category;
import com.timmy.po.ItemBook;
import com.timmy.po.ItemsBook;
import com.timmy.service.impl.BookService;
import com.timmy.service.impl.CategoryService;
import com.timmy.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.awt.print.Book;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;
   @Autowired
    private CategoryService categoryService;
    @RequestMapping("/insertBook")
    public String insertBook(ItemBook itemBook) throws Exception {

      //  bookinfo.setPublishingdate(new Date(System.currentTimeMillis()));
        bookService.insertBook(itemBook);
        return "success";
    }

    @RequestMapping("/queryItems")
    public ModelAndView queryItems() throws Exception {
        List<ItemsBook> bookinfos=bookService.getBookList();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("list",bookinfos);
        modelAndView.setViewName("library/list");
        return  modelAndView;
    }


    @RequestMapping("deletebook")
    public String deleteBook(int id, RedirectAttributes attributes) throws Exception {

        bookService.deleteBook(id);
        attributes.addAttribute("currentPage",1);
        return "redirect:/book/pageQuery";
    }

    @RequestMapping("edit")
    public String updateBook(int id){

        return "library/edit";
    }

    @RequestMapping("/dispalyToEditPage")
    public ModelAndView dispalyToEditPage(int id) throws Exception {
       Bookinfo bookinfo= bookService.dispalyToEditPage(id);
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("bookinfo",bookinfo);
        modelAndView.setViewName("library/edit");

        return modelAndView;
    }

    @RequestMapping("updateBook")
    public String updateBook(Bookinfo bookinfo,RedirectAttributes attributes) throws Exception {
       int updateBookStatus= bookService.updateBookInfo(bookinfo);
       System.out.println(updateBookStatus);
        attributes.addAttribute("currentPage",1);
        return "redirect:/book/pageQuery";
    }

    @RequestMapping("/querySomeBookinfos")
    public ModelAndView querySomeBookinfos(int currentPage ,String name) throws Exception {

        PageBean<ItemsBook> pageBean=bookService.querySomeBookinfos(currentPage,name);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("pageBean",pageBean);
        modelAndView.setViewName("library/list");
        return  modelAndView;
    }

    @RequestMapping("/pageQuery")
    public ModelAndView pageQuery(int currentPage) throws Exception {
        PageBean<ItemsBook> pageBean=bookService.getPageList(currentPage);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("pageBean",pageBean);
        modelAndView.setViewName("library/list");
        return  modelAndView;
    }

    @RequestMapping("/getbook")
    public ModelAndView getBook(int id) throws Exception {
        ItemBook itemBook=bookService.getBook(id);
        List<ItemBook>itemBooks=bookService.getRelativeBook(itemBook.getCid());
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("itembook",itemBook);
        modelAndView.addObject("itembooks",itemBooks);
        modelAndView.setViewName("qiantai/details");
        return modelAndView;
    }

    @RequestMapping("/getcategorybook")
    public ModelAndView getCategoryBook(int id,int currentPage) throws Exception {
        PageBean<ItemBook>pageBean =bookService.getCategoryBook(id,currentPage);
        Category category=categoryService.queryCategoryById(id);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("pageBean",pageBean);
        modelAndView.addObject("category",category);

        modelAndView.setViewName("qiantai/category");
        return modelAndView;
    }

    @RequestMapping("/getsomebooks")
    public ModelAndView getSomeBook(String name,int currentPage) throws Exception {
        PageBean<ItemBook>pageBean =bookService.getSomeBook(name,currentPage);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("pageBean",pageBean);
        modelAndView.setViewName("qiantai/specials");
        return modelAndView;
    }
}
