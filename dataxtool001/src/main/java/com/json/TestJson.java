package com.json;

import com.dataxmanagement.DataxManagement;
import com.sun.org.apache.bcel.internal.generic.NEW;

import javafx.scene.chart.PieChart.Data;
import net.sf.json.JSON;
import net.sf.json.JSONObject;
public class TestJson {
	public static void main(String[] args) {
		DataxManagement dm=new DataxManagement();
		JsonManagement jm=new JsonManagement();
		JSONObject jsonObject=dm.generateDefaultJob();
		jm.anzlizeAndUpdate("speed", "123", jsonObject);
		System.out.println(JsonManagement.formatJson(jsonObject.toString()));
		//System.out.println(JsonManagement.formatJson(jsonObject.toString()));
	}

}
