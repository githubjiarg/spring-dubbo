<%--
  Created by IntelliJ IDEA.
  User: jiaruiguo
  Date: 2020/5/24
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>教师管理</title>
</head>
<body>
    <p>编号：${module.teacherId}</p>
    <div>
        <label>姓名：</label>
        <span>${module.teacherName}</span>
    </div>
    <div>
        <label>性别：</label>
        <span>${module.gender}</span>
    </div>
    <div>
        <label>专业：</label>
        <span>${module.major}</span>
    </div>
    <div>
        <label>学历：</label>
        <span>${module.diploma}</span>
    </div>
</body>
</html>
