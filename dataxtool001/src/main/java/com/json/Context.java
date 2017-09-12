package com.json;

public class Context {
	//用于遍历之后所查找的对象
	private Object jo=null;
	private Object joParent=null;
	public Object getJoParent() {
		return joParent;
	}

	public void setJoParent(Object joParent) {
		this.joParent = joParent;
	}

	public Object getJo() {
		return jo;
	}

	public void setJo(Object jo) {
		this.jo = jo;
	}

}
