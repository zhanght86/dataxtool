package com.dataxmanagement;
import com.job.JobConfigurationManagement;
import com.linux.LinuxManagement;

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
	
	
}
