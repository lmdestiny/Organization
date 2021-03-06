﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base  href="<%=basePath%>"/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=7" />
<title>江苏省卫生监督业务系统</title>
<link href="css/main.css" rel="stylesheet" type="text/css" media="all" />
<script src="js/jquery-1.4.2.min.js" type="text/javascript"></script>
</head>

<body class="content-pages-body">
<div class="content-pages-wrap">
    <div class="commonTitle"><h2>&gt;&gt; <a href="institution-list.html">机构管理</a> - 机构财政拨款</h2></div>
    <table border="0" cellspacing="1" cellpadding="0" class="commonTable">
        <form id="institutionCreat" name="institutionCreat" action="" method="post">
        <tr>
            <td rowspan="2" align="right"><span class="required">*</span>选择年度：</td>
            <td rowspan="2" align="left"><select name="select" id="select">
			 <option value="">2011</option>
			 <option value="">2010</option>
			 <option value="">2009</option>
			 <option value="">...</option>
			</select></td>
            <td align="right">人员经费（万元）：</td>
            <td align="left"><input name="textfield7" type="text" class="inputTextNormal" id="textfield7" /></td>
            <td align="right">公务费（万元）：</td>
            <td align="left"><input name="textfield" type="text" class="inputTextNormal" id="textfield" /></td>
        </tr>
        <tr>
            <td align="right">业务经费（万元）：</td>
            <td align="left"><input name="textfield9" type="text" class="inputTextNormal" id="textfield9" /></td>
            <td align="right">基本建设资金（万元）：</td>
            <td align="left"><input name="textfield9" type="text" class="inputTextNormal" id="textfield9" /></td>
            </tr>
        </form>
    </table>
    <!--//commonTable-->
    <div id="formPageButton">
    	<ul>
        	<li><a href="institution-view.html" title="保存" class="btnShort">保存</a></li>
        	<li><a href="javascript:window.history.go(-1)" title="返回" class="btnShort">返回</a></li>
        </ul>
    </div>
    <!--//commonToolBar-->
</div>
<!--//content pages wrap-->
</body>
</html>
