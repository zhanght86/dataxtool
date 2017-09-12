<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
	
	<!-- 导入jquery的js -->
	<script type="text/javascript" src="/dataxtool001/dataxjsp/wjs/jquery-1.4.2.min.js"></script>
	<!-- 导入sasyui -->
	<script type="text/javascript" src="/dataxtool001/dataxjsp/easyui/easyui/jquery.easyui.min.js"></script>
	<!-- 导入easyui的主样式文件样式 -->
	<link rel="stylesheet" href="/dataxtool001/dataxjsp/easyui/easyui/themes/default\easyui.css">
	<link rel="stylesheet" href="/dataxtool001/dataxjsp/easyui/easyui/themes/icon.css">


	
	<script type="text/javascript" src="/dataxtool001/dataxjsp/job/reader/reader.js">

	</script>
</head>
	<body class="easyui-layout">   
    <div data-options="region:'north',title:'North Title',split:true" style="height:100px;">
    	<h1 align="center">dataxtool管理器</h1>
    </div>   
    <div data-options="region:'south',title:'South Title',split:true" style="height:100px;">
		<div id="p" class="easyui-panel" title="My Panel"     
		        style="width:500px;height:150px;padding:10px;background:#fafafa;"   
		        data-options="iconCls:'icon-save',closable:true,    
		                collapsible:true,minimizable:true,maximizable:true,fit:true">   
		</div> 
    </div>   
    <div data-options="region:'east',iconCls:'icon-reload',title:'East',split:true" style="width:100px;">
    	<a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'">easyui</a> 
    	<a id="btn1" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'">easyui</a>
    	<a id="btn2" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'">easyui</a>
    	<a id="btn3" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'">easyui</a>
    	<a id="btn4" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'">easyui</a>
    
    </div>
    
       
    <div data-options="region:'west',title:'West',split:true" style="width:100px;">
		<ul id="tt" class="easyui-tree">   
		    <li>   
		        <span>Folder</span>   
		        <ul>   
		            <li>   
		                <span>reader管理 </span>   
		                <ul>   
		                    <li> 
		                       <div id="getreader">查询</div>
		                    </li>   
		                    <li>   
		                        <span>File 12</span>   
		                    </li>   
		                    <li>   
		                        <span>File 13</span>   
		                    </li>   
		                </ul>   
		            </li>   
		            <li>   
		                <span>File 2</span>   
		            </li>   
		            <li>   
		                <span>File 3</span>   
		            </li>   
		        </ul>   
		    </li>   
		    <li>   
		        <span>File21</span>   
		    </li>   
		</ul>
    </div>   
    
    <div data-options="region:'center',title:'center title'" style="padding:5px;background:#eee;">

		<!-- 
			该表单是使用ajax方式来提交的
			里面包含了许多的隐藏栏目，根据一级和二级的下拉框来确定显示的内容
		 -->
		<form id="ff" method="post">   
		
			<!-- 二级联动 -->
			<span>reader的种类：</span>  
			<input class="easyui-combobox"  style="width:50" id="readertype"> 
			<span>reader的参数：</span>  
			<input class="easyui-combobox"  style="width:30;" id="readerparameter"><br/>
			<!-- 操作 -->
			<select id="op" class="easyui-combobox" name="dept" style="width:200px;">   
			    <option value="add">add</option>   
			    <option value="delete">delete</option>   
			    <option value="update">update</option>   
			    <option value="select">select</option>   
			</select>
		    <div>   
		        <label for="name">key:</label>   
		        <input id="key"  class="easyui-validatebox" type="text" name="name" data-options="required:true" />   
		    </div>   
		    <div>   
		          <label for="value">value:</label>
		        <input id="value" class="easyui-validatebox" type="text" name="value"   />   
		    </div> 
		    	<input id="op" type="hidden" /> 
		    <div>    
		        <input id="commit" type="button" value="提交">  
		    </div>      
		</form>
    </div> 
    
   
</body> 
</html>