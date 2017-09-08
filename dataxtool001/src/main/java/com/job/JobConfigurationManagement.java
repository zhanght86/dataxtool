package com.job;

import net.sf.json.JSONObject;

public class JobConfigurationManagement {
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

}
