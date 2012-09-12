package buaa.plugin.test;

import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;

import com.phonegap.api.Plugin;

public class test01 extends Plugin{

	public static final String ACTION = "test";
	
	@Override
	public PluginResult execute(String action, JSONArray data, String callbackId) {
		// TODO Auto-generated method stub
		PluginResult result = null;  
		JSONObject jsonObj = new JSONObject();//可以返回给JS的JSON数据
		if(ACTION.equals(action)){
			try {
				String testData1 = data.getString(0);//JS中传来的JSON格式的数据
				String testData2 = data.getString(1);
				
				Log.e("test!!!", "This is testData1 " + testData1);
				Log.e("test!!!", "This is testData2 " + testData2);
				
				jsonObj.put("testData1", testData1 + " after Plugin");
				jsonObj.put("testData2", testData2 + " after Plugin");
				
				result = new PluginResult(PluginResult.Status.OK, jsonObj);
				//返回成功时，将Java代码处理过的JSON数据返回给JS
			} catch (Exception e) {
				// TODO Auto-generated catch block
			  
				e.printStackTrace();
			}  
            
		}
		
		
		return result;
	}

}
