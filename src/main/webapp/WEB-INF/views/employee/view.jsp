<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>员工简介</title>
</head>
<body>
<h2>${employee.name}的信息简介</h2>
<div>
<span>员工工号：</span>
<span>${ employee.employeeNumber }</span>
</div>
<div>
<span>姓名：</span>
<span>${ employee.name }</span>
</div>
<div>
<span>性别：</span>
<span>${ employee.sex }</span>
</div>
<div>
<span>年龄：</span>
<span>${ employee.age }</span>
</div>
<div>
<span>证件类别：</span>
<span>${ employee.idClass }</span>
</div>
<div>
<span>证件号：</span>
<span>${ employee.idNumber }</span>
</div>
<div>
<span>电话：</span>
<span>${ employee.telephone }</span>
</div>
<div>
<span>email：</span>
<span>${ employee.email }</span>
</div>
<div>
<span>现居地址：</span>
<span>${ employee.workingAddress }</span>
</div>
<div>
<span>家庭地址：</span>
<span>${ employee.homeAddress }</span>
</div>
<div>
<span>紧急联系人：</span>
<span>${ employee.emergencyContactPerson }</span>
</div>
<div>
<span>联系人电话：</span>
<span>${ employee.emergencyContactTelephone }</span>
</div>
<div>
<span>学历：</span>
<span>${ employee.education }</span>
</div>
<div>
<span>毕业院校：</span>
<span>${ employee.school }</span>
</div>
<div>
<span>专业：</span>
<span>${ employee.specialty }</span>
</div>
<div>
<span>部门号：</span>
<span>${ employee.departmentId }</span>
</div>
<div>
<span>职务：</span>
<span>${ employee.job }</span>
</div>
<div>
<span>级别：</span>
<span>${ employee.level }</span>
</div>
<div>
<span>在职状态：</span>
<span>${ employee.jobState }</span>
</div>
<div>
<span>备注：</span>
<span>${ employee.description }</span>
</div>
</body>
</html>