<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form:form action="/update" method="post" modelAttribute="email">
    <table>
        <tr>
            <td>
                <b>Languages</b>
            </td>
            <td>

            </td>
            <td colspan="2">
                <form:select path="language">
                    <form:options items="${listLanguage}"/>
                </form:select>
            </td>
        </tr>
        <tr>
            <td>
                <b>Page Size</b>
            </td>
            <td>

            </td>
            <td>
                <span>Show</span>
                <form:select path="pageSize">
                    <form:options items="${listSize}"/>
                </form:select>
                <span> emails per page</span>
            </td>
            <td>

            </td>
        </tr>
        <tr>
            <td>Spams filter</td>
            <td>

            </td>
            <td>
                <span><form:checkbox path="spamsFilter"/></span>
                <span> Enable spams filter</span>
            </td>
            <td></td>
        </tr>
        <tr>
            <td>Signature:</td>
            <td></td>
            <td>
                <form:textarea path="signature"/>
            </td>
            <td></td>
        </tr>
        <tr>
            <td></td>
            <td>
            <td>
                <button type="submit">Update</button>
                <button type="">Cancel</button>
            </td>
            <td></td>
        </tr>
        <tr></tr>
    </table>
</form:form>
</body>
</html>
