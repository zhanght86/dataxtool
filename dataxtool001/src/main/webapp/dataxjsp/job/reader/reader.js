document.write("<script type=\"text/javascript\" src=\"/dataxtool001/dataxjsp/wjs/util.js\"></script>");
//页面加载的时候为该页面的组件添加各种的属性和时间
$(function(){
			//设置点击按钮的属性
			$("#getreader").click(function(){
				$.get("http://localhost:8080/dataxtool001/ControlServlet",function(data){		
					$("#p").text(data);
				});
			});

			//一级框点击之后会导致二级框内容的改变
			//设置一级下拉框的各种属性
			$("#readertype").combobox({
		        valueField: 'text',    
		        textField: 'text', 
				url:'readertype.json',
				onSelect:function(){	//当下拉框被选中
					var select=$("#readertype").combobox('getText');
					var url=select+'parameter.json';
					$("#readerparameter").combobox('reload',url);
					
				}
			});
			
			//二级框的选择操作会出现不同的表单
			//设置二级下拉框的属性
			$("#readerparameter").combobox({
		        valueField: 'text',    
		        textField: 'text', 
				onSelect:function(){	//当下拉框被选中
					var select=$("#readerparameter").combobox('getText');
					
				}
			});
			
			//对操作下拉框绑定事件，该按钮用来改变隐藏的操作
			$("#op").combobox({
		        valueField: 'default',    
		        textField: 'default', 
				onSelect:function(){	//当下拉框被选中
					var select=$("#op").combobox('getText');
					
				}
			});
			

			

			//设置表单属性成为ajax提交
			$('#ff').form({  
				dataType:"json",
				type:"GET",
			    url:"http://localhost:8080/dataxtool001/ControlServlet",    
			    onSubmit: function(){    
			    	alert("提交成功");
			        // do some check    
			        // return false to prevent submit;    
			    },    
			    success:function(data){//当请求之后调用，传入返回后的数据，以及包含成功代码的字符串
			    	//当按钮提交成功，而且成功的响应，并且响应的结果是json
			        //var data = eval('(' + data + ')');  // change the JSON string to javascript object    
			        var result = jQuery.parseJSON(data);
			        var table=result.table;
			        var result1=JSON.stringify(result.json);
			        $("#p").text(result1);
			        var arr=[];
			        //显示表格内的数据
			        for(var d in table){
			        	var value=table[d];
			        	var row={"key":d,"value":value};
			        	//var rowjson=JSON.parse(row);
			        	arr.push(row);
		
			        }
			        //更新数据
		         	$("#dg").datagrid({
						"data":arr
		        	});
			    }    
			}); 
			//设置提交按钮，为提交按钮绑定提交事件
			$("#commit").click(function(){
				//为commit按钮绑定click时间，该时间就是提交表单
				$('#ff').submit();
			});
			
			//设置表格的属性和各个行的属性
			$('#dg').datagrid({    
			       
			    columns:[[    
			        {field:'key',title:'key',width:100},    
			        {field:'value',title:'value',width:100,align:'right'}    
			    ]]   
			}); 
});



