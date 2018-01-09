    <%@ page language="java" contentType="text/html; charset=UTF-8"
             pageEncoding="UTF-8" %>
        <%@ page isELIgnored="false" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
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
                        .prod_img img{
                                width:98px;
                                height:150px;
                        }
                </style>
        </head>
        <body>
        <div id="wrap">

        <div class="header">
        <div class="logo"><a href="bookstore.action"><img src="${pageContext.request.contextPath }/images/logo.gif" alt="" title="" border="0" /></a></div>
        <div id="menu">
                <ul>
                        <li class="selected"><a href="bookstore.action">首页</a></li>
                        <li><a href="getlibdata.action">关于我们</a></li>
                        <li><a href="${pageContext.request.contextPath}/book/getcategorybook?id=${12}&currentPage=${1}">书籍</a></li>
                        <li><a href="specials.action">搜搜</a></li>
                        <c:if test="${sessionScope.state==null}">
                        <li><a href="myaccount.action">我的账户</a></li>
                                <li><a href="register.action">注册</a></li>
                        </c:if>
                        <li><a href="contact.action">联系我们</a></li>
                </ul>
        </div>


        </div>


        <div class="center_content">
        <div class="left_content">

        <div class="title"><span class="title_icon"><img src="${pageContext.request.contextPath }/images/bullet1.gif" alt="" title="" /></span>热门书籍</div>

                <c:forEach items="${sessionScope.hotBook}" var="item">
                        <div class="feat_prod_box">

                                <div class="prod_img"><a href="${pageContext.request.contextPath}/book/getbook?id=${item.bid}"><img
                                        src="${pageContext.request.contextPath }/images/${item.image}" alt="" title=""
                                        border="0"/></a></div>

                                <div class="prod_det_box">
                                        <div class="box_top"></div>
                                        <div class="box_center">
                                                <div class="prod_title">${item.bname}</div>
                                                <p class="details">${item.bdesc1}</p>
                                                <a href="${pageContext.request.contextPath}/book/getbook?id=${item.bid}" class="more">- 更多详情 -</a>
                                                <div class="clear"></div>
                                        </div>

                                        <div class="box_bottom"></div>
                                </div>
                                <div class="clear"></div>
                        </div>
                </c:forEach>



        <div class="title"><span class="title_icon"><img src="${pageContext.request.contextPath }/images/bullet2.gif" alt="" title="" /></span>最新书籍
        </div>

        <div class="new_products">

                <c:forEach items="${sessionScope.newestBook}" var="item">
                        <div class="new_prod_box">
                                <a href="${pageContext.request.contextPath}/book/getbook?id=${item.bid}">${item.bname}</a>
                                <div class="new_prod_bg">
                                        <span class="new_icon"><img
                                                src="${pageContext.request.contextPath }/images/new_icon.gif" alt=""
                                                title=""/></span>
                                        <a href="${pageContext.request.contextPath}/book/getbook?id=${item.bid}"><img
                                                src="${pageContext.request.contextPath }/images/${item.image}" alt=""
                                                title="" class="thumb" border="0"/></a>
                                </div>
                        </div>
                </c:forEach>

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