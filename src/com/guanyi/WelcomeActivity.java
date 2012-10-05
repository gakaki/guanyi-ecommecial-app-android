//package com.guanyi;
//
//
//    import android.app.Activity;
//import android.app.AlertDialog;
//    import android.app.AlertDialog.Builder;
//    import android.content.DialogInterface;
//    import android.content.DialogInterface.OnClickListener;
//    import android.content.Intent;
//    import android.content.SharedPreferences;
//    import android.content.SharedPreferences.Editor;
//    import android.os.Bundle;
//    import android.os.Handler;
//    import android.os.Message;
//    import android.os.Process;
//    import android.util.DisplayMetrics;
//    import android.view.Display;
//    import android.view.KeyEvent;
//    import android.view.Window;
//    import android.view.WindowManager;
//    import android.widget.ProgressBar;
////    import com.moonbasa.handler.VersionHandler;
////    import com.moonbasa.handler.VersionHandler.VersionMSG;
////    import com.moonbasa.tools.ActivityManagerTool;
////    import com.moonbasa.tools.MyProgressDialog;
////    import com.moonbasa.tools.Tools;
////    import com.moonbasa.tools.XmlParseTool;
//    import java.io.PrintStream;
//    import java.io.UnsupportedEncodingException;
//    import java.util.HashMap;
//import java.util.Map;
//
//import com.guanyi.tools.ActivityManagerTool;
//import com.guanyi.tools.Tools;
//
//    public class WelcomeActivity extends Activity
//    {
//      private static final int GETWEBLOGID_ERROR = 101;
//      private static final int GETWEBLOGID_OK = 100;
//      public static final int GETWEB_TIMEOUT = 103;
//      public static final int LOGIN_OK = 102;
//      public static final int SUCCEED = 111;
//      boolean flag = true;
//      private Handler handle = new Handler()
//      {
//        public void handleMessage(Message paramMessage)
//        {
//          System.out.println(paramMessage.what);
//          switch (paramMessage.what)
//          {
//          default:
//          case 100:
//          case 101:
//          case 111:
//          case 2:
//          }
//          while (true)
//          {
//            return;
//            WelcomeActivity.this.ablishDialog();
//            if (WelcomeActivity.this.isFirst)
//            {
//              Intent localIntent5 = new Intent();
//              localIntent5.setClass(WelcomeActivity.this, IntroActivity.class);
//              WelcomeActivity.this.startActivity(localIntent5);
//              WelcomeActivity.this.finish();
//              continue;
//            }
//            Intent localIntent6 = new Intent();
//            localIntent6.setClass(WelcomeActivity.this, ActiveActivity.class);
//            WelcomeActivity.this.startActivity(localIntent6);
//            WelcomeActivity.this.finish();
//            continue;
//            WelcomeActivity.this.ablishDialog();
//            WelcomeActivity.this.alertDialog(WelcomeActivity.this.getString(2131230736), WelcomeActivity.this.getString(2131230739));
//            continue;
//            WelcomeActivity.this.ablishDialog();
//            System.out.println(WelcomeActivity.this.ver.updateMethod + "这个是升级的方法");
//            if ("2".endsWith(WelcomeActivity.this.ver.updateMethod))
//            {
//              AlertDialog.Builder localBuilder1 = new AlertDialog.Builder(WelcomeActivity.this);
//              localBuilder1.setTitle("温馨提示");
//              localBuilder1.setMessage(WelcomeActivity.this.ver.updateMess);
//              localBuilder1.setPositiveButton("升级", new DialogInterface.OnClickListener()
//              {
//                public void onClick(DialogInterface paramDialogInterface, int paramInt)
//                {
//                  Intent localIntent = new Intent(WelcomeActivity.this, Version.class);
//                  localIntent.putExtra("url", WelcomeActivity.this.ver.updateUrl);
//                  localIntent.putExtra("vermsg", WelcomeActivity.this.ver.updateMess);
//                  WelcomeActivity.this.startActivity(localIntent);
//                  WelcomeActivity.this.finish();
//                }
//              });
//              localBuilder1.show();
//              continue;
//            }
//            if ("1".endsWith(WelcomeActivity.this.ver.updateMethod))
//            {
//              AlertDialog.Builder localBuilder2 = new AlertDialog.Builder(WelcomeActivity.this);
//              localBuilder2.setTitle("温馨提示");
//              localBuilder2.setMessage(WelcomeActivity.this.ver.updateMess);
//              localBuilder2.setPositiveButton("升级", new DialogInterface.OnClickListener()
//              {
//                public void onClick(DialogInterface paramDialogInterface, int paramInt)
//                {
//                  Intent localIntent = new Intent(WelcomeActivity.this, Version.class);
//                  localIntent.putExtra("url", WelcomeActivity.this.ver.updateUrl);
//                  localIntent.putExtra("vermsg", WelcomeActivity.this.ver.updateMess);
//                  WelcomeActivity.this.startActivity(localIntent);
//                  WelcomeActivity.this.finish();
//                }
//              });
//              localBuilder2.setNegativeButton("暂不", new DialogInterface.OnClickListener()
//              {
//                public void onClick(DialogInterface paramDialogInterface, int paramInt)
//                {
//                  if (WelcomeActivity.this.isFirst)
//                  {
//                    Intent localIntent1 = new Intent();
//                    localIntent1.setClass(WelcomeActivity.this, IntroActivity.class);
//                    WelcomeActivity.this.startActivity(localIntent1);
//                    WelcomeActivity.this.finish();
//                  }
//                  while (true)
//                  {
//                    return;
//                    Intent localIntent2 = new Intent();
//                    localIntent2.setClass(WelcomeActivity.this, ActiveActivity.class);
//                    WelcomeActivity.this.startActivity(localIntent2);
//                    WelcomeActivity.this.finish();
//                  }
//                }
//              });
//              localBuilder2.show();
//              continue;
//            }
//            if (!"0".endsWith(WelcomeActivity.this.ver.updateMethod))
//              continue;
//            if (WelcomeActivity.this.isFirst)
//            {
//              Intent localIntent3 = new Intent();
//              localIntent3.setClass(WelcomeActivity.this, IntroActivity.class);
//              WelcomeActivity.this.startActivity(localIntent3);
//              WelcomeActivity.this.finish();
//              continue;
//            }
//            Intent localIntent4 = new Intent();
//            localIntent4.setClass(WelcomeActivity.this, ActiveActivity.class);
//            WelcomeActivity.this.startActivity(localIntent4);
//            WelcomeActivity.this.finish();
//            continue;
//            WelcomeActivity.this.ablishDialog();
//            if (WelcomeActivity.this.isFirst)
//            {
//              Intent localIntent1 = new Intent();
//              localIntent1.setClass(WelcomeActivity.this, IntroActivity.class);
//              WelcomeActivity.this.startActivity(localIntent1);
//              WelcomeActivity.this.finish();
//              continue;
//            }
//            Intent localIntent2 = new Intent();
//            localIntent2.setClass(WelcomeActivity.this, ActiveActivity.class);
//            WelcomeActivity.this.startActivity(localIntent2);
//            WelcomeActivity.this.finish();
//          }
//        }
//      };
//      private boolean isFirst = false;
//      private String isnew = "";
//      private ProgressBar progressBar;
//      private MyProgressDialog progressDialog;
//      SharedPreferences settings = null;
//      boolean state = false;
//      private String udid = "";
//      SharedPreferences userPreference = null;
//      VersionHandler.VersionMSG ver;
//      VersionHandler vh;
//
//      private void ablishDialog()
//      {
//        if (this.progressDialog != null)
//          this.progressDialog.cancel();
//      }
//
//      private void activityManager()
//      {
//        ActivityManagerTool.getActivityManager().setBottomActivities(ActiveActivity.class);
//        ActivityManagerTool.getActivityManager().setBottomActivities(SearchActivity.class);
//        ActivityManagerTool.getActivityManager().setBottomActivities(ProductClassfyActivity.class);
//        ActivityManagerTool.getActivityManager().setBottomActivities(ShopCarActivity.class);
//        ActivityManagerTool.getActivityManager().setBottomActivities(MoreActivity.class);
//        ActivityManagerTool.getActivityManager().setBottomActivities(UserLoginActivity.class);
//        ActivityManagerTool.getActivityManager().setBottomActivities(ChildIndexActivity.class);
//      }
//
//      private void alertDialog(String paramString1, String paramString2)
//      {
//        AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
//        localBuilder.setTitle(paramString1);
//        localBuilder.setMessage(paramString2);
//        localBuilder.setPositiveButton("确定", new DialogInterface.OnClickListener()
//        {
//          public void onClick(DialogInterface paramDialogInterface, int paramInt)
//          {
//          }
//        });
//        localBuilder.show();
//      }
//
//      private void dialog()
//      {
//        this.progressDialog = new MyProgressDialog(this);
//        this.progressDialog.setContentView(2130903169);
//        this.progressDialog.show();
//      }
//
//      private void saveSysInfo()
//      {
//        getSharedPreferences("system", 0).edit().
//        putString("screen_size", Tools.getScreenSize(this)).
//        putString("isfirst", "1").
//        putString("udid", Tools.getGUID()).
//        commit();
//      }
//
//      private void sendData()
//      {
//        if (Tools.isAccessNetwork(this))
//          new Thread(new Runnable()
//          {
//            public void run()
//            {
//              HashMap localHashMap = new HashMap();
//              localHashMap.put("uid", WelcomeActivity.this.udid);
//              localHashMap.put("chanelid", "1");
//              System.out.println("isnew:" + WelcomeActivity.this.isnew);
//              localHashMap.put("isnew", WelcomeActivity.this.isnew);
//              try
//              {
//                localHashMap.put("chanelname", new String("官网".getBytes(), "UTF-8"));
//                localHashMap.put("optype", new String("启动".getBytes(), "UTF-8"));
//                localHashMap.put("sysos", "Android");
//                localHashMap.put("osver", Tools.getSDKVersion(WelcomeActivity.this));
//                localHashMap.put("cliver", "2.1");
//                localHashMap.put("devnum", Tools.getDeviceId(WelcomeActivity.this));
//                localHashMap.put("promid", "111111");
//                localHashMap.put("netype", Tools.getAccessNetworkType(WelcomeActivity.this));
//                localHashMap.put("carrier", Tools.getCarrier(WelcomeActivity.this));
//                localHashMap.put("optime", Tools.getNowTime());
//                localHashMap.put("mip", Tools.getLocalIpAddress());
//                Tools.link(WelcomeActivity.this, "http://an.moonbasa.com/m-open.do", localHashMap);
//                return;
//              }
//              catch (UnsupportedEncodingException localUnsupportedEncodingException)
//              {
//                while (true)
//                  localUnsupportedEncodingException.printStackTrace();
//              }
//            }
//          }).start();
//      }
//
//      private void updateVersion()
//      {
//        Thread localThread = new Thread(new Runnable()
//        {
//          public void run()
//          {
//            HashMap localHashMap = new HashMap();
//            String str1 = Tools.getNowTime();
//            localHashMap.put("method", "checkversion");
//            localHashMap.put("sign", Tools.md5(WelcomeActivity.this.udid + "checkversion" + str1));
//            String str2 = WelcomeActivity.this.getString(2131230723);
//            WelcomeActivity.this.vh = ((VersionHandler)XmlParseTool.requestToParse(WelcomeActivity.this, str2, localHashMap, new VersionHandler()));
//            if (XmlParseTool.responseValue == 1)
//            {
//              WelcomeActivity.this.ver = WelcomeActivity.this.vh.ver;
//              if (WelcomeActivity.this.vh.ver != null)
//                WelcomeActivity.this.handle.sendMessage(WelcomeActivity.this.handle.obtainMessage(111));
//            }
//            while (true)
//            {
//              return;
//              WelcomeActivity.this.handle.sendMessage(WelcomeActivity.this.handle.obtainMessage(2));
//              continue;
//              WelcomeActivity.this.handle.sendMessage(WelcomeActivity.this.handle.obtainMessage(2));
//            }
//          }
//        });
//        try
//        {
//          Thread.sleep(2000L);
//          localThread.start();
//          return;
//        }
//        catch (InterruptedException localInterruptedException)
//        {
//          while (true)
//            localInterruptedException.printStackTrace();
//        }
//      }
//
//	public void onCreate(Bundle savedInstanceState) {
//
//		super.onCreate(savedInstanceState);
//		requestWindowFeature(Window.FEATURE_NO_TITLE);
//		setContentView(R.layout.index_welcome);
//
//		getWindow().setFlags(1024, 1024);
//
//		System.out.println("手机id：" + Tools.getDeviceId(this));
//		DisplayMetrics localDisplayMetrics = new DisplayMetrics();
//		getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
//		com.guanyi.tools.Constant.density = localDisplayMetrics.density;
//
//		if (getSharedPreferences("system", 0).getString("isfirst", "0").equals(
//				"1")) {
//			this.isFirst = false;
//			this.udid = getSharedPreferences("system", 0).getString("udid",
//					Tools.getDeviceId(this));
//			if (!this.isFirst)
//				this.isnew = "0";
//			this.isnew = "1";
//			if (Tools.isAccessNetwork(this))
//				updateVersion();
//			AlertDialog.Builder dialog = new AlertDialog.Builder(this);
//			dialog.setTitle(R.string.errorTitle);
//			dialog.setMessage(R.string.nonetwork);
//			dialog.setNegativeButton(R.string.know,
//					new DialogInterface.OnClickListener() {
//						public void onClick(
//								DialogInterface paramDialogInterface,
//								int paramInt) {
//							System.exit(0);
//						}
//					});
//			dialog.show();
//		} else {
//
//			this.isFirst = true;
//			saveSysInfo();
//			this.isnew = "0";
//			if (Tools.isAccessNetwork(this)) {
//				updateVersion();
//			}
//			activityManager();
//			sendData();
//			dialog();
//		}
//	}
//     
//
//      protected void onDestroy()
//      {
//        super.onDestroy();
//        this.flag = false;
//      }
//
//      public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
//      {
//        if (paramInt == 4)
//        {
//          this.flag = false;
//          Process.killProcess(Process.myPid());
//        }
//        return this.flag;
//      }
//
//      protected void onPause()
//      {
//        super.onPause();
//      }
//
//      protected void onResume()
//      {
//        super.onResume();
//      }
//
//      protected void onStart()
//      {
//        super.onStart();
//      }
//}
//
