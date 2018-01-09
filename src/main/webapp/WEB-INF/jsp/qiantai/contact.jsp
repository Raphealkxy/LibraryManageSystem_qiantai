<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
<title>Book Store</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/style1.css" />
</head>
<body>
<div id="wrap">

       <div class="header">
       		<div class="logo"><a href="${pageContext.request.contextPath }/bookstore.action"><img src="${pageContext.request.contextPath }/images/logo.gif" alt="" title="" border="0" /></a></div>
           <div id="menu">
               <ul>
                   <li><a href="${pageContext.request.contextPath }/bookstore.action">首页</a></li>
                   <li><a href="${pageContext.request.contextPath }/getlibdata.action">关于我们</a></li>
                   <li><a href="${pageContext.request.contextPath}/book/getcategorybook?id=${12}&currentPage=${1}">书籍</a></li>
                   <li><a href="${pageContext.request.contextPath }/specials.action">搜搜</a></li>
                   <c:if test="${sessionScope.state==null}">
                   <li><a href="${pageContext.request.contextPath }/myaccount.action">我的账户</a></li>
                   <li><a href="${pageContext.request.contextPath }/register.action">注册</a></li>
                   </c:if>
                   <li class="selected"><a href="${pageContext.request.contextPath }/contact.action">联系我们</a></li>
               </ul>
           </div>
            
            
       </div> 
       
       
       <div class="center_content">
       	<div class="left_content">
            <div class="title"><span class="title_icon"><img src="${pageContext.request.contextPath }/images/bullet1.gif" alt="" title="" /></span>Contact Us</div>
        
        	<div class="feat_prod_box_details">
            <p class="details">
             Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud.
            </p>
            
              	<div class="contact_form">
                <div class="form_subtitle">all fields are requierd</div>          
                    <div class="form_row">
                    <label class="contact"><strong>Name:</strong></label>
                    <input type="text" class="contact_input" />
                    </div>  

                    <div class="form_row">
                    <label class="contact"><strong>Email:</strong></label>
                    <input type="text" class="contact_input" />
                    </div>


                    <div class="form_row">
                    <label class="contact"><strong>Phone:</strong></label>
                    <input type="text" class="contact_input" />
                    </div>
                    
                    <div class="form_row">
                    <label class="contact"><strong>Company:</strong></label>
                    <input type="text" class="contact_input" />
                    </div>


                    <div class="form_row">
                    <label class="contact"><strong>Message:</strong></label>
                    <textarea class="contact_textarea" ></textarea>
                    </div>

                    
                    <div class="form_row">
                    <a href="#" class="contact">send</a>                    </div>      
                </div>  
            
          </div>	
            
              

            

            
        <div class="clear"></div>
        </div><!--end of left content-->

           <%@ include file="usernav.jsp" %>

        
       
       
       <div class="clear"></div>
       </div><!--end of center content-->
       
              
       <div class="footer">
       	<div class="left_footer"><img src="${pageContext.request.contextPath }/images/footer_logo.gif" alt="" title="" /><br /> </div>
        <div class="right_footer">
        <a href="#">home</a>
        <a href="#">about us</a>
        <a href="#">services</a>
        <a href="#">privacy policy</a>
        <a href="#">contact us</a>
       
        </div>
        
       
       </div>
    

</div>

</body>
</html>