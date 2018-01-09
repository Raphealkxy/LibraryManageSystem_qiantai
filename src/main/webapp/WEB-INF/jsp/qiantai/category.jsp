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
<style>
    .new_prod_box img{
        width: 60px;
        height: 80px;
    }
    .pagination .current a{
        color: #fdfdfd;
    }
</style>
</head>
<body>
<div id="wrap">

       <div class="header">
       		<div class="logo"><a href="${pageContext.request.contextPath }/bookstore.action"><img src="${pageContext.request.contextPath }/images/logo.gif" alt="" title="" border="0" /></a></div>
           <div id="menu">
               <ul>
                   <li><a href="${pageContext.request.contextPath }/bookstore.action">主页</a></li>
                   <li><a href="${pageContext.request.contextPath }/getlibdata.action">关于我们</a></li>
                   <li class="selected"><a href="${pageContext.request.contextPath}/book/getcategorybook?id=${12}&currentPage=${1}">书籍</a></li>
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
        	<div class="crumb_nav">
            <a href="index.html">home</a> &gt;&gt;${category.cname}
            </div>
            <div class="title"><span class="title_icon"><img src="${pageContext.request.contextPath }/images/bullet1.gif" alt="" title="" /></span>${category.cname}</div>
           
           <div class="new_products">

               <c:forEach items="${pageBean.list}" var="item">
                    <div class="new_prod_box">
                        <a href="${pageContext.request.contextPath}/book/getbook?id=${item.bid}">${item.bname}</a>
                        <div class="new_prod_bg">
                        <a href="${pageContext.request.contextPath}/book/getbook?id=${item.bid}"><img src="${pageContext.request.contextPath }/images/${item.image}" alt="" title="" class="thumb" border="0" /></a>
                        </div>           
                    </div>
               </c:forEach>


                    

       




            <div class="pagination">
                  <c:if test="${pageBean.currentPage!=1}">
                <span class="current"><a href="${pageContext.request.contextPath}/book/getcategorybook?id=${category.cid}&currentPage=${pageBean.currentPage-1}">上一页</a></span>
                  </c:if>
                <c:if test="${pageBean.currentPage!=pageBean.totalPage}">
                <span class="current"><a href="${pageContext.request.contextPath}/book/getcategorybook?id=${category.cid}&currentPage=${pageBean.currentPage+1}">下一页</a></span>
                </c:if>

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