<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- �ڷᱸ���� �ٷ�Ƿ� import �۾��� �� �ʿ��ϴ�. -->
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
	out.print("<h1>�鿣��κ��� �Ѱܹ��� ���� ũ�� ===> "+size+"</h1>");
	out.print("<p style='background-color:yellow; margin:0; width:fit-content;'>�̷��Ե� br�±� �� �� �ֳ�</p>");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>getZipCodeList.jsp[WEB-INF]</title>
</head>
<body>
<h2>WEB-INF ���� ��ȣ �˻��� �������Դϴ�.</h2>
<br>
<!-- ��ũ��Ʋ��
	out.print(zipList);
 -->
 <%=grmap%>
</body>
</html>