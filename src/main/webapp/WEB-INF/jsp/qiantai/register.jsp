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
                   <li class="selected"><a href="${pageContext.request.contextPath }/register.action">注册</a></li>
                   </c:if>
                   <li><a href="${pageContext.request.contextPath }/contact.action">联系我们</a></li>
               </ul>
           </div>
            
            
       </div> 
       
       
       <div class="center_content">
       	<div class="left_content">
            <div class="title"><span class="title_icon"><img src="${pageContext.request.contextPath }/images/bullet1.gif" alt="" title="" /></span>Register</div>
        
        	<div class="feat_prod_box_details">
            <p class="details">
             Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud.
            </p>
            
              	<div class="contact_form">
                <div class="form_subtitle">新用户注册</div>
                 <form name="register" action="${pageContext.request.contextPath}/registerUser.action" onsubmit="return checkForm();" method="post">
                    <div class="form_row">
                    <input type="text" class="contact_input" id="username" name="username" value="${userinfo.username}" placeholder="用户名" onblur="checkusername()"/>
                        <span id="tipusername" class="tip"></span>
                    </div>  


                    <div class="form_row">
                    <input type="password" class="contact_input" id="password" name="password" value="${userinfo.password}" placeholder="密码"/>
                        <span id="tippassword" class="tip"></span>
                    </div>


                     <div class="form_row">
                         <input type="password" class="contact_input" id="repassword"  placeholder="确认密码"/>
                         <span id="tiprepassword" class="tip"></span>
                     </div>

                     <div class="form_row">
                         <input type="text" class="contact_input" id="name" name="name" value="${userinfo.name}" placeholder="姓名"/>
                         <span id="tipname" class="tip"></span>
                     </div>


                     <div class="form_row">
                    <input type="text" class="contact_input" id="email" name="email" value="${userinfo.email}" placeholder="电子邮件" onblur="checkemail()" />
                         <span id="tipemail" class="tip"></span>
                     </div>


                    <div class="form_row">
                    <input type="text" class="contact_input" id="phone" name="phone" value="${userinfo.phone}" placeholder="电话号码" onblur="checkphone()" />
                        <span id="tipphone" class="tip"></span>
                    </div>
                    
                    <div class="form_row">
                    <input type="text" class="contact_input" id="address" name="addr" value="${userinfo.addr}" placeholder="家庭住址" />
                        <span id="tipuseraddress" class="tip"></span>
                    </div>                    

                    <div class="form_row">
                        <div class="terms">
                        <input type="checkbox" name="terms" id="termif" value="yes" />
                        我同意<a href="#">相关条款</a><span id="tiptermif" class="tip"></span>

                        </div>
                    </div>

                    
                    <div class="form_row">
                    <input type="submit" class="register" value="注册" />
                    </div>   
                  </form>     
                </div>  
            
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
<script>
    function checkForm() {
        var username = document.getElementById("username").value;
        var password = document.getElementById("password").value;
        var repassword = document.getElementById("repassword").value;
        var name = document.getElementById("name").value;
        var email = document.getElementById("email").value;
        var phone = document.getElementById("phone").value;
        var address = document.getElementById("address").value;
        var termif = document.getElementById("termif").checked;
        var tipusername=document.getElementById("tipusername").innerText;
        var tipemail=document.getElementById("tipemail").innerText;
        var tipphone=document.getElementById("tipphone").innerText;

        if(tipusername=="*用户名存在"||tipusername=="*用户名必填")
            return false;
        if(tipemail=="*邮箱格式错")
            return false;
        if(tipphone=="*电话格式错")
            return false;
        if(username==""||username==null||password==""||password==null||repassword==""||
            repassword==null||name==""||name==null||email==""||email==null||phone==""||phone==null||address==""||address==null||termif==false){
            if(username==""||username==null){
                document.getElementById("tipusername").innerText="*用户名必填";
            }
            if(password==""||password==null){
                document.getElementById("tippassword").innerText="*密码必填";

            }

            if(repassword==""||repassword==null) {
                document.getElementById("tiprepassword").innerText = "*确认密码";

            }else if(repassword!=password){
                document.getElementById("tiprepassword").innerText="*密码不一致";

            }
            if(name==""||name==null){
                document.getElementById("tipname").innerText="*姓名必填";

            }
            if(email==""||email==null)
                document.getElementById("tipemail").innerText="*邮箱必填";
            if(phone==""||phone==null)
                document.getElementById("tipphone").innerText="*电话必填";
            if(address==""||address==null)
                document.getElementById("tipuseraddress").innerText="*地址必填";

            if(termif==false)
                document.getElementById("tiptermif").innerText="*条款是否同意";


            return false;
        }
        return true;

    }

    function checkusername() {
        var username = document.getElementById("username").value;

        //创建异步交换对象
        var xhr;
        //根据是否支持XMLHttpRequest对象
        if (window.XMLHttpRequest)
        {
            xhr=new XMLHttpRequest();
        }
        else
        {
            xhr=new ActiveXObject("Microsoft.XMLHTTP");
        }
        //创建响应服务器
        xhr.onreadystatechange=function()
        {
            if(xhr.readyState == 4){
                if(xhr.status == 200){
                    document.getElementById("tipusername").innerHTML = xhr.responseText;
                }
            }
        }
        //打开连接 请求
        xhr.open("GET","${pageContext.request.contextPath }/checkusername.action?time="+new Date().getTime()+"&username="+username,true);
        //发送
        xhr.send();
    }

    function checkemail() {
        var email = document.getElementById("email").value;
        var pattern= /^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
        var strEmail=pattern.test(email);
        if(!strEmail) {
            if(email=="")
            document.getElementById("tipemail").innerText="*邮箱必填";
            else
                document.getElementById("tipemail").innerText="*邮箱格式错";

        }else {
            //document.getElementById("tipemail").innerText="";
            //创建异步交换对象
            var xhr;
            //根据是否支持XMLHttpRequest对象
            if (window.XMLHttpRequest)
            {
                xhr=new XMLHttpRequest();
            }
            else
            {
                xhr=new ActiveXObject("Microsoft.XMLHTTP");
            }
            //创建响应服务器
            xhr.onreadystatechange=function()
            {
                if(xhr.readyState == 4){
                    if(xhr.status == 200){
                        document.getElementById("tipemail").innerHTML = xhr.responseText;
                    }
                }
            }
            //打开连接 请求
            xhr.open("GET","${pageContext.request.contextPath }/checkemail.action?time="+new Date().getTime()+"&email="+email,true);
            //发送
            xhr.send();

        }

    }
    function checkphone() {
        var phone = document.getElementById("phone").value;
        var pattern=/^((13[0-9])|(15[1-3,5-9])|(17[7])|(18[0-9]))\d{8}$/;
        var strPhone=pattern.test(phone);
        if(!strPhone){
            if(phone=="")
                document.getElementById("tipphone").innerText="*电话必填";
            else
            document.getElementById("tipphone").innerText="*电话格式错";

        }else{
           // document.getElementById("tipphone").innerText="";
            //创建异步交换对象
            var xhr;
            //根据是否支持XMLHttpRequest对象
            if (window.XMLHttpRequest)
            {
                xhr=new XMLHttpRequest();
            }
            else
            {
                xhr=new ActiveXObject("Microsoft.XMLHTTP");
            }
            //创建响应服务器
            xhr.onreadystatechange=function()
            {
                if(xhr.readyState == 4){
                    if(xhr.status == 200){
                        document.getElementById("tipphone").innerHTML = xhr.responseText;
                    }
                }
            }
            //打开连接 请求
            xhr.open("GET","${pageContext.request.contextPath }/checkphone.action?time="+new Date().getTime()+"&phone="+phone,true);
            //发送
            xhr.send();

        }
    }
</script>
</html>