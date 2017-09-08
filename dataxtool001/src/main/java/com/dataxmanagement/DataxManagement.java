package com.dataxmanagement;
import com.job.JobConfigurationManagement;
import com.linux.LinuxManagement;

import net.sf.json.JSONObject;

public class DataxManagement {
	//job管理器
	private JobConfigurationManagement jcm=new JobConfigurationManagement();
	//linux管理器
	private LinuxManagement lm=new LinuxManagement();
	public JSONObject generateDefaultJob() {
		JSONObject json=jcm.generateDefaultConfiguration();
		return json;
	}
	/**
	 * 执行默认的命令，/home/datax/bin/datax.py /home/datax/job/job.json
	 * 
	 */
	public StringBuffer defaultExe() {
		return lm.callDefaultShell();//默认的命令
		
	}
	
	
}
