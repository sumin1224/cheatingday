<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<sec:authentication property="principal.username" var="username"/>
<div><a href="/cheatingday/manager/mypage?mUsername=${username}">
	리뷰관리	</a>
</div>
<div><a href="/cheatingday/manager/menu_list?mUsername=${username}">
	회원정보 관리</a>
</div>
<div>
	공지사항
</div>
<div>
	고객센터
</div>

</body>
</html>