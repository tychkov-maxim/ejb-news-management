<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List of News</title>
</head>
<body>

<table>
    <c:forEach items="${list}" var="news" >
        <tr>
            <td>
                ID : ${news.id}
            </td>
            <td>
                BRIEF : ${news.brief}
            </td>
            <td>
                CONTENT : ${news.content}
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
