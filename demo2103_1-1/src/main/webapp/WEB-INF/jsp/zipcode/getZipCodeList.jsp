<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 자료구조를 다루므로 import 작업이 꼭 필요하다. -->
<%@ page import="java.util.List, java.util.Map" %>
<%
	List<Map<String, Object>> zipList =
			(List<Map<String, Object>>)request.getAttribute("zipList");
	int size = 0;
	Map<String, Object> grmap = null;
	if(zipList != null){
		size = zipList.size();
		for(Map<String, Object> rmap : zipList){
			grmap = rmap;
		}
	}
	out.print("<h1>백엔드로부터 넘겨받은 값의 크기 ===> "+size+"</h1>");
	out.print("<p style='background-color:yellow; margin:0; width:fit-content;'>이렇게도 br태그 걸 수 있네</p>");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>getZipCodeList.jsp[WEB-INF]</title>
</head>
<body>
<h2>WEB-INF 우편 번호 검색기 페이지입니다.</h2>
<br>
<!-- 스크립틀릿
	out.print(zipList);
 -->
 <%=grmap%>
</body>
</html>