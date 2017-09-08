package com.job;

import com.json.JsonManagement;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class ContentManagement {
	private JsonManagement jsonm=new JsonManagement();
	private ReaderManagement rm=new ReaderManagement();
	private WriterManagement wm=new WriterManagement();
	public JSONArray processContent() {
		JSONArray content=new JSONArray();
		JSONObject obj=jsonm.createNewJsonObject();
		JSONObject obj1=jsonm.createNewJsonObject();
		JSONObject reader=rm.processReader();
		JSONObject writer=wm.processWriter();
		obj.put("reader", reader);
		obj.put("writer", writer);
		content.add(obj);
		//content.add(writer);
		return content;
	}
	public JSONArray processContent(JSONObject reader,JSONObject writer) {
		JSONArray content=new JSONArray();
		JSONObject obj=jsonm.createNewJsonObject();
		obj.put("reader", reader);
		obj.put("writer", writer);
		content.add(obj);
		return content;
	}
	public JSONArray generateDefaultContent() {
		JSONArray defaultContent=new JSONArray();
		JSONObject obj=new JSONObject();
		JSONObject defaultReader=rm.generateDefaultReader();
		JSONObject defaultWriter=wm.generateDefaultWriter();
		obj.put("reader", defaultReader);
		obj.put("writer", defaultWriter);
		defaultContent.add(obj);
		return defaultContent;
	}



}
