package com.reader;

import com.job.ReaderManagement;
import com.json.JsonManagement;
import com.sun.org.apache.bcel.internal.generic.NEW;

import net.sf.json.JSONObject;

public class Test {
	public static void main(String[] args) {
		ReaderManagement readerManagement=new ReaderManagement();
		JSONObject jsonObject=readerManagement.generateDefaultReader();
		System.out.println(JsonManagement.formatJson(jsonObject.toString()));

	}
}
