package com.timmy.controller;


import com.timmy.po.ItemsUser;
import com.timmy.po.User;
import com.timmy.service.impl.RegisterService;
import com.timmy.utils.MailUtil;
import com.timmy.utils.UUIDUtil;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.Servlet;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class RegisterController {

    @Autowired
    private RegisterService registerService;
    @RequestMapping("/checkusername")
    public String checkUsername(HttpServletResponse response,String username) throws Exception {

       List<ItemsUser>itemsUsers= registerService.checkUsername(username);
       if(username==null||username==""){
           response.setContentType("text/html;charset=utf-8");
           response.getWriter().println("<font color='#a94442'>*用户名必填</font>");
       }else if(itemsUsers.size()>0){
           response.setContentType("text/html;charset=utf-8");
           response.getWriter().println("<font color='#a94442'>*用户名存在</font>");
       }else{
           response.setContentType("text/html;charset=utf-8");
           response.getWriter().println("<font color='#3c763d'>用户名可用</font>");
       }
        return null;
    }

    @RequestMapping("/checkemail")
    public String checkEmail(HttpServletResponse response,String email) throws Exception {
        List<ItemsUser>itemsUsers=registerService.checkEmail(email);
        if(email==null||email==""){
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().println("<font color='#a94442'>*邮箱必填</font>");
        }else if(itemsUsers.size()>0){
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().println("<font color='#a94442'>*已被占用</font>");
        }else{
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().println("<font color='#3c763d'>邮箱可用</font>");
        }

        return null;
    }


    @RequestMapping("/checkphone")
    public String checkPhone(HttpServletResponse response,String phone) throws Exception {
        List<ItemsUser>itemsUsers=registerService.checkPhone(phone);
        if(phone==null||phone==""){
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().println("<font color='#a94442'>*电话必填</font>");
        }else if(itemsUsers.size()>0){
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().println("<font color='#a94442'>*已被注册</font>");
        }else{
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().println("<font color='#3c763d'>电话可用</font>");
        }

        return null;
    }



    @RequestMapping("/registerUser")
    public ModelAndView registerUser(User user) throws Exception {

        String code= UUIDUtil.getUUID()+UUIDUtil.getUUID();
        user.setCode(code);
        user.setState(0);
        int i=registerService.registerUser(user);
        MailUtil.sendMail(user.getEmail(),code);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("email",user.getEmail());
        modelAndView.setViewName("qiantai/registersuccess");
        return  modelAndView;

    }

    @RequestMapping("/userActive")
    public String userActive(String code) throws Exception {
       List<ItemsUser>list=registerService.userActive(code);
       if(list.size()>0){
           ItemsUser itemsUser=list.get(0);
           itemsUser.setState(1);
           itemsUser.setCode("");
          int i= registerService.updateUser(itemsUser);
          if(i>0)
              return "/qiantai/activesuccess";
          else
              System.out.println("激活失败");

       }else{
           System.out.println("激活码被篡改");

       }
        return null;
    }


}
