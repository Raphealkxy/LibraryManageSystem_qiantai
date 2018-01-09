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
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/normalize.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style2.css">
    <style>
        .prod_img img{
            width:105px;
            height:155px;
        }
    </style>
</head>
<body>
<div id="wrap">

       <div class="header">
       		<div class="logo"><a href="${pageContext.request.contextPath }/bookstore.action"><img src="${pageContext.request.contextPath }/images/logo.gif" alt="" title="" border="0" /></a></div>
           <div id="menu">
               <ul>
                   <li><a href="${pageContext.request.contextPath }/bookstore.action">注册</a></li>
                   <li><a href="${pageContext.request.contextPath }/getlibdata.action">关于我们</a></li>
                   <li><a href="${pageContext.request.contextPath}/book/getcategorybook?id=${12}&currentPage=${1}">书籍</a></li>
                   <li class="selected"><a href="${pageContext.request.contextPath }/specials.action">搜搜</a></li>
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
            <div class="search d1">
                <form class="searchbox" action="${pageContext.request.contextPath}/book/getsomebooks.action?currentPage=${1}" method="post">
                    <input type="text" placeholder="搜索从这里开始..." name="name">
                    <button type="submit"></button>
                </form>
            </div>

            <c:if test="${pageBean!=null}">
            <div class="title"><span class="title_icon"><img src="${pageContext.request.contextPath }/images/bullet1.gif" alt="" title="" /></span>搜索结果</div>


            <c:forEach items="${pageBean.list}" var="itembook">
        	<div class="feat_prod_box">

            	<div class="prod_img"><a href="${pageContext.request.contextPath}/book/getbook?id=${itembook.bid}"><img src="${pageContext.request.contextPath }/images/${itembook.image}" alt="" title="" border="0" /></a></div>

                <div class="prod_det_box">
                	<span class="special_icon"><img src="${pageContext.request.contextPath }/images/special_icon.gif" alt="" title="" /></span>
                	<div class="box_top"></div>
                    <div class="box_center">
                    <div class="prod_title">${itembook.bname}</div>
                    <p class="details">${itembook.bdesc1}</p>
                    <a href="${pageContext.request.contextPath}/book/getbook?id=${itembook.bid}" class="more">- more details -</a>
                    <div class="clear"></div>
                    </div>

                    <div class="box_bottom"></div>
                </div>
            <div class="clear"></div>
            </div>
            </c:forEach>
            </c:if>





            <c:if test="${pageBean!=null&&pageBean.totalCount>0}">
            <div class="pagination">
                <c:if test="${pageBean.currentPage!=1}">
                    <span class="current"><a href="${pageContext.request.contextPath}/book/getcategorybook?id=${category.cid}&currentPage=${pageBean.currentPage-1}">上一页</a></span>
                </c:if>
                <c:if test="${pageBean.currentPage!=pageBean.totalPage}">
                    <span class="current"><a href="${pageContext.request.contextPath}/book/getcategorybook?id=${category.cid}&currentPage=${pageBean.currentPage+1}">下一页</a></span>
                </c:if>

            </div>
            </c:if>


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