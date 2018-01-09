package com.timmy.controller;


import com.sun.deploy.net.HttpResponse;
import com.timmy.po.*;
import com.timmy.service.impl.BookService;
import com.timmy.service.impl.BorrowerService;
import com.timmy.utils.DateUtil;
import com.timmy.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/borrower")
public class BorrowerController {

    @Autowired
    private BorrowerService borrowerService;
    @Autowired
    private BookService bookService;
    @RequestMapping("/add")
       public String getToAdd(){

           return "/borrower/add";
       }

       @RequestMapping("/edit")
       public String getToEdit(){

           return "/borrower/edit";
       }
       @RequestMapping("/list")
       public String getToList(){

           return "/borrower/list";
       }

       @RequestMapping("/insertborrower")
       public String insertBorrower(Borrower borrower) throws Exception {

          borrowerService.insertBorrower(borrower);
           return "success";
       }

    @RequestMapping("/pageQuery")
    public ModelAndView pageQuery(int currentPage) throws Exception {
        PageBean<ItemsBorrower> pageBean=borrowerService.getPageList(currentPage);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("pageBean",pageBean);
        modelAndView.setViewName("borrower/list");
        return  modelAndView;
    }


    @RequestMapping("/deleteborrower")
    public String deleteborrower(int id,RedirectAttributes attributes) throws Exception {
        borrowerService.deleteBorrower(id);
        attributes.addAttribute("currentPage",1);
        return "redirect:/borrower/pageQuery";
    }

    @RequestMapping("updateBorrowerinfo")
   public String updateBorrowerinfo(Borrower borrower, RedirectAttributes attributes) throws Exception {

           borrowerService.updateBorrowerInfo(borrower);
           attributes.addAttribute("currentPage",1);
           return "redirect:/borrower/pageQuery";
   }

    @RequestMapping("/dispalyToEditPage")
    public ModelAndView dispalyToEditPage(int id) throws Exception {
        Borrower borrower= borrowerService.dispalyToEditPage(id);
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("borrower",borrower);
        modelAndView.setViewName("borrower/edit");

        return modelAndView;
    }

    @RequestMapping("/querySomeBorrowerinfos")
    public ModelAndView querySomeBookinfos(int currentPage ,String name) throws Exception {

        PageBean<ItemsBorrower> pageBean=borrowerService.querySomeBorrowerinfos(currentPage,name);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("pageBean",pageBean);
        modelAndView.setViewName("borrower/list");
        return  modelAndView;
    }

    @RequestMapping("/borrowbook")
    public ModelAndView borrowBook(int id) throws Exception {
           ItemBook itembook=bookService.getBook(id);
           ModelAndView modelAndView=new ModelAndView();
           modelAndView.addObject("itembook",itembook);
           modelAndView.setViewName("qiantai/borrow");
           return modelAndView;
    }

    @RequestMapping("/insertBorrowbook")
   public ModelAndView insertBorrowbook(Borrowbook borrowbook) throws Exception {
       Book book=bookService.getBook(borrowbook.getBid());
       int count=book.getNum()-borrowbook.getBorrownum();
       book.setNum(count);
      bookService.updateBook(book);
        Date date = new Date(System.currentTimeMillis()); // 新建一个日期

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // 格式化日期
        borrowbook.setBorrowend(DateUtil.getDateAfter(date, borrowbook.getBorrowtime()));
        borrowbook.setOwe(0.0);
        borrowerService.insertBorrowBook(borrowbook);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("itembook",book);
        modelAndView.setViewName("qiantai/borrowsuccess");
        return modelAndView;
   }


   @RequestMapping("/checkceshu")
   public String checkCeshu(HttpServletResponse response, int bid, int num) throws Exception {
       Book book=bookService.getBook(bid);
       int count=book.getNum();

       if(num<0){
           response.setContentType("text/html;charset=utf-8");
           response.getWriter().println("<font color='red'>*册数不合法</font>");
       }else if(num>count) {
           response.setContentType("text/html;charset=utf-8");
           response.getWriter().println("<font color='red'>*超过库存量</font>");
       }else {
           response.setContentType("text/html;charset=utf-8");
           response.getWriter().println("<font color='green'>*册数合法</font>");
       }
       //bookService.
           return null;
   }

   @RequestMapping("/getBorrowBooks")
   public ModelAndView getBorrowBooks(int uid) throws Exception {
       ModelAndView modelAndView=new ModelAndView();


           List<User>users=borrowerService.getBorrrowBook(uid);
           if(users.size()!=0){
           User user=users.get(0);
           List<Borrowbook>borrowbooks=users.get(0).getBorrowbooks();
           modelAndView.addObject("borrowbooks",borrowbooks);
           modelAndView.setViewName("/qiantai/cart");
           }else {
               modelAndView.setViewName("/qiantai/cartnull");
           }

           return modelAndView;
   }

    @RequestMapping("/revertBorrowBooks")
    public ModelAndView revertBorrowBooks(int bid,int uid,int id) throws Exception {
           Book book=bookService.getBook(bid);
           Borrowbook borrowbook=borrowerService.getborrowbookitem(id);
           book.setNum(book.getNum()+borrowbook.getBorrownum());
           bookService.updateBook(book);
           borrowerService.Deleteborrowbook(id);

 //     ModelAndView modelAndView=new ModelAndView();
//        List<User>users=borrowerService.getBorrrowBook(uid);
//        if(users.size()!=0){
//            User user=users.get(0);
//            List<Borrowbook>borrowbooks=users.get(0).getBorrowbooks();
//            modelAndView.addObject("borrowbooks",borrowbooks);
//            modelAndView.setViewName("/qiantai/cart");
//        }else {
//            modelAndView.setViewName("/qiantai/cartnull");
//        }
        return getBorrowBooks(uid);
    }


}
