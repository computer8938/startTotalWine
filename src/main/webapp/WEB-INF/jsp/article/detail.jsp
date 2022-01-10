<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세 리스트</title>
<link rel="stylesheet" href="/resource/common.css">
</head>
<body>
	<h1 class="con">게시물 상세 페이지</h1>
	<section class="con">
		번호 : ${article.id }<br>
		제목 : ${article.title }<br>
		내용 : ${article.contents }<br>
	</section>
	<hr>
	
	<div class="btns con">
		<a href="./list">게시물 리스트</a>
		<a href="./add">게시물 추가</a>
		<a href="./doModify?id=${article.id } ">게시물 수정</a>
		<a onClick="if( confirm('삭제하시겠습니까?')==false) return false;" 
		   href="./doDelete?id=${article.id } ">게시물 삭제</a>
	</div>
</body>
</html>