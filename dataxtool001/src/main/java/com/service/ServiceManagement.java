package com.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import com.dataxmanagement.DataxManagement;
import com.json.JsonManagement;

import net.sf.json.JSONObject;

public class ServiceManagement {
	//datax管理对象
	private DataxManagement dm=new DataxManagement();
	//json管理对象
	private JsonManagement jm=new JsonManagement();
	public void createjob(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JSONObject json=dm.generateDefaultJob();
		String s=jm.formatJson(json.toString());
		request.setAttribute("s", s);
		request.getRequestDispatcher("dataxjsp/result/result.jsp").forward(request, response);;
		
	}
	/**
	 * 
	 * 执行linux命令
	 * @throws IOException 
	 * @throws ServletException 
	 */
	public void exe(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StringBuffer sb=dm.defaultExe();
		String s=sb.toString();
		request.setAttribute("s", s);
		request.getRequestDispatcher("dataxjsp/result/result.jsp").forward(request, response);;
		
		
	}

}
