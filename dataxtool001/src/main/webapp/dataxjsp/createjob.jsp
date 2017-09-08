<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%-- <jsp:include page="main.jsp"></jsp:include> --%>
</head>
<body>
	<form action="" id="createjob">
		setting
		<br/>
		<br/>
		speedbyte<input name="speedbyte" type="text" value=10485760><br>
		record<input name="record" type="text" value=0><br>
		percentage<input name="percentage" type="text" value=0.02>
		<br>
		<br>
		content/reader<br>
			name<input name="readername" value="streamreader" type="text"><br>
			parameter<br>
			c1<input name="c1value" value="DataX" type="text"><input name="c1type" value="string" type="text"><br>
			c2<input name="c2value" value="19890604" type="text"><input name="c2type" value="long" type="text"><br>
			c3<input name="c3value" value="1989-06-04 00:00:00" type="text"><input name="c3type" value="date" type="text"><br>
			c4<input name="c4value" value="true" type="text"><input name="c4type" value="bool" type="text"><br>
			c5<input name="c5value" value="test" type="text"><input name="c5type" value="bytes" type="text"><br>
			sliceRecordCount<input name="slicerecordcount" value="100000" type="text"><br>
		content/writer<br>
			name<input name="writername" value="streamwriter" type="text"><br>
			parameter<br>
			wc1<input name="wc1value" value="print" type="text"><input name="wc1type" value="false" type="text"><br>
			wc2<input name="wc2value" value="encoding" type="text"><input name="wc2type" value="UTF-8" type="text"><br>
		
		
		
	</form>
</body>
</html>