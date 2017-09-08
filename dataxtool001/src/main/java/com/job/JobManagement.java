package com.job;
//管理jbo

import java.util.HashMap;

import com.json.JsonManagement;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JobManagement {
	private JsonManagement jsonm=new JsonManagement();
	private ContentManagement cm=new ContentManagement();
	private SettingManagement sm=new SettingManagement();
	public JSONObject createNewJob() {
		JSONObject newJob=jsonm.createNewJsonObject();
		processJob();//对job进行加工
		return newJob;
		
	}
	public JSONObject processJob() {
		JSONObject job=new JSONObject();
		
		JSONArray content=cm.processContent();
		JSONObject setting=sm.processSetting();
		job.put("content", content);
		job.put("setting", setting);
		return job;
		
	}

	public void addSetting(JSONObject job,JSONObject setting) {
		job.put("setting", setting);
	}
	public void addContent(JSONObject job,JSONArray content) {
		job.put("content", content);
	}
	public JSONObject generateDefaultJob() {
		JSONArray defaultContent=cm.generateDefaultContent();
		JSONObject defaultSetting=sm.generateDefaultSetting();
		JSONObject job=new JSONObject();
		job.put("setting", defaultSetting);
		job.put("content", defaultContent);
		return job;
	}
}
