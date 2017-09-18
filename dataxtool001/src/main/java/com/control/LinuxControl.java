package com.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.domain.op.DataxReaderOP;

/**
 * 
 * 用于处理对linux的请求
 * @author Johnny
 *
 */
@Controller	
public class LinuxControl {
	@RequestMapping("/datax/linux/connection")
	public ModelAndView processDataxReaderOP() {//springmvc自动解析参数成为一个对象
		ModelAndView modelAndView=new ModelAndView("reader");
		return modelAndView;
	}
}
