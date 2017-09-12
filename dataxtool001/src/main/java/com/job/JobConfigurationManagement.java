package com.job;

import net.sf.json.JSONObject;

public class JobConfigurationManagement {
	private SettingManagement settingManagement=new SettingManagement();
	private ReaderManagement readerManagement=new ReaderManagement();
	private WriterManagement writerManagement=new WriterManagement();
	private JobManagement jm=new JobManagement();
	public JSONObject generateDefaultConfiguration() {
		JSONObject c=new JSONObject();
		JSONObject job=jm.generateDefaultJob();
		c.put("job", job);
		return c;
	}
	public JSONObject processConfiguration(JSONObject job) {
		
		JSONObject c=new JSONObject();
		c.put("job", job);
		return c;
	}
	

	public void updateReader(String name, String value, JSONObject json) {
		readerManagement.updateReader(name,value,json);
		
	}

}
