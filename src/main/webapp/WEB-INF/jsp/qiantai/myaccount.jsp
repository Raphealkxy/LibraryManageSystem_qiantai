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
    <style type="text/css">
        .tip{
            margin-top: 3px;
            font-size:12px;
            color:red;
            float: left;
            text-align: center;
            margin-left:10px;
            height:18px;
            line-height: 18px
        }

        input.checkcodeinput{
            width:100px;
            height:26px;
            background-color:#fff;
            color:black;
            border:1px #DFDFDF solid;
            float:left;
        }
        #captchaImage{
            float: left;
        }

    </style>
    <script>
        function change(){
            var img1 = document.getElementById("checkImg");
            img1.src="${pageContext.request.contextPath}/getcheckimg.action?"+new Date().getTime();
        }
    </script>
</head>
<body>
<div id="wrap">

       <div class="header">
       		<div class="logo"><a href="${pageContext.request.contextPath }/bookstore.action"><img src="${pageContext.request.contextPath }/images/logo.gif" alt="" title="" border="0" /></a></div>
           <div id="menu">
               <ul>
                   <li><a href="${pageContext.request.contextPath }/bookstore.action">主页</a></li>
                   <li><a href="${pageContext.request.contextPath }/getlibdata.action">关于我们</a></li>
                   <li><a href="${pageContext.request.contextPath}/book/getcategorybook?id=${12}&currentPage=${1}">书籍</a></li>
                   <li><a href="${pageContext.request.contextPath }/specials.action">搜搜</a></li>
                   <c:if test="${sessionScope.state==null}">
                   <li class="selected"><a href="${pageContext.request.contextPath }/myaccount.action">我的账户</a></li>
                   <li><a href="${pageContext.request.contextPath }/register.action">注册</a></li>
                   </c:if>
                   <li><a href="${pageContext.request.contextPath }/contact.action">联系我们</a></li>
               </ul>
           </div>
            
            
       </div> 
       
       
       <div class="center_content">
       	<div class="left_content">
            <div class="title"><span class="title_icon"><img src="${pageContext.request.contextPath }/images/bullet1.gif" alt="" title="" /></span>My account</div>
        
        	<div class="feat_prod_box_details">
            <p class="details">
             Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud.
            </p>

                <c:if test="${sessionScope.state==null}">
              	<div class="contact_form">
                <div class="form_subtitle">登陆账户</div>
                 <form name="register" action="${pageContext.request.contextPath}/userlogin.action" method="post">
                    <div class="form_row">
                    <input type="text" class="contact_input" id="username" name="username" value="${user.username}" placeholder="用户名"/>
                        <span id="tipusername" class="tip">${usernameError}</span>
                    </div>


                    <div class="form_row">
                    <input type="text" class="contact_input" id="password" name="password" value="${user.password}" placeholder="密码" />
                        <span id="tippassword" class="tip">${passwordError}</span>
                    </div>
                     <div class="form_row" >
                         <div id="checkcodemodel">
                         <input type="text" class="checkcodeinput" id="checkcode" name="checkcode" value="${checkcode}" placeholder="验证码" />
                         <img id="checkImg" class="captchaImage" src="${pageContext.request.contextPath}/getcheckimg.action" onclick="change()" title="点击更换验证码">
                     </div>
                         <span id="tipcheckcode" class="tip">${checkcodeError}</span>
                     </div>

                    
                    <div class="form_row">
                    <input type="submit" class="register" value="登陆" />
                    </div>   
                    
                  </form>     
                    
                </div>
                </c:if>
                <c:if test="${sessionScope.state!=null}">
                    <div class="contact_form">
                        <div class="form_subtitle">登陆账户</div>
                        <p><font color="green">恭喜您，登陆成功</font></p>

                    </div>

                </c:if>

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