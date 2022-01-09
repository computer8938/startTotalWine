<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 작성</title>
<style>
	.con{
		width:1000px;
		margin: 0 auto;
	}
	.common-form > div > * {
		float: left;
	}
	.common-form > div ::after {
		content: "";
		display:block;
		clear:both;
	}
	.common-form > div > span {
		width:50px;
	}
	.common-form > div > div {
		width:calc(100% - 50px);
	}
	.common-form > div > div > input[type="text"], .common-form > div > div > textarea {
		width:90%;
	}
</style>

<script>
	function submitAddForm(form){
		form.title.value = form.title.value.trim();
		if(form.title.value.length==0){
			alert('제목을 입력하세요');
			form.title.focus();
			return false;
		}
		form.contents.value = form.contents.value.trim();
		if(form.contents.value.length==0){
			alert('내용을 입력하세요');
			form.contents.focus();
			return false;
		}
		form.submit();
	}
</script>
</head>
<body>
	<h1>게시물 작성</h1>
		<form class="con common-form" action="./doAdd" method="POST"
				onsubmit="submitAddForm(this); return false;">
			<div>
				<span>제목</span>
				<div>
					<input name="title" type="text" placeholder="제목" autofocus="autofocus" >
				</div>
			</div>
			<div>
				<span>내용</span>
				<div>
					<textarea name="contents" placeholder="내용" ></textarea>
				</div>
			</div>
			<div>
				<span>작성</span>
				<div>
					<input type="submit" value="작성">
					<input type="reset" value="취소" onClick="history.back();">
				</div>
			</div>
		</form>
</body>
</html>