<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>items信息</title>
</head>
<body>
<form>
    <table width="100%" border=1>
        <tr>
            <td>书名</td>
            <td> ${items.name } </td>
        </tr>
        <tr>
            <td>价格</td>
            <td> ${items.price } </td>
        </tr>
        <tr>
            <td>出版时间</td>
            <td><fmt:formatDate value="${items.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
        </tr>
        <tr>
            <td>故事内容</td>
            <td>${items.detail} </textarea>
            </td>
        </tr>
        <tr>
            <td>插图</td>
            <td>${items.pic} </textarea>
            </td>
        </tr>
    </table>
</form>
</body>
</html>