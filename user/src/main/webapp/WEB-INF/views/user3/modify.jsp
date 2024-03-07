<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>User3::modify</title>
</head>
<body>
    <h3>User3 수정</h3>
    <a href="/">메인</a>
    <a href="/user3/list">목록</a>
    <form action="/user3/modify" method="post">
        <table border="1">
            <tr>
                <td>아이디</td>
                <td><input type="text" name="id" readonly value="${user3DTO.id}"></td>
            </tr>
            <tr>
                <td>이름</td>
                <td><input type="text" name="name" value="${user3DTO.name}"></td>
            </tr>
            <tr>
                <td>휴대폰</td>
                <td><input type="text" name="hp" value="${user3DTO.hp}" ></td>
            </tr>

            <tr>
                <td>나이</td>
                <td><input type="number" name="age" value="${user3DTO.age}"></td>
            </tr>
            <tr>
                <td colspan="2" align="right"><input type="submit" value="등록하기"></td>
            </tr>
        </table>

    </form>


</body>
</html>
