<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<STYLE type="text/css">
table
{
	margin:0 auto;
	text-align:center;
	font-weight: bold;
}
.form
{
	width:75%;
	margin:0 auto;
	align:center;
	position:relative;
	top:130px;
	border: 1px solid #CCCC99;
	pading:8px;
}
.caption
{
	text-align:center;
	font-size:25px;
	position:relative;
	top:140px;
	left:-15px;
}
tr
{
	line-height:45px;
}
th
{
	text-align:right;
	position:relative;
	left:-10px;
	color:#0066FF;
}
td
{
	text-align:left;
}
input, textarea
{
	width:200px;
	height:20px;
	font-size:16px;
	padding:5px;
	border-radius:5px;
	border:1px solid #CCCC99;
}
input:focus
{
    border-style:solid;
    border-color:#339933
}

</STYLE>
<title>录入员工信息</title>
</head>
<body>
<p class="caption">录入员工</p>
<div class="form">
<form:form method="post" modelAttribute="employee">
<table>
<tr>
	<th><label for="name">姓名:</label></th>
	<td>
		<form:input path="name" autofocus="autofocus" /> <br/>
		<form:errors path="name" cssClass="error" />
	</td>
</tr>

<tr>
	<th><label for="sex">性别:</label></th>
	<td>
		<form:radiobutton path="sex" value="男" checked="true" style="width:50px;" /> 
		<label for="sex_male">男</label> 
		<form:radiobutton path="sex" value="女" style="width:50px;" />
		<label for="sex_female">女</label> <br/>
		<form:errors path="sex" cssClass="error" />
	</td>
</tr>

<tr>
	<th><label for="age">年龄:</label></th>
	<td>
		<form:input path="age" /> <br/>
		<form:errors path="age" cssClass="error" />
	</td>
</tr>

<tr>
	<th></th>
	<td>
		<form:select path="idClass" style="padding:6px;font-size:16px;">
			<form:option value="身份证">身份证</form:option>
			<form:option value="军人证">军人证</form:option>
			<form:option value="回乡证">回乡证</form:option>
			<form:option value="台胞证">台胞证</form:option>
		</form:select>
	</td>
</tr>

<tr>
	<th></th>
	<td>
		<form:input path="idNumber" /> <br/>
		<form:errors path="idNumber" cssClass="error" />	
	</td>
</tr>

<tr>
	<th><label>电话:</label></th>
	<td>
		<form:input path="telephone" /> <br/>
		<form:errors path="telephone" cssClass="error" />
	</td>
</tr>

<tr>
	<th><label>email:</label></th>
	<td>
		<form:input path="email" /> <br/>
		<form:errors path="email" cssClass="error" />
	</td>
</tr>

<tr>
	<th><label>现居地址:</label></th>
	<td><form:input path="workingAddress" /></td>
	<form:errors path="workingAddress" cssClass="error" />
</tr>

<tr>
	<th><label>家庭住址:</label></th>
	<td><form:input path="homeAddress" /></td>
</tr>

<tr>
	<th><label>紧急联系人:</label></th>
	<td><form:input path="emergencyContactPerson" /></td>
</tr>

<tr>
	<th><label>联系人电话:</label></th>
	<td><form:input path="emergencyContactTelephone" /></td>
</tr>

<tr>
	<th><label>学历:</label></th>
	<td><form:input path="education" /></td>
</tr>

<tr>
	<th><label>毕业院校:</label></th>
	<td><form:input path="school" /></td>
</tr>

<tr>
	<th><label>专业:</label></th>
	<td><form:input path="specialty" /></td>
</tr>

<tr>
	<th><label>部门号:</label></th>
	<td>
		<form:input path="departmentId" /> <br/>
		<form:errors path="departmentId" cssClass="error" />
	</td>
</tr>

<tr>
	<th><label>职务:</label></th>
	<td><form:input path="job" /> <br/>
	<form:errors path="job" cssClass="error" />
	</td>
</tr>

<tr>
	<th><label>级别:</label></th>
	<td><form:input path="level" /> <br/>
	<form:errors path="level" cssClass="error" />
	</td>
</tr>

<tr>
	<th><label>在职状态:</label></th>
	<td>
		<form:input path="jobState" /> <br/>
		<form:errors path="jobState" cssClass="error" />
	</td>
</tr>

<tr>
	<th><label>备注</label></th>
	<td><form:textarea path="description" style="height:50px" /></td>
</tr>

<tr>
	<th></th>
	<td><input type="submit" value="提交" style="width:70px;height:35px;"/></td>
</tr>

</table>
</form:form>
</div>
</body>
</html>