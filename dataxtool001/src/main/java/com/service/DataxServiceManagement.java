package com.service;

import javax.print.DocFlavor.READER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dataxmanagement.DataxManagement;
import com.domain.op.DataxReaderOP;
import com.job.ReaderManagement;
import com.json.JsonManagement;
import com.sun.corba.se.impl.oa.poa.ActiveObjectMap.Key;

import net.sf.json.JSONObject;
//业务层的类，由spring容器来管理
@Service
public class DataxServiceManagement {
	@Autowired
	private DataxManagement dataxManagement;
	/**
	 * 
	 * 接收从前台的数据，添加指定名字和指定值
	 * 	添加操作会有两种情况，一种是直接添加key-value在reader下面
		还有一种是添加column
		首先验证要执行的操作是否为add
	 * @param dataxReaderOP
	 */
	public JSONObject processDataxReaderAdd(DataxReaderOP dataxReaderOP) {
		ReaderManagement readerManagement=new ReaderManagement();
		//生成一个默认的reader
		JSONObject reader=readerManagement.generateDefaultReader();
		if("add".equals(dataxReaderOP.getOp())) {
			//判断要添加的名字
			if(!"column".equals(dataxReaderOP.getReaderparameter())) {
				//为假，表示不为column
				//接下来还需要判断该字段是否已经存在，如果存在就则给出提示信息，并修改
				String name=dataxReaderOP.getReaderparameter();
				String value=dataxReaderOP.getArg();
				readerManagement.updateReader(name, value, reader);
				
			}else { //添加column
				System.out.println("没有对column进行更新");
			}
		}else {
			System.out.println("不是所要求的操作");
		}
		return reader;
		
	}
	
	/*
	 * 删除指定reader的指定字段
	 * 
	 */
	public JSONObject processDataxReaderDelete(DataxReaderOP dataxReaderOP) {
		ReaderManagement readerManagement=new ReaderManagement();
		//生成一个默认的reader
		JSONObject reader=readerManagement.generateDefaultReader();
		String key=dataxReaderOP.getReaderparameter();
		readerManagement.deleteByKey(reader,key);
		return reader;
	}
}
