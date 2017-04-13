<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> 
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
<script type="text/javascript">
$(function(){
	$("#save").click(function(){
		$("#institutionCreat").submit();
	});
	$("#submit").click(function(){
		$("#institutionCreat").submit();
	});
	$("input")
	$("input[value='${orgattached.organization.areaType}']").attr("checked","checked");
	$("option[value='${orgattached.organization.orgPro}']").attr("selected","selected");
	$("option[value='${orgattached.organization.orgLevel}']").attr("selected","selected");
	$("option[value='${orgattached.buildingOwnership}']").attr("selected","selected");
	$("input[value='${orgattached.ifPublicmanage}']").attr("checked","checked");
});
</script>
</head>

<body class="content-pages-body">
<div class="content-pages-wrap">
    <div class="commonTitle"><h2>&gt;&gt; <a href="${pageContext.request.contextPath}/institution/toInstitutionList.do">机构管理</a> - 机构创建</h2></div>
    <table border="0" cellspacing="1" cellpadding="0" class="commonTable">
        <form id="institutionCreat" name="institutionCreat" action="" method="post">     
        <tr>
         <td align="right"><span class="required">*</span>机构编码：</td>
            <td align="left"><input name="organization.orgNo" type="text" class="inputTextMiddle" id="textfield" value="${orgattached.organization.orgNo}"/></td>
             <td align="right"><span class="required">*</span>机构代码：</td>
            <td align="left" colspan="3"><input name="organization.orgCode" value="${orgattached.organization.orgCode}" type="text" class="inputTextMiddle" id="textfield" />(<span class="required">代码格式:XXXXXXXX-X</span>)</td>
        </tr>
        <tr>
            <td align="right"><span class="required">*</span>机构名称：</td>
            <td align="left"><input name="organization.orgName" value="${orgattached.organization.orgName}" type="text" class="inputTextMiddle" id="textfield2" /></td>
            <td align="right"><span class="required">*</span>行政类别：</td>
            <td align="left" colspan="4">
            <c:if test="${orgattached.organization.exeType =='行政部门'}">
            	<input type="radio" name="organization.exeType" id="radio5" value="行政部门" checked="checked" />行政部门
            </c:if>
             <c:if test="${orgattached.organization.exeType !='行政部门'}">
            	<input type="radio" name="organization.exeType" id="radio5" value="行政部门"  />行政部门
            </c:if>
            
             <c:if test="${orgattached.organization.exeType =='卫生监督机构'}">
                <input type="radio" name="organization.exeType" id="radio6" value="卫生监督机构" checked="checked"/>卫生监督机构
            </c:if>
             <c:if test="${orgattached.organization.exeType !='卫生监督机构'}">
                 <input type="radio" name="organization.exeType" id="radio6" value="卫生监督机构"/>卫生监督机构
            </c:if>
            
             <c:if test="${orgattached.organization.exeType =='协作单位'}">
             	 <input type="radio" name="organization.exeType" id="radio7" value="协作单位" checked="checked"/>协作单位
            </c:if>
             <c:if test="${orgattached.organization.exeType !='协作单位'}">
                <input type="radio" name="organization.exeType" id="radio7" value="协作单位"/>协作单位
            </c:if>
            
            </td>
        </tr>
        <tr>
            <td align="right">地址：</td>
            <td colspan="3" align="left"><input name="organization.linkAdd" value="${orgattached.organization.linkAdd}" type="text" class="inputTextLong" id="textfield5"  /></td>
            <td align="right">邮编：</td>
            <td align="left"><input name="organization.zipCode" value="${orgattached.organization.zipCode}" type="text" class="inputTextNormal" id="textfield4" /></td>
        </tr>
        <tr>
       	     <td align="right"><span class="required">*</span>行政区划：</td>
            <td align="left"><input name="organization.areaCode" value="${orgattached.organization.areaCode}" type="text" class="inputTextNormal" id="textfield6" /></td>
            <td align="right">挂牌日期：</td>
            <td align="left"><input name="organization.listingDate" value="<fmt:formatDate value="${orgattached.organization.listingDate}" pattern="yyyy-MM-dd"/>" type="text" class="inputTextNormal" id="textfield6" /></td>
            <td align="right">独立运行日期：</td>
            <td align="left"><input name="organization.standaloneDate" value="<fmt:formatDate value="${orgattached.organization.standaloneDate}" pattern="yyyy-MM-dd"/>" type="text" class="inputTextNormal" id="textfield7" /></td>
        </tr>
        <tr>
         <td align="right"><span class="required">*</span>行政区类别：</td>
            <td align="left">
            	<input type="radio" name="organization.areaType" id="radio1" value="省" />省
                <input type="radio" name="organization.areaType" id="radio2" value="市" />市
                <input type="radio" name="organization.areaType" id="radio3" value="县" />县
                <input type="radio" name="organization.areaType" id="radio4" value="区" />区

            </td>
            <td align="right">在职人数：</td>
            <td align="left"><input name="onworkerNum" value="${orgattached.onworkerNum}" type="text" class="inputTextNormal" id="textfield8" /></td>
            <td align="right">卫生监督员数：</td>
            <td align="left"><input name="supervisorNum" value="${orgattached.supervisorNum}" type="text" class="inputTextNormal" id="textfield9" /></td>
        </tr>
		<tr>
            <td align="right"><span class="required">*</span>机构行政级别 ：</td>
            <td align="left"><select name="organization.orgLevel" id="select">
			 <option value="">请选择</option>
			 <option value="处级">处级</option>
			 <option value="副处级">副处级</option>
			 <option value="科级">科级</option>
			 <option value="副科级">副科级</option>
			 <option value="乡级及以下">乡级及以下</option>
			</select></td>
            <td align="right"><span class="required">*</span>机构性质：</td>
            <td align="left"><select name="organization.orgPro" id="select5">
              <option value="" >请选择</option>
              <option value="行政机构">行政机构</option>
              <option value="全额拔款事业单位">全额拔款事业单位</option>
              <option value="差额拔款事业单位">差额拔款事业单位</option>
              <option value="自收自支事业单位">自收自支事业单位</option>
              <option value="其他">其他</option>
            </select></td>
             <td align="right">编办批文日期：</td>
            <td align="left"><input name="organization.zbbdocDate" value="<fmt:formatDate value="${orgattached.organization.zbbdocDate}" pattern="yyyy-MM-dd"/>" type="text" class="inputTextNormal" id="textfield936" /></td>
        </tr>
		<tr>
            <td align="right"><span class="required">*</span>是否参公管理 ：</td>
            <td align="left"><input type="radio" name="ifPublicmanage" value="是"/>是<input type="radio" name="ifPublicmanage" value="否">否</td>
            <td align="right"><span class="required">*</span>离退休人数 ：</td>
            <td align="left"><input name="retireNum" value="${orgattached.retireNum}" type="text" class="inputTextNormal" id="textfield9" /></td>
            <td align="right"><span class="required">*</span>编制人数 ：</td>
            <td align="left"><input name="zbbNum" value="${orgattached.zbbNum}" type="text" class="inputTextNormal" id="textfield935" /></td>
        </tr>
		<tr>
            <td align="right"><span class="required">*</span>房屋所有权 ：</td>
            <td align="left"><select name="buildingOwnership"  id="select">
			 <option value="">请选择</option>
			 <option value="自有">自有</option>
			 <option value="借">借</option>
			 <option value="租">租</option>
			</select></td>
            <td align="right"> 办公用房在建面积（平方米） ：</td>
            <td align="left"><input name="officeBuildingarea" value="${orgattached.officeBuildingarea}" type="text" class="inputTextNormal" id="textfield9" /></td>
            <td align="right"> <span class="required">*</span>办公用房建筑面积（平方米） ：</td>
            <td align="left"><input name="officeBuildarea" value="${orgattached.officeBuildarea}" type="text" class="inputTextNormal" id="textfield934" /></td>
        </tr>
	<tr>
            <td align="right"><span class="required">*</span>职能科室数 ：</td>
            <td align="left"><input name="funDivCount" value="${orgattached.funDivCount}" type="text" class="inputTextNormal" id="textfield8" /></td>
            <td align="right"><span class="required">*</span>派出机构数 ：</td>
            <td align="left"><input name="orgCount" value="${orgattached.orgCount}" type="text" class="inputTextNormal" id="textfield9" /></td>
           <td align="right"><span class="required">*</span>业务科室数 ：</td>
            <td align="left"><input name="businessDivCount" value="${orgattached.businessDivCount}" type="text" class="inputTextNormal" id="textfield92" /></td>
        </tr>
        <tr>
            <td align="right"><span class="required">*</span>检测仪器设备数 ：</td>
            <td align="left" colspan="5"><input name="equ3Count" value="${orgattached.equ3Count}" colspan="2" type="text" id="textfield9" size="4"/>（价格大于一千,小于一万）<br/>
              <input name="equ2Count" value="${orgattached.equ2Count}" colspan="2" type="text" id="textfield9" size="4"/>（价格大于一万、小于十万）<br/>
             <input name="equ1Count" value="${orgattached.equ1Count}" type="text" id="textfield9" size="4"/>（价格大于十万）</td>
        </tr>
        <tr>
            <td align="right"><span class="required">*</span> 汽车数（不含快速检测车） ：</td>
            <td align="left"><input name="busCount" value="${orgattached.busCount}" type="text" class="inputTextNormal" id="textfield8" /></td>
            <td align="right"><span class="required">*</span> 快速检测车数 ：</td>
            <td align="left"><input name="rapidtestvehicleCount" value="${orgattached.rapidtestvehicleCount}" type="text" class="inputTextNormal" id="textfield9" /></td>
            <td align="right"><span class="required">*</span> 摩托车数 ：</td>
            <td align="left"><input name="motorCount" value="${orgattached.motorCount}" type="text" class="inputTextNormal" id="textfield93" /></td>
        </tr>
		<tr>
            <td align="right"><span class="required">*</span> 照相机数：</td>
            <td align="left"><input name="cameraCount" value="${orgattached.cameraCount}" type="text" class="inputTextNormal" id="textfield8" /></td>
            <td align="right"><span class="required">*</span> 摄像机数 ：</td>
            <td align="left"><input name="videoCount" value="${orgattached.videoCount}" type="text" class="inputTextNormal" id="textfield9" /></td>
            <td align="right"><span class="required">*</span> 复印机数：</td>
            <td align="left"><input name="copycatNum" value="${orgattached.copycatNum}" type="text" class="inputTextNormal" id="textfield932" /></td>
        </tr>   
		<tr>
            <td align="right"><span class="required">*</span> 台式电脑数 ：</td>
            <td align="left"><input name="computerNum" value="${orgattached.computerNum}" type="text" class="inputTextNormal" id="textfield8" /></td>
            <td align="right"> <span class="required">*</span>笔记本电脑数 ：</td>
            <td align="left"><input name="notepadNum" value="${orgattached.notepadNum}" type="text" class="inputTextNormal" id="textfield9" /></td>
            <td align="right"><span class="required">*</span> 服务器数 ：</td>
            <td align="left"><input name="serverCount" value="${orgattached.serverCount}" type="text" class="inputTextNormal" id="textfield933" /></td>
        </tr>
	 <tr>
            <td align="right"> <span class="required">*</span>交换机数 ：</td>
            <td align="left"><input name="pbxCount" value="${orgattached.pbxCount}" type="text" class="inputTextNormal" id="textfield8" /></td>
            <td align="right"> <span class="required">*</span>传真机数 ：</td>
            <td align="left"><input name="faxCount" value="${orgattached.faxCount}" type="text" class="inputTextNormal" id="textfield9" /></td>
            <td align="right"> <span class="required">*</span>投影仪数 ：</td>
            <td align="left"><input name="ohpCount" value="${orgattached.ohpCount}" type="text" class="inputTextNormal" id="textfield937" /></td>
        </tr>
        <tr>
           <td align="right"> <span class="required">*</span>录音笔数：</td>
            <td align="left"><input name="vrCount" value="${orgattached.vrCount}" type="text" class="inputTextNormal" id="textfield937" /></td>
             <td align="right"> </td>
            <td align="left"></td>
            <td align="right"> </td>
            <td align="left"></td>
        </tr>
        </form>
    </table>
    <!--//commonTable-->
    <div id="formPageButton">
    	<ul>
        	<li><a href="javascript:void(0);" title="保存" class="btnShort" 
 onclick="javascript:document.institutionCreat.action='${pageContext.request.contextPath}/institution/sessionInstitution.do';document.institutionCreat.submit();">保存</a></li>
        	<li><a href="javascript:void(0);" title="提交" class="btnShort" 
 onclick="javascript:document.institutionCreat.action='${pageContext.request.contextPath}/institution/saveInstitution.do';document.institutionCreat.submit();">提交</a></li>
        	<li><a href="javascript:window.history.go(-1)" title="返回" class="btnShort">返回</a></li>
        </ul>
    </div>
    <!--//commonToolBar-->
    
   <%--  <div class="commonToolBar">
    	<a href="${pageContext.request.contextPath}/mvc/fund/toSaveFundPage.do?id=${}" title="机构创建" class="btnNormal rt1st">添加拨款</a>
    </div>
    <!--//commonToolBar-->
   	<div class="commonTitle">
    	    <h2>&gt;&gt; 机构财政拨款</h2></div> --%>
   	<!--//commonTableSearch-->
    <!-- <table border="0" cellspacing="1" cellpadding="0" class="commonTable">
        <tr>
            <th>年度</th>
            <th width="20%">人员经费（万元）</th>
            <th width="20%">公务费（万元）</th>
            <th width="20%">业务经费（万元）</th>
            <th width="20%">基本建设资金（万元）</th>
            <th class="editColS">编辑</th>
        </tr>
        <tr>
            <td align="center">2010</td>
            <td align="center">305.26</td>
            <td align="center">1020.08</td>
            <td align="center">2089.82</td>
            <td align="center">6122.37</td>
            <td align="center">
            	<a href="institution-appropriation-creat.html" class="btnIconEdit" title="更新"></a>
                <a href="#" class="btnIconDel" title="删除"></a>
            </td>
        </tr>
        <tr>
            <td align="center">2009</td>
            <td align="center">305.26</td>
            <td align="center">1020.08</td>
            <td align="center">2089.82</td>
            <td align="center">6122.37</td>
            <td align="center">
            	<a href="institution-appropriation-creat.html" class="btnIconEdit" title="更新"></a>
                <a href="#" class="btnIconDel" title="删除"></a>
            </td>
        </tr>
        <tr>
            <td align="center">2008</td>
            <td align="center">305.26</td>
            <td align="center">1020.08</td>
            <td align="center">2089.82</td>
            <td align="center">6122.37</td>
            <td align="center">
            	<a href="institution-appropriation-creat.html" class="btnIconEdit" title="更新"></a>
                <a href="#" class="btnIconDel" title="删除"></a>
            </td>
        </tr>
        <tr>
            <td align="center">2007</td>
            <td align="center">305.26</td>
            <td align="center">1020.08</td>
            <td align="center">2089.82</td>
            <td align="center">6122.37</td>
            <td align="center">
            	<a href="institution-appropriation-creat.html" class="btnIconEdit" title="更新"></a>
                <a href="#" class="btnIconDel" title="删除"></a>
            </td>
        </tr>
        <tr>
            <td align="center">2006</td>
            <td align="center">305.26</td>
            <td align="center">1020.08</td>
            <td align="center">2089.82</td>
            <td align="center">6122.37</td>
            <td align="center">
            	<a href="institution-appropriation-creat.html" class="btnIconEdit" title="更新"></a>
                <a href="#" class="btnIconDel" title="删除"></a>
            </td>
        </tr>
        <tr>
            <td align="center">2005</td>
            <td align="center">305.26</td>
            <td align="center">1020.08</td>
            <td align="center">2089.82</td>
            <td align="center">6122.37</td>
            <td align="center">
            	<a href="institution-appropriation-creat.html" class="btnIconEdit" title="更新"></a>
                <a href="#" class="btnIconDel" title="删除"></a>
            </td>
        </tr>
    </table> -->
    <!--//commonTable-->
   <!--  <div id="pagelist">
    	<ul class="clearfix">
        	<li><a href="#">首页</a></li>
            <li><a href="#">上页</a></li>
            <li class="current">1</li>
            <li><a href="#">2</a></li>
            <li><a href="#">下页</a></li>
            <li><a href="#">尾页</a></li>
            <li class="pageinfo">第1页</li>
            <li class="pageinfo">共2页</li>
        </ul>
    </div> -->
</div>
<!--//content pages wrap-->
</body>
</html>
