package com.dataxmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.op.DataxReaderOP;
import com.job.JobConfigurationManagement;
import com.job.ReaderManagement;
import com.linux.LinuxManagement;
import net.sf.json.JSONObject;
/**
 * 
 * dataxmanagement:datax管理器主要包括两个部分
 * 		jobmanagement:任务管理
 * 		linuxmanagement:linux管理，用于调用linux执行相应的操作
 * @author wang
 *
 */
@Service
public class DataxManagement {
	@Autowired
	private JobConfigurationManagement jcm=new JobConfigurationManagement();
	@Autowired
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
	/**
	 * 
	 * 队datax中地reader进行处理，
	 * @param dataxReaderOP
	 * @return   处理之后会返回一个json对象，该json对象是一个reader的对象
	 */
	public JSONObject processReader(DataxReaderOP dataxReaderOP) {
		return null;
	}
	
	
}
