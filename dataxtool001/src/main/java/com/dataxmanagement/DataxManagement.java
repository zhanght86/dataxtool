package com.dataxmanagement;
import com.job.JobConfigurationManagement;
import com.job.ReaderManagement;
import com.linux.LinuxManagement;

import net.sf.json.JSON;
import net.sf.json.JSONObject;

public class DataxManagement {
	//job������
	private JobConfigurationManagement jcm=new JobConfigurationManagement();
	//linux������
	private LinuxManagement lm=new LinuxManagement();
	public JSONObject generateDefaultJob() {
		JSONObject json=jcm.generateDefaultConfiguration();
		return json;
	}
	/**
	 * ִ��Ĭ�ϵ����/home/datax/bin/datax.py /home/datax/job/job.json
	 * 
	 */
	public StringBuffer defaultExe() {
		return lm.callDefaultShell();//Ĭ�ϵ�����
		
	}
	public ReaderManagement getReaderManagement() {
		return null;
	}

	public void updateReader(String name, String value, JSONObject json) {
		jcm.updateReader(name,value,json);
		
	}
	
	
}
