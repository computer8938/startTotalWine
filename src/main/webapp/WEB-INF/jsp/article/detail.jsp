<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세 리스트</title>
</head>
<body>
	<h1>게시물 상세 페이지</h1>
	<section>
		번호 : ${article.id }<br>
		제목 : ${article.title }<br>
		<%-- 내용 : ${article.contents }<br> --%>
	</section>
	<hr>
	
	<a href="./list">게시물 리스트</a>
	<a href="./add">게시물 추가</a>
</body>
</html>