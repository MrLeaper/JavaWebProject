<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<hr><h1 align='center'>Welcome to <font color="green">BookShop</font>!</h1>
<c:if test="${!empty user}">
    <div color="green">
        当前用户: ${user.name}
    </div>
</c:if>
<br><hr>
<h2 align="center">请选购</h2>


<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>id</td>
        <td>名称</td>
        <td>价格</td>
        <td>购买</td>
    </tr>
    <c:forEach items="${products}" var="product" varStatus="st">
        <tr>
            <td style="background-color: #8ce6fc">${product.id}</td>
            <td style="background-color: #d0f5fc">${product.name}</td>
            <td style="background-color: #8ce6fc">${product.price}</td>
            <td>

                <form action="addOrderItem" method="post">

                    数量<input type="text" value="1" name="num">
                    <input type="hidden" name="pid" value="${product.id}">
                    <input type="submit" value="购买">
                </form>

        </tr>
    </c:forEach>
</table>
