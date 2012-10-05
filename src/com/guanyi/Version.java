package com.guanyi;

import com.guanyi.tools.ActivityManagerTool;
import com.guanyi.tools.Tools;
import com.guanyi.tools.UpdateAPK;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class Version extends Activity {
	
	 public void onCreate(Bundle paramBundle)
	  {
	    super.onCreate(paramBundle);
	    
	    requestWindowFeature(Window.FEATURE_NO_TITLE);
	    setContentView(R.layout.version);
	    
	    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 1);

	    ActivityManagerTool.getActivityManager().add(this);
	    ((TextView)findViewById(R.id.vermsg)).setText("检测到新版本" + getIntent().getStringExtra("vermsg") + ",正在下载安装包...");
	    if (!Tools.isAccessNetwork(this))
	      Tools.netErrorToBack(this);
	    else
	      new UpdateAPK(this, getIntent().getStringExtra("url")).check();
	  }

	  protected void onDestroy()
	  {
	    System.gc();
	    ActivityManagerTool.getActivityManager().removeActivity(this);
	    super.onDestroy();
	  }

	  protected void onPause()
	  {
	    super.onPause();
	  }

	  protected void onResume()
	  {
	    super.onResume();
	  }

	  protected void onStart()
	  {
	    super.onStart();
	  }
	
	
}
