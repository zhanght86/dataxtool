package com.job;

import org.apache.commons.collections.CollectionUtils;

import com.json.JsonManagement;

import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class ReaderManagement {
	private JsonManagement jsonm=new JsonManagement();
	public JSONObject processReader() {
		JSONObject parameter=jsonm.createNewJsonObject();
		JSONObject reader=jsonm.createNewJsonObject();
		reader.put("name", "mysqlreader");
		reader.put("parameter", parameter);
		return reader;
	}
	public void addParameter(JSONObject reader,Object key,Object value) {
		JSONObject p=(JSONObject) reader.get("parameter");
		if(p==null) {//娌℃湁鍒欏垱寤轰竴涓�
			p=new JSONObject();
			reader.put("parsmeter", p);
		}else {
			p.put(key, value);
		}
	}
	public void addName(JSONObject reader,String valueOfName) {
		reader.put("name", valueOfName);
	}
	public void addColumn(JSONObject reader,String value,String type) {
		JSONObject c=new JSONObject();
		c.put("value", 	value);
		c.put("type", type);

		JSONObject p=null;
		if(!reader.containsKey("parameter")) {
			p=new JSONObject();
			reader.put("parameter", p);

		}else {
			p=reader.getJSONObject("parameter");
		}
		//JSONObject column=p.getJSONObject("column");
		JSONArray column=null;
		if(!p.containsKey("column")) {
			column=new JSONArray();
			
		}else {
			column=p.getJSONArray("column");
		}
		column.add(c);
		p.put("column", column);
		reader.put("parameter", p);
		//addParameter(reader, "parameter", p);
		
	}
	public JSONObject generateDefaultReader() {
		JSONObject parameter=new JSONObject();
		JSONObject defaultReader=new JSONObject();
		addName(defaultReader, "streamreader");
		addColumn(defaultReader, "DataX", "string");
		addColumn(defaultReader, "19890604", "long");
		addColumn(defaultReader, "1989-06-04 00:00:00", "date");
		addColumn(defaultReader, "true", "bool");
		addColumn(defaultReader, "tests", "bytes");
		addParameter(defaultReader, "sliceRecordCount", 10000);
		return defaultReader;
	}
	/**
	 * 
	 * 
	 * @param name
	 * @param value
	 * @param json
	 * 更新reader
	 */
	public void updateReader(String name, String value,  JSONObject json) {
		//这里得到的结果是字符串
		jsonm.anzlizeAndUpdate(name, value, json);
		System.out.println(json.toString());
		
	}
	
}
