
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
		        valueField: 'id',    
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
		        valueField: 'id',    
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
			
			//设置提交按钮的属性
			$('#vv').validatebox({    
			    required: true    
			    
			});
			

			//设置表单属性成为ajax提交
			$('#ff').form({  
				type:"GET",
			    url:"http://localhost:8080/dataxtool001/ControlServlet",    
			    onSubmit: function(){    
			    	alert("提交成功");
			        // do some check    
			        // return false to prevent submit;    
			    },    
			    success:function(data){//当请求之后调用，传入返回后的数据，以及包含成功代码的字符串
			    	//当按钮提交成功，而且成功的响应，并且响应的结果是json
			       // var data = eval('(' + data + ')');  // change the JSON string to javascript object    
			        alert("响应成功");
			        alert(data);
					//提交成功之后需要将得到的数据显示
					$("#p").text(data);
			    }    
			}); 
			//设置提交按钮，为提交按钮绑定提交事件
			$("#commit").click(function(){
				//为commit按钮绑定click时间，该时间就是提交表单
				$('#ff').submit();
			});

});



