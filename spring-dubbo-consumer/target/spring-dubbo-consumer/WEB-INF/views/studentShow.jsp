<%--
  Created by IntelliJ IDEA.
  User: jiaruiguo
  Date: 2020/5/24
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生管理</title>
</head>
<body>
    <div>
        <p>编号：${module.studentId}</p>
        <div>
            <p>姓名：${module.studentName}</p>
        </div>
        <div>
            <p>身高：${module.height}</p>
        </div>
        <div>
            <p>体重：${module.weight}</p>
        </div>
        <div>
            <p>电话：${module.phone}</p>
        </div>
        <div>
            <p>地址：${module.add}</p>
        </div>
    </div>
</body>
</html>
