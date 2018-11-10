<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ page import="com.max.model.User" %>
<%
    /***
     if(request.getAttribute("loginuser")==null){
     String num=null;
     String pwd=null;
     int grade=0;

     Cookie[] cookies=request.getCookies();
     for(int i=0;cookies!=null && i<cookies.length;i++){
     if(cookies[i].getName().equals("loginuser")){
     num=cookies[i].getValue().split("-")[0];
     pwd=cookies[i].getValue().split("-")[1];
     grade=Integer.valueOf(cookies[i].getValue().split("-")[2]);;
     }
     }

     if(num==null){
     num="";
     }

     if(pwd==null){
     pwd="";
     }

     if(grade==0){
     grade=0;
     } else if(0 < grade && grade < 5){
     pageContext.setAttribute("loginuser", new User(num,pwd));
     }

     }
     ***/
%>
<html lang="zh">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge" >
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>点检管理系统登录</title>
    <link href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/bootstrap/css/bootstrap-responsive.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath}/bootstrap/js/jQuery.js"></script>
    <script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript">
        function checkForm() {
            var num = document.getElementById("num").value;
            var pwd = document.getElementById("pwd").value;
            if (num == null || num == "") {
                document.getElementById("error").innerHTML = "工号不能为空";
                return false;
            }
            if (pwd == null || pwd == "") {
                document.getElementById("error").innerHTML = "密码不能为空";
                return false;
            }
            return true;
        }
    </script>

    <style type="text/css">
        body {
            padding-top: 20%;
            padding-bottom: 40px;
            background-image: url('images/bg3.jpg');
            background-position: center;
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-size:cover;
        }

        .radio {
            padding-top: 10px;
            padding-bottom:10px;
        }

        .form-signin-heading{
            text-align: center;
        }

        .form-signin {
            max-width: 300px;
            padding: 26px 36px 16px;
            margin: 0 auto 20px;
            background-color: #fff;
            border: 1px solid #e5e5e5;
            -webkit-border-radius: 5px;
            -moz-border-radius: 5px;
            border-radius: 5px;
            -webkit-box-shadow: 0 1px 2px rgba(0,0,0,.05);
            -moz-box-shadow: 0 1px 2px rgba(0,0,0,.05);
            box-shadow: 0 1px 2px rgba(0,0,0,.05);
        }
        .form-signin .form-signin-heading,
        .form-signin .checkbox {
            margin-bottom: 10px;
        }
        .form-signin input[type="text"],
        .form-signin input[type="pwd"] {
            font-size: 16px;
            height: auto;
            margin-bottom: 15px;
            padding: 7px 9px;
        }
    </style>

</head>
<body>
<div class="container">
    <form name="myForm" class="form-signin" action="login" method="post" onsubmit="return checkForm()">
        <h2 class="form-signin-heading"><font color="gray">点检管理系统</font></h2>
        <input id="num" name="num" value="${loginuser.num }" type="text" class="input-block-level" placeholder="工号" onkeydown="changeEnter()">
        <input id="pwd" name="pwd" value="${loginuser.pwd }" type="password" class="input-block-level" placeholder="密码" >
        <label ><font id="error" color="red">${error }</font></label>
        <div align="center" style="float: center;">
            <button style="width: 100%;" class="btn btn-large btn-primary" type="submit">登录</button>
        </div>
        <div>
            <p align="center" style="float: center;padding-top: 16px;">版权所有  2017 ZS</p>
        </div>
    </form>
</div>
</body>
</html>