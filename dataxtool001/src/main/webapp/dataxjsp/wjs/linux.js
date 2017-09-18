function openwin(){
  

    $('#win').window('open');  
}    

function setwin(){
	//设置窗口
	$('#win').dialog({    
	    title: 'My Dialog',    
	    width: 400,    
	    height: 200,    
	    closed: true,    
	    cache: false,      
	    modal: true   
	});  
	//设置表单
	$('#pg').propertygrid({        
	    showGroup: true,    
	    scrollbarSize: 0    
	}); 
	var row1 = {    
			  id:'ip',
			  name:'ip',    
			  value:'',    
			  group:'Marketing Settings',    
			  editor:'text'   
			};   
	var row2 = {    
				id:'username',
			  name:'username',    
			  value:'',    
			  group:'Marketing Settings',    
			  editor:'text'   
			}; 
	var row3 = {   
				id:'password',
			  name:'password',    
			  value:'',    
			  group:'Marketing Settings',    
			  editor:'text'   
			}; 
	$('#pg').propertygrid('appendRow',row1); 
	$('#pg').propertygrid('appendRow',row2); 
	$('#pg').propertygrid('appendRow',row3); 
	//为提交按钮绑定事件
	$("#commit1").click(function(){
		//提交事件
		$("#pg").getColumnOption();
		var r={
			"ip":ip,
			"username":username,
			"password":password
		};
		var urlarg="http://localhost:8080/dataxtool001/datax/linux/connection"
		//提交
        $.ajax({
            type: "POST",//请求类型
            //url: "http://localhost:8080/dataxtool001/datax/managementdatax.do",
            url:urlarg,
            contentType: "application/json",
            data: JSON.stringify(r),
            success: function (data) {
            	alert("success");
            },
            error: function () {
            	alert("执行失败");
            	alert("error");
            }
        });
		
	});
}
//页面加载完毕
$(function(){
	setwin();//设置窗口
	//为按钮绑定事件
	$("#btn").click(function(){
		openwin();
		
	});

});

