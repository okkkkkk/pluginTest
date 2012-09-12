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
		JSONObject jsonObj = new JSONObject();//���Է��ظ�JS��JSON����
		if(ACTION.equals(action)){
			try {
				String testData1 = data.getString(0);//JS�д�����JSON��ʽ������
				String testData2 = data.getString(1);
				
				Log.e("test!!!", "This is testData1 " + testData1);
				Log.e("test!!!", "This is testData2 " + testData2);
				
				jsonObj.put("testData1", testData1 + " after Plugin");
				jsonObj.put("testData2", testData2 + " after Plugin");
				
				result = new PluginResult(PluginResult.Status.OK, jsonObj);
				//���سɹ�ʱ����Java���봦�����JSON���ݷ��ظ�JS
			} catch (Exception e) {
				// TODO Auto-generated catch block
			  
				e.printStackTrace();
			}  
            
		}
		
		
		return result;
	}

}
