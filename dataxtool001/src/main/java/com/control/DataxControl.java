package com.control;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.domain.op.DataxReaderOP;
import com.json.JsonManagement;
import com.service.DataxServiceManagement;
import net.sf.json.JSONObject;

/**
 * 
 * 用来处理datax请求的
 * @author Johnny
 * 通一个处理器方法用来处理不同的业务逻辑
 *
 */
//mvc层的控制器对象，由springmvc来管理
@Controller		//这里用control这个注解用来描述是springmvc的bean
public class DataxControl {
	//由由spring'容器来注入
	@Autowired
	private DataxServiceManagement dataxServiceManagement;
	
	/**
	 * 
	 * 将请求映射到不同的control的时候有不同的映射规则(URL,请求参数,请求方法,请求头)
	 * 
	 * @param dataxReaderOP
	 * @return
	 */
	@RequestMapping("/datax/managementdatax.do")
	public ModelAndView processDataxReaderOP(@RequestBody DataxReaderOP dataxReaderOP) {//springmvc自动解析参数成为一个对象
		//JsonObject jsonObject=dataxManagement.processReader(dataxReaderOP);
		//System.out.println(jsonObject);
		ModelAndView modelAndView=new ModelAndView("reader");
		return modelAndView;
	}
	/**
	 * 用来处理对reader的add操作
	 * control主要用来控制业务逻辑
	 * @param dataxReaderOP
	 * @return
	 */
	//用来处理添加的操作,使用的是参数的映射
	@RequestMapping("/datax/reader/add")
	public ModelAndView processDataxReaderAdd(@RequestBody DataxReaderOP dataxReaderOP) {
		//执行业务逻辑,病返回修改之后的reader对象
		JSONObject reader=dataxServiceManagement.processDataxReaderAdd(dataxReaderOP);
		//创建并返回指定的视图
		ModelAndView modelAndView=new ModelAndView("reader");
		return modelAndView;
	}
	
	
	@RequestMapping("/datax/reader/delete")
	public ModelAndView processDataxReaderDelete(@RequestBody DataxReaderOP dataxReaderOP) {
		//执行业务逻辑,病返回修改之后的reader对象
		JSONObject reader=dataxServiceManagement.processDataxReaderDelete(dataxReaderOP);
		System.out.println(JsonManagement.formatJson(reader.toString()));
		//创建并返回指定的视图
		ModelAndView modelAndView=new ModelAndView("reader");
		return modelAndView;
	}
	
}
