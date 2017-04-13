<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
	<div class="commonTitle">
	  <h2>&gt;&gt;建设项目审查</h2>
	</div>
    <table width="100%" border="0" cellspacing="0" cellpadding="0" class="commonTableSearch">
       	<form id="form-search" name="form-search" action="" method="post">
        <tr>
          <th align="right">专业类别：</th>
          <td><select name="select" id="select">
            <option value="">公共场所</option>
            <option value="">生活饮用水</option>
            <option value="">职业卫生</option>
            <option value="">放射卫生</option>
            <option value="">其他</option>
          </select></td>
          <td><div align="right">单位名称（个人）：</div></td>
          <td><input name="textfield6" type="text" class="inputTextNormal" id="textfield6" /></td>
          <td align="right">组织机构代码：</td>
          <td align="right"><input name="textfield62" type="text" class="inputTextNormal" id="textfield62" /></td>
          <td align="right">身份证号码：</td>
          <td align="right"><input name="textfield622" type="text" class="inputTextNormal" id="textfield622" /></td>
        </tr>
        <tr>
            <th align="right">行政区划：</th>
            <td><input name="textfield63" type="text" class="inputTextNormal" id="textfield63" value="用地址进行后台匹配" /></td>
            <td><div align="right">报告单位：</div></td>
            <td><input name="textfield64" type="text" class="inputTextNormal" id="textfield64" /></td>
            <td align="right">报告人：</td>
            <td align="right"><input name="textfield642" type="text" class="inputTextNormal" id="textfield642" /></td>
            <td align="right">&nbsp;</td>
            <td align="right"><button>检索</button></td>
        </tr>
       	</form>
    </table>
    <!--//commonTableSearch-->
    <div class="btnBar">
    	<ul class="clearfix">
        	<li><a href="${pageContext.request.contextPath}/institution/toInstitutionCreatPage.do" title="创建机构" class="btnNormal">新增</a></li>
        </ul>
    </div>
    <table border="0" cellspacing="1" cellpadding="0" class="commonTable">
        <tr>
            <th width="7%">申请单位（个人）</th>
            <th>经营地址</th>
            <th width="8%">专业类别</th>
            <th>负责人</th>
            <th width="5%">报告日期</th>
            <th width="7%">审核状态</th>
            <th class="editColM">操作</th>
        </tr>
       
  <c:forEach items="${pageModel.items}" var="organization">
        <tr>
        <c:set var="orgId" value="${organization.id}" scope="page"></c:set>
            <td align="center">${organization.orgNo}</td>
            <td align="left"><a href="${pageContext.request.contextPath}/mvc/institution/toInstitutionViewPage/${orgId}">${organization.orgName}</a></td>
            <td align="center">${organization.exeType}</td>
            <td align="left">${organization.linkAdd}</td>
            <td align="center"><fmt:formatDate value="${organization.listingDate}" pattern="yyyy-MM-dd"/></td>
            <td align="center"><fmt:formatDate value="${organization.standaloneDate}" pattern="yyyy-MM-dd"/></td>
            <td align="center">
            	<a href="${pageContext.request.contextPath}/mvc/institution/toInstitutionViewPage/${orgId}" class="btnIconView" title="查看详情"></a>
            	<a href="institution-creat.html" class="btnIconEdit" title="更新"></a>
                
                </td>
        </tr>
</c:forEach>
<c:if test="${fn:length(pageModel.items)<pageModel.pageSize}">
	<c:forEach begin="1" end="${pageModel.pageSize- fn:length(pageModel.items)}">
		<tr>
            <td align="center"></td>
            <td align="left"></td>
            <td align="center"></td>
            <td align="left"></td>
            <td align="center"></td>
            <td align="center"></td>
            <td align="center">
			</td>
        </tr>
	</c:forEach>
</c:if>
    </table>
    <!--//commonTable-->
    <div id="pagelist">
    	<ul class="clearfix">
        	<li><a href="${pageContext.request.contextPath}/mvc/institution/toInstitutionList/1">首页</a></li>
            <li><a href="${pageContext.request.contextPath}/mvc/institution/toInstitutionList/${pageModel.pageNo-1}">上页</a></li>
            <c:forEach begin="1" end="${pageModel.totalPage}" var="x">
                       <li><a href="${pageContext.request.contextPath}/mvc/institution/toInstitutionList/${x}">${x}</a></li> 	
            </c:forEach>
            <li><a href="${pageContext.request.contextPath}/mvc/institution/toInstitutionList/${pageModel.pageNo+1}">下页</a></li>
            <li><a href="${pageContext.request.contextPath}/mvc/institution/toInstitutionList/${pageModel.totalPage}">尾页</a></li>
            <li class="pageinfo">第${pageModel.pageNo}页</li>
            <li class="pageinfo">共${pageModel.totalPage}页</li>
        </ul>
    </div>
</div>
<!--//content pages wrap-->
</body>
</html>
