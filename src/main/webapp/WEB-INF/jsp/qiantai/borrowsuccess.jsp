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
	<link rel="stylesheet" href="${pageContext.request.contextPath }/css/lightbox.css" type="text/css" media="screen" />

	<script src="${pageContext.request.contextPath }/js/prototype.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath }/js/scriptaculous.js?load=effects" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath }/js/lightbox.js" type="text/javascript"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/java.js"></script>


    <style>
        .prod_img .bookimg{
            width:105px;
            height:160px;
        }

        .new_prod_bg img{
            width: 60px;
            height: 80px;
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
        	<div class="crumb_nav">
            <a href="${pageContext.request.contextPath }/bookstore.action">home</a> &gt;&gt; ${itembook.bname}
            </div>
            <div class="title"><span class="title_icon"><img src="${pageContext.request.contextPath }/images/bullet1.gif" alt="" title="" /></span>${itembook.bname}</div>
        
        	<div class="feat_prod_box_details">
            
            	<div class="prod_img"><a href="${pageContext.request.contextPath}/book/getbook?id=${itembook.bid}"><img class="bookimg" src="${pageContext.request.contextPath }/images/${itembook.image}" alt="" title="" border="0" /></a>
                <br /><br />
                <a href="${pageContext.request.contextPath }/images/${itembook.image}" rel="lightbox" ><img src="${pageContext.request.contextPath }/images/zoom.gif" alt="" title="" border="0" /></a>
                </div>
                
                <div class="prod_det_box">
                	<div class="box_top"></div>
                    <div class="box_center">
                    <div class="prod_title">详情</div>
                    <p class="details">${itembook.bdesc1}<br />
                  ${itembook.bdesc2} </p>
                    <div class="price"><strong>库存:</strong> <span class="red">${itembook.num}</span></div>
                    <div class="price"><strong>颜色:</strong>
                    <span class="colors"><img src="${pageContext.request.contextPath }/images/color1.gif" alt="" title="" border="0" /></span>
                    <span class="colors"><img src="${pageContext.request.contextPath }/images/color2.gif" alt="" title="" border="0" /></span>
                    <span class="colors"><img src="${pageContext.request.contextPath }/images/color3.gif" alt="" title="" border="0" /></span>                    </div>

                    <div class="clear"></div>
                    </div>
                    
                    <div class="box_bottom"></div>
                </div>    
            <div class="clear"></div>
            </div>


            <div class="contact_form">
                <div class="form_subtitle">填写借书信息</div>

               <p style="color: #2b542c">借阅成功，继续借阅请点击<a href="${pageContext.request.contextPath}/bookstore.action">此处</a></p>
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
<script>




    var tabber1 = new Yetii({
        id: 'demo'
    });
</script>
</html>