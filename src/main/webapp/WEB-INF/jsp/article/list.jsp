<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*" %>    
<%@ page import="com.jhpark.tWine.dto.ArticleDTO" %>    
<%
	List<ArticleDTO> list = (List<ArticleDTO>)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>라스트</title>
</head>
<body>
<h1>게시물 리스트</h1>
<%-- el잠시 접고 ${list} --%>
<% for(int i = 0; i < list.size(); i++) { %>
	<% ArticleDTO article = list.get(i); %>
	<section> 
	번호 : 
	<%= article.getId() %>, 제목 : 
	<%= article.getTitle() %>
	</section>
	<hr>
<% }%>
<h2>el version</h2>
	<c:forEach items="${list}" var="article">
	<section>
		번호 : 
		${article.id }, 제목 : 
		${article.title }
	</section>
	<hr>
	</c:forEach> 
</body>
</html>