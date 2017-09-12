<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript">
	
</script>

</head>
<body>
	<form action="" id="createjob" >
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
			rc1<input name="rc1value" value="DataX" type="text"><input name="rc1type" value="string" type="text"><br>
			rc2<input name="rc2value" value="19890604" type="text"><input name="rc2type" value="long" type="text"><br>
			rc3<input name="rc3value" value="1989-06-04 00:00:00" type="text"><input name="rc3type" value="date" type="text"><br>
			rc4<input name="rc4value" value="true" type="text"><input name="rc4type" value="bool" type="text"><br>
			rc5<input name="rc5value" value="test" type="text"><input name="rc5type" value="bytes" type="text"><br>
			sliceRecordCount<input name="slicerecordcount" value="100000" type="text"><br>
		content/writer<br>
			name<input name="writername" value="streamwriter" type="text"><br>
			parameter<br>
			wc1<input name="wc1value" value="print" type="text"><input name="wc1type" value="false" type="text"><br>
			wc2<input name="wc2value" value="encoding" type="text"><input name="wc2type" value="UTF-8" type="text"><br>
	</form>
		<script type="text/javascript">
		
		function a() {
			var  s=1;
			alert(s);
			alert("asf");
		}
		a();
		
	</script>
	
</body>
</html>