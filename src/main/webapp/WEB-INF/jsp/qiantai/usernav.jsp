<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<div class="right_content">

    <c:if test="${sessionScope.state!=null}">
        <div class="cart">
            <div class="left" style="float: left">
                <span class="red">用户名:</span>
                <span>${sessionScope.user.username}</span>
            </div>
            <div class="right" style="float: right">
                <span class="red"><font color="#a52a2a">修改密码</font></span>
                <span class="red">|</span>
                <span class="red"><a href="${pageContext.request.contextPath }/userLogout.action" style="outline: none;border: none;color:#a52a2a;text-decoration:none">登出</a></span>
                <span class="red">|</span>
                <span class="red"><a href="${pageContext.request.contextPath }/borrower/getBorrowBooks.action?uid=${sessionScope.user.uid}"  style="outline: none;border: none;color:#a52a2a;text-decoration:none ">借书记录</a></span>
            </div>
        </div>
    </c:if>


    <div class="title"><span class="title_icon"><img src="${pageContext.request.contextPath }/images/bullet3.gif" alt="" title="" /></span>图书馆简介</div>
    <div class="about">
        <p style="text-indent: 35px">
            <img src="${pageContext.request.contextPath }/images/about.gif" alt="" title="" class="right" />
            ${sessionScope.aboutourstore}
        </p>

    </div>

    <div class="right_box">

        <div class="title"><span class="title_icon"><img src="${pageContext.request.contextPath }/images/bullet4.gif" alt="" title="" /></span>Promotions</div>
        <div class="new_prod_box">
            <a href="details.html">product name</a>
            <div class="new_prod_bg">
                <span class="new_icon"><img src="${pageContext.request.contextPath }/images/promo_icon.gif" alt="" title="" /></span>
                <a href="details.html"><img src="${pageContext.request.contextPath }/images/thumb1.gif" alt="" title="" class="thumb" border="0" /></a>
            </div>
        </div>

        <div class="new_prod_box">
            <a href="details.html">product name</a>
            <div class="new_prod_bg">
                <span class="new_icon"><img src="${pageContext.request.contextPath }/images/promo_icon.gif" alt="" title="" /></span>
                <a href="details.html"><img src="${pageContext.request.contextPath }/images/thumb2.gif" alt="" title="" class="thumb" border="0" /></a>
            </div>
        </div>

        <div class="new_prod_box">
            <a href="details.html">product name</a>
            <div class="new_prod_bg">
                <span class="new_icon"><img src="${pageContext.request.contextPath }/images/promo_icon.gif" alt="" title="" /></span>
                <a href="details.html"><img src="${pageContext.request.contextPath }/images/thumb3.gif" alt="" title="" class="thumb" border="0" /></a>
            </div>
        </div>

    </div>

    <div class="right_box">

        <div class="title"><span class="title_icon"><img src="${pageContext.request.contextPath }/images/bullet5.gif" alt="" title="" /></span>书籍分类</div>

        <ul class="list">
            <c:forEach items="${sessionScope.itemCategories }" var="item">

                <li><a href="${pageContext.request.contextPath}/book/getcategorybook?id=${item.cid}&currentPage=${1}">${item.cname}</a></li>
            </c:forEach>

        </ul>

        <div class="title"><span class="title_icon"><img src="${pageContext.request.contextPath }/images/bullet6.gif" alt="" title="" /></span>Partners</div>

        <ul class="list">
            <li><a href="#">accesories</a></li>
            <li><a href="#">books gifts</a></li>
            <li><a href="#">specials</a></li>
            <li><a href="#">hollidays gifts</a></li>
            <li><a href="#">accesories</a></li>
            <li><a href="#">books gifts</a></li>
            <li><a href="#">specials</a></li>
            <li><a href="#">hollidays gifts</a></li>
            <li><a href="#">accesories</a></li>
        </ul>

    </div>


</div><!--end of right content-->

