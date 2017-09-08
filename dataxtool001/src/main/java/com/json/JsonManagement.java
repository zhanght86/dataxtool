package com.json;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JsonManagement {
	public JSONObject translateStringToJSONObiect(String jsonOfString) {
		JSONObject jsonObject=null;
		jsonObject=JSONObject.fromObject(jsonOfString);
		return jsonObject;
	}
	public String parseJsonFileToString(String uri) {
		if(uri==null||"".equals(uri)) {//使用默认的路径
			uri="d://job.json";
		}
		File f=new File(uri);
		StringBuffer json=new StringBuffer();
		try {
			InputStream in=new FileInputStream(f);
			BufferedReader read=new BufferedReader(new InputStreamReader(in, "UTF-8"));
			String line="";
			while((line=read.readLine())!=null) {
				json.append(line);
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IO异常");
			e.printStackTrace();
		}
		return json.toString();
	}
	
	public JSONObject createNewJsonObject() {
		JSONObject json=new JSONObject();
		return json;
	}
	public void addJsonObject(String key,String value,JSONObject json) {
		json.put(key, value);
	}
	public Object stringToJavaBean(String s) {
		return null;
	}
	
	public JSONArray listToJsonArray(List l) {
		JSONArray json=JSONArray.fromObject(l);
		return json;
	}
	
	public JSONObject mapToJsonObject(Map map) {
		JSONObject json=JSONObject.fromObject(map);
		return json;	
	}
	public JSONArray mapToJsonArray(Map map) {
		JSONArray json=JSONArray.fromObject(map);
		return json;
		
	}
	public Object findJSONByKey(String key,JSONObject obj) {
		Context c=new Context();
		
		anzlize(key,c,obj);
		return c.getJo();
	}
	
	private void anzlize(String key, Context c,Object o) {
		
		if(o instanceof JSONObject) { //对象 
			JSONObject jsonObj=(JSONObject) o;
			
			//判断对象里面的key是否是要寻找的key
			Iterator it=jsonObj.keys();
			while(it.hasNext()) {
				String subKey=it.next().toString();
				//判断是否是要寻找的key
				if(key.equals(subKey)) {
					Object subObject=jsonObj.get(subKey);
					c.setJo(subObject);
				}else {
					anzlize(key, c,jsonObj.get(subKey) );
				}
			}
			
		}else if(o instanceof JSONArray) {
			JSONArray arr=(JSONArray) o;
			
			for(int i=0;i<arr.size();i++) {
				anzlize(key, c,arr.get(i));
			}
		}else { //一般的值 do nothing
			
		}
		
	}
	
	
	
	
    public static String formatJson(String jsonStr) {
        if (null == jsonStr || "".equals(jsonStr)) return "";
        StringBuilder sb = new StringBuilder();
        char last = '\0';
        char current = '\0';
        int indent = 0;
        for (int i = 0; i < jsonStr.length(); i++) {
            last = current;
            current = jsonStr.charAt(i);

           //遇到{ [换行，且下一行缩进
           switch (current) {
                case '{':
                case '[':
                    sb.append(current);
                    sb.append('\n');
                    indent++;
                    addIndentBlank(sb, indent);
                    break;

             //遇到} ]换行，当前行缩进
               case '}':
                case ']':
                    sb.append('\n');
                    indent--;
                    addIndentBlank(sb, indent);
                    sb.append(current);
                    break;

              //遇到,换行
               case ',':
                    sb.append(current);
                    if (last != '\\') {
                        sb.append('\n');
                        addIndentBlank(sb, indent);
                    }
                    break;
                default:
                    sb.append(current);
            }
        }
 
        return sb.toString();
    }
 
    /**
     * 添加space
     * @param sb
     * @param indent
     */
    private static void addIndentBlank(StringBuilder sb, int indent) {
        for (int i = 0; i < indent; i++) {
            sb.append('\t');
        }
    }
    
    //格式化输出json
    public static void showJson(Object json) {
    	String s=json.toString();
    	System.out.println(JsonManagement.formatJson(s));
    }
    
    public static void StringToFile(String json,String url) {
    	  // TODO Auto-generated method stub
        File f=new File(url);//新建一个文件对象
        FileWriter fw;
        try {
        	fw=new FileWriter(f);//新建一个FileWriter
        	//String str="chenliang\r\nrrrrrrttttttt";
        	fw.write(json);//将字符串写入到指定的路径下的文件中
        	fw.close();
  
        } catch (IOException e) {
        	// TODO Auto-generated catch block
        	e.printStackTrace();
        }
    }
    
    public static void JSONToFile(JSONObject json,String url) {
    	String jsonString=json.toString();
    	StringToFile(jsonString, url);
    }
  
 
    
}
