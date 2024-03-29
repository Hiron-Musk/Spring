<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<!--
    날짜 : 2024/03/05
    이름 : 남가희
    내용 : Spring MVC 실습하기

     Spring MVC 라이브러리
        - spring-context 6.1.4
        - spring-webmvc 6.1.4
        - jakarta.servlet-api 6.0.0
        - jakarta.servlet.jsp.jstl-api 3.0.0
        - jakarta.servlet.jsp.jstl 3.0.1

        WebAppInitializer
            - 스프링 웹 애플리케이션 초기화를 위한 인터페이스
            - DispatcherServlet을 생성하고 컨텍스트 등록
            - 웹 애플리케이션 컨텍스트(컨테이너)를 설정하고 필요한 서블릿, 필터, 리스너 등 설정

        WebMvcConfigurer
            - 스프링 웹 MVC 구성 컴포넌트 설정을 위한 인터페이스
            - ViewResolver설정 및 ResourceHandler 설정 등 애플리케이션 전반에 걸친 자원 설정

        @EnableWebMvc
            - 스프링 MVC를 구성하고 MVC 관련 기능을 활성화하는 어노테이션

        Tomcat 관련 설정
            - 반드시 톰캣은 apache-tomcat-10.1.19으로 해야됨


-->
<head>
    <meta charset="UTF-8">

</head>
<body>
    <h2>ch04.Spring MVC</h2>

    <h4>MVC 기본</h4>

    <a href="/ch04/hello">hello</a>
    <a href="/ch04/welcome">welcome</a>
    <a href="/ch04/greeting">greeting</a>

    <h4>User1 실습</h4>
    <a href="/ch04/user1/list">User1 목록</a>
    <a href="/ch04/user1/register">User1 등록</a>

    <h4>User2 실습</h4>
    <a href="/ch04/user2/list">User2 목록</a>
    <a href="/ch04/user2/register">User2 등록</a>

    <h4>User3 실습</h4>
    <a href="/ch04/user3/list">User3 목록</a>
    <a href="/ch04/user3/register">User3 등록</a>

    <h4>User4 실습</h4>
    <a href="/ch04/user4/list">User4 목록</a>
    <a href="/ch04/user4/register">User4 등록</a>

    <h4>User5 실습</h4>
    <a href="/ch04/user5/list">User5 목록</a>
    <a href="/ch04/user5/register">User5 등록</a>


</body>
</html>
