package com.guanyi.tools;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.webkit.URLUtil;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import com.guanyi.R;

public class UpdateAPK {
	
	  private static final String TAG = "AutoUpdate";
	  public Activity activity = null;
	  public String cacheFilePath;
	  private String fileNa = "";
	  
	  
	  final Handler handler = new Handler()
	  {
	    public void handleMessage(Message paramMessage)
	    {
	      if (paramMessage.what == 1)
	      {
	        UpdateAPK.this.pb.setProgress((int)(100L * UpdateAPK.this.length / UpdateAPK.this.totalLength));
	        TextView localTextView = UpdateAPK.this.num;
	        StringBuilder localStringBuilder1 = new StringBuilder(String.valueOf(100L * UpdateAPK.this.length / UpdateAPK.this.totalLength)).append("%  ");
	        Object[] arrayOfObject1 = new Object[1];
	        arrayOfObject1[0] = Float.valueOf((float)UpdateAPK.this.length / 1024.0F);
	        StringBuilder localStringBuilder2 = localStringBuilder1.append(String.format("%1$04.2f", arrayOfObject1)).append("KB/");
	        Object[] arrayOfObject2 = new Object[1];
	        arrayOfObject2[0] = Float.valueOf((float)UpdateAPK.this.totalLength / 1024.0F);
	        localTextView.setText(String.format("%1$04.2f", arrayOfObject2) + "KB");
	      }
	    }
	  };
	  
	  long length;
	  private TextView num;
	  private ProgressBar pb;
	  public String strURL;
	  long totalLength;
	  public int versionCode = 0;
	  public String versionName = "";

	  public UpdateAPK(Activity activity, String strurl)
	  {
	    this.activity = activity;
	    this.pb = ((ProgressBar)activity.findViewById(R.id.progress));
	    this.num = ((TextView)activity.findViewById(R.id.progressNum));
	    this.strURL = strurl;
	    this.cacheFilePath = (Environment.getExternalStorageDirectory() + "/mola/apk/");
	  }
	  
	  public static boolean isNetworkAvailable(Context context)
	  {
	    try
	    {
	      NetworkInfo networkinfo = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
	      if (networkinfo != null && networkinfo.isConnected())
	    	  return true;
	      else
	    	  return false;
	    }
	    catch (Exception ex)
	    {
	    	ex.printStackTrace();
	    } finally {
	    	
		}
		return false;
	  }

	  public void check()
	  {
	    if (isNetworkAvailable(this.activity)){
	    	downloadTheFile(this.strURL);
	    }
	  }
	  private void downloadTheFile(String str_url)
	  {
//	    this.fileNa = this.strURL.substring(1 + this.strURL.lastIndexOf("/"), this.strURL.length());
//	    try
//	    {
//	      new Thread(new Runnable(str_url)
//	      {
//	        public void run()
//	        {
//	          try
//	          {
//	            Tools.deleteAllFile(UpdateAPK.this.cacheFilePath);
//	            UpdateAPK.this.doDownloadTheFile(this.val$strPath);
//	            return;
//	          }
//	          catch (Exception localException)
//	          {
//	            while (true)
//	              Log.e("AutoUpdate", localException.getMessage(), localException);
//	          }
//	        }
//	      }).start();
//	      return;
//	    }
//	    catch (Exception localException)
//	    {
//	      while (true)
//	      {
//	        localException.printStackTrace();
//	        this.activity.finish();
//	      }
//	    }
	  }
}
