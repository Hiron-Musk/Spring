<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>User5::modify</title>
</head>
<body>
    <h3>User5 수정</h3>
    <a href="/ch05">메인</a>
    <a href="/ch05/user5/list">목록</a>
    <form action="/ch05/user5/modify" method="post">
        <table border="1">
            <tr>
                <td>아이디</td>
                <td><input type="text" name="seq" readonly value="${user5DTO.seq}"></td>
            </tr>
            <tr>
                <td>이름</td>
                <td><input type="text" name="name" value="${user5DTO.name}"></td>
            </tr>
            <tr>
                <td>성별</td>
                <td>
                    <input type="radio" id="M" name="gender" value="M" <c:if test="${user5DTO.gender eq 'M'}">checked</c:if>>
                        <label for="M">M</label>
                    <input type="radio" id="F" name="gender" value="F"<c:if test="${user5DTO.gender eq 'F'}">checked</c:if> >
                        <label for="F">F</label>
                </td>
            </tr>
            <tr>
                <td>나이</td>
                <td><input type="number" name="age" value="${user5DTO.age}" ></td>
            </tr>
            <tr>
                <td>주소</td>
                <td><input type="text" name="addr" value="${user5DTO.addr}"></td>
            </tr>
            <tr>
                <td colspan="2" align="right"><input type="submit" value="등록하기"></td>
            </tr>
        </table>

    </form>


</body>
</html>
