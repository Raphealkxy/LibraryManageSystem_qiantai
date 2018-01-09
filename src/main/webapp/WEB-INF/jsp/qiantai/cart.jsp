<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
<title>Book Store</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/style1.css" />
    <style>
        .cart_table img{
            width: 23px;
            height: 35px;
        }
    </style>
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
                   <li><a href="${pageContext.request.contextPath }/contact.action">联系我们</a></li>
               </ul>
           </div>
            
            
       </div> 
       
       
       <div class="center_content">
       	<div class="left_content">
            <div class="title"><span class="title_icon"><img src="${pageContext.request.contextPath }/images/bullet1.gif" alt="" title="" /></span>我的借书记录</div>
        
        	<div class="feat_prod_box_details">
            
            <table class="cart_table">
            	<tr class="cart_title">
                	<td>书籍封面</td>
                	<td>书籍名称</td>
                    <td>还书时间</td>
                    <td>欠款</td>
                    <td>业务</td>
                </tr>

                <c:if test="${borrowbooks!=null}">
                <c:forEach items="${borrowbooks}" var="borrowbook">
            	<tr>
                	<td><a href="${pageContext.request.contextPath }/book/getbook.action?id=${borrowbook.book.bid}"><img src="${pageContext.request.contextPath }/images/${borrowbook.book.image}" alt="" title="" border="0" class="cart_thumb" /></a></td>
                	<td>${borrowbook.book.bname}</td>
                    <td><fmt:formatDate value="${borrowbook.borrowend}" pattern="yyyy-MM-dd"/></td>
                    <td>${borrowbook.owe}</td>
                    <td><span><a href="${pageContext.request.contextPath}/borrower/revertBorrowBooks.action?bid=${borrowbook.book.bid}&id=${borrowbook.id}&uid=${sessionScope.user.uid}" style="outline: none;border: none;color:#a52a2a;text-decoration:none ">还借</a></span></td>
                </tr>
                </c:forEach>
                </c:if>

            
            </table>
            <a href="#" class="continue">&lt; continue</a>
            <a href="#" class="checkout">checkout &gt;</a>
            

             
            
            </div>	
            
              

            

            
        <div class="clear"></div>
        </div><!--end of left content-->

           <%@ include file="usernav.jsp" %>

        
       
       
       <div class="clear"></div>
       </div><!--end of center content-->
       
              
       <div class="footer">
       	<div class="left_footer"><img src="${pageContext.request.contextPath }/images/footer_logo.gif" alt="" title="" /><br /></div>
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