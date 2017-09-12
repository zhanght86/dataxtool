<html>
<head>
	<script type="text/javascript" src="wjs/reader.js"></script>
	<script type="text/javascript">
		var reader=getNewReader();
	</script>
</head>
<body>
<h2>Hello World!</h2>
	<div>
		<select id=op>
		  <option  value ="name">name</option>
		  <option  value ="column">column</option>
		  <option  value="other">other</option>
		</select><br>
		<input id="value1" type="text">
		<input id="value2" type="text">
		<input type="button" value="commit" onclick="add()">
	</div>
</body>
</html>