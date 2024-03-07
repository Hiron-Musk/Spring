<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>User4::modify</title>
</head>
<body>
    <h3>User4 수정</h3>
    <a href="/">메인</a>
    <a href="/user4/list">목록</a>
    <form action="/user4/modify" method="post">
        <table border="1">
            <tr>
                <td>이름</td>
                <td><input type="text" name="name" value="${user4DTO.name}" readonly></td>
            </tr>
            <tr>
                <td>성별</td>
                <td>
                    <input type="radio" name="gender" value="M" id="M"<c:if test="${user4DTO.gender eq 'M'}">checked</c:if>>
                    <label for="M">M</label>
                    <input type="radio" name="gender" value="F" id="F"<c:if test="${user4DTO.gender eq 'F'}">checked</c:if>>
                    <label for="F">F</label>
                </td>
            </tr>
            <tr>
                <td>나이</td>
                <td><input type="number" name="age" value="${user4DTO.age}"></td>
            </tr>
            <tr>
                <td>주소</td>
                <td><input type="text" name="addr" value="${user4DTO.addr}"></td>
            </tr>
            <tr>
                <td colspan="2" align="right"><input type="submit" value="등록하기"></td>
            </tr>
        </table>

    </form>


</body>
</html>
