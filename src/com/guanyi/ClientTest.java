package com.guanyi;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import org.json.*;

import com.loopj.android.http.*;
import com.guanyi.tools.*;

public class ClientTest extends Activity {
	
	protected void onCreate(Bundle paramBundle)
	{   // http://douban.fm/app#android_radio doubanfm is using
	    super.onCreate(paramBundle);
	    requestWindowFeature(Window.FEATURE_NO_TITLE);

	    setContentView(R.layout.about);
	    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 1);
	    
	    
	    RequestParams params = new RequestParams();
		params.put("method", "sys.version.update");
		params.put("more", "data");
		try {
			this.get(params);
		} catch (JSONException e) {
			e.printStackTrace();
		}

	}
	public void get(RequestParams params) throws JSONException {
		
        APIClient.get(null, params, new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(JSONArray response) {
                
                System.out.println(response);
            }
        });
    }
	
}
