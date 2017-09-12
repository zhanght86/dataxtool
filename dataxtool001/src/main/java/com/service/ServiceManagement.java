package com.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import com.dataxmanagement.DataxManagement;
import com.job.ReaderManagement;
import com.json.JsonManagement;

import net.sf.json.JSONObject;

public class ServiceManagement {

	private DataxManagement dm=new DataxManagement();
	
	private JsonManagement jm=new JsonManagement();
	public void createjob(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JSONObject json=dm.generateDefaultJob();
		String s=jm.formatJson(json.toString());
		System.out.println(s);
		response.getWriter().write(s);
		
	
	}
	/**
	 * 
	 * ִ��linux����
	 * @throws IOException 
	 * @throws ServletException 
	 */
	public void exe(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StringBuffer sb=dm.defaultExe();
		String s=sb.toString();
		request.setAttribute("s", s);
		request.getRequestDispatcher("dataxjsp/result/result.jsp").forward(request, response);;
	}
	

	public void updateReader(HttpServletRequest request, HttpServletResponse response) {
		String name=request.getParameter("name");
		String value=request.getParameter("value");
		JSONObject json=dm.generateDefaultJob();
		dm.updateReader(name, value, json);
		String s=jm.formatJson(json.toString());
		try {
			PrintWriter pw =response.getWriter();
			pw.print(s);
			pw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
