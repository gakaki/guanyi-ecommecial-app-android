package com.guanyi.tools;

import com.guanyi.ActiveActivity;
import com.guanyi.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
//import com.moonbasa.ActiveActivity;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.util.EntityUtils;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;


public class Tools {


	public static void switchHome(Activity paramActivity)
	  {
	    Intent localIntent = new Intent();
	    localIntent.setFlags(131072);
	    localIntent.setClass(paramActivity, ActiveActivity.class);
	    paramActivity.startActivityForResult(localIntent, 0);
	    paramActivity.setResult(1111);
	    paramActivity.finish();
	  }
	  
	  public static boolean isAccessNetwork(Context context)
	  {
		ConnectivityManager connectivity_manager = (ConnectivityManager)context.getSystemService("connectivity");
	    if ((connectivity_manager.getActiveNetworkInfo() != null) && (connectivity_manager.getActiveNetworkInfo().isAvailable()))
	    	return true;
	    return false;
	  }
	  public static void netErrorToBack( final Context context)
	  {
	    AlertDialog.Builder builder = new AlertDialog.Builder(context);
	    builder.setTitle(R.string.errorTitle);
	    builder.setMessage(R.string.nonetwork);
	   
	    builder.setPositiveButton("确定", new DialogInterface.OnClickListener()
	    {
	      public void onClick(DialogInterface dialog, int which)
	      {
	      //  ((Activity)Tools.this).finish();
	      }
	    });
	    
	    builder.show();
	  }
	  public static void setBottom(Activity paramActivity, int paramInt)
	  {
	  }
	  
	  public static void drawShopCarNum(Context paramContext, DisplayMetrics paramDisplayMetrics, ImageView paramImageView)
	  {
		  /*
	    int i = paramContext.getSharedPreferences("user", 0).getInt("shopcartnum", 0);
	    float f;
	    Canvas localCanvas;
	    Paint localPaint;
	    if ((i >= 100) && (i < 1000))
	    {
	      f = 6.0F * paramDisplayMetrics.scaledDensity;
	      Bitmap localBitmap1 = ((BitmapDrawable)paramContext.getResources().getDrawable(2130837710)).getBitmap();
	      Bitmap localBitmap2 = Bitmap.createBitmap((int)(33.0F * paramDisplayMetrics.scaledDensity), (int)(33.0F * paramDisplayMetrics.scaledDensity), Bitmap.Config.ARGB_8888);
	      localCanvas = new Canvas(localBitmap2);
	      localCanvas.drawBitmap(localBitmap1, 0.0F, 0.0F, null);
	      localPaint = new Paint();
	      localPaint.setAntiAlias(true);
	      localPaint.setFakeBoldText(true);
	      localPaint.setTextSize(12.0F * paramDisplayMetrics.scaledDensity);
	      localPaint.setARGB(255, 255, 255, 255);
	      if (i >= 1000)
	        break label263;
	      localCanvas.drawText(i, f, 18.0F * paramDisplayMetrics.scaledDensity, localPaint);
	      label188: paramImageView.setImageBitmap(localBitmap2);
	      if (i != 0)
	        break label286;
	      paramImageView.setVisibility(8);
	    }
	    while (true)
	    {
	      return;
	      if ((i >= 10) && (i < 100))
	      {
	        f = 9.0F * paramDisplayMetrics.scaledDensity;
	        break;
	      }
	      if (i >= 1000)
	      {
	        f = 10.0F * paramDisplayMetrics.scaledDensity;
	        break;
	      }
	      f = 13.0F * paramDisplayMetrics.scaledDensity;
	      break;
	      label263: localCanvas.drawText("...", f, 18.0F * paramDisplayMetrics.scaledDensity, localPaint);
	      break label188;
	      label286: paramImageView.setVisibility(0);
	    }*/
	  }
	  
	  public static String getScreenSize(Activity paramActivity)
	  {
	    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
	    paramActivity.getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
	    String str;
	    if (480 == localDisplayMetrics.widthPixels)
	    { str = "Android480";}
	    else if (320 == localDisplayMetrics.widthPixels)
	    { str = "iPhone3Android320";}
	    else if (240 == localDisplayMetrics.widthPixels)
	    { str = "Android240";}
	    else  if (localDisplayMetrics.widthPixels > 480)
	    { str = "Android480";}
	    else  if (localDisplayMetrics.widthPixels < 240)
	    { str = "Android240";}
	    str = "Android480";
	    return str;
	  }

	  public static String getDeviceId(Context paramContext)
	  {
	    return ((TelephonyManager)paramContext.getSystemService("phone")).getDeviceId();
	  }

	  public static String getFileName(String paramString)
	  {
	    return paramString.substring(1 + paramString.lastIndexOf("/"));
	  }

	  public static String getFileNameFromURL(String paramString)
	  {
	    return paramString.substring(1 + paramString.lastIndexOf("/"));
	  }

	  public static String getGUID()
	  {
	    return UUID.randomUUID().toString();
	  }

	  public static String getIMSI(Context paramContext)
	  {
	    return ((TelephonyManager)paramContext.getSystemService("phone")).getSubscriberId();
	  }
	  public static String getLocalIpAddress()
	  {
	    String str1;
	    try
	    {
	      while (true)
	      {
	        Enumeration localEnumeration1 = NetworkInterface.getNetworkInterfaces();
	        while (true)
	          if (localEnumeration1.hasMoreElements())
	          {
	            Enumeration localEnumeration2 = ((NetworkInterface)localEnumeration1.nextElement()).getInetAddresses();
	            if (!localEnumeration2.hasMoreElements())
	              continue;
	            InetAddress localInetAddress = (InetAddress)localEnumeration2.nextElement();
	            if (localInetAddress.isLoopbackAddress())
	              break;
	            String str2 = localInetAddress.getHostAddress().toString();
	            str1 = str2;
	          }
	      }
	    }
	    catch (SocketException localSocketException)
	    {
	      Log.e("LOG_TAG", localSocketException.toString());
	      str1 = null;
	    }
	    return str1;
	  }

	  public static String getModle()
	  {
	    new Build();
	    return Build.MODEL;
	  }

	  public static String getNowTime()
	  {
	    return new SimpleDateFormat("yyyyMMddHHmm").format(Calendar.getInstance().getTime());
	  }

	  public static String getSDKVersion(Context context)
	  {
	    String build_ver = Build.VERSION.SDK;
	    String curr_ver;
	    if ("2".equals(build_ver))
	      curr_ver = "android1.1";
	    else if ("3".equals(build_ver))
	      curr_ver = "android1.5";
	    else if ("4".equals(build_ver))
	       curr_ver = "android1.6";
	    else if ("5".equals(build_ver))
	       curr_ver = "android2.0";
	    else if ("6".equals(build_ver))
	       curr_ver = "android2.0.1";
	    else if ("7".equals(build_ver))
	       curr_ver = "android2.1";
	    else if ("8".equals(build_ver))
	       curr_ver = "android2.2";
	    else if ("9".equals(build_ver))
	       curr_ver = "android2.3.1";
	    else if ("10".equals(build_ver))
	      curr_ver = "android2.3.3";
	    else if ("11".equals(build_ver))
	      curr_ver = "android3.0";
	    else if ("12".equals(build_ver))
	      curr_ver = "android3.1";
	    else if ("13".equals(build_ver))
	      curr_ver = "android3.2";
	    else if ("14".equals(build_ver))
	      curr_ver = "android4.0";
	    else if ("15".equals(build_ver))
	      curr_ver = "android4.03";
	    else 
	      curr_ver = "other";
	    return curr_ver;
	  }

	  public static long getSDSize()
	  {
	    long l = 0;
	    if ("mounted".equals(Environment.getExternalStorageState()))
	    {
	      StatFs localStatFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
	      l = localStatFs.getBlockSize() * localStatFs.getAvailableBlocks();
	    }
	    return l>0?l:-1l;
	  }
	  
	  
	  
	  private static final char[] HEX_DIGITS;
	  private static String entityStr;
//	  public static MyProgressDialog progressDialog;
	  public static int responseValue;

	  static
	  {
	    char[] arrayOfChar = new char[16];
	    arrayOfChar[0] = 48;
	    arrayOfChar[1] = 49;
	    arrayOfChar[2] = 50;
	    arrayOfChar[3] = 51;
	    arrayOfChar[4] = 52;
	    arrayOfChar[5] = 53;
	    arrayOfChar[6] = 54;
	    arrayOfChar[7] = 55;
	    arrayOfChar[8] = 56;
	    arrayOfChar[9] = 57;
	    arrayOfChar[10] = 97;
	    arrayOfChar[11] = 98;
	    arrayOfChar[12] = 99;
	    arrayOfChar[13] = 100;
	    arrayOfChar[14] = 101;
	    arrayOfChar[15] = 102;
	    HEX_DIGITS = arrayOfChar;
	  }

	    /*
		 * MD5加密 这里被我替换了 和反编译的不一样
		 */
	  private String md5(String str) {     
	        MessageDigest messageDigest = null;     
	     
	        try {     
	            messageDigest = MessageDigest.getInstance("MD5");     
	     
	            messageDigest.reset();     
	     
	            messageDigest.update(str.getBytes("UTF-8"));     
	        } catch (NoSuchAlgorithmException e) {     
	            System.out.println("NoSuchAlgorithmException caught!");     
	            System.exit(-1);     
	        } catch (UnsupportedEncodingException e) {     
	            e.printStackTrace();     
	        }     
	     
	        byte[] byteArray = messageDigest.digest();     
	     
	        StringBuffer md5StrBuff = new StringBuffer();     
	        
	        for (int i = 0; i < byteArray.length; i++) {                 
	            if (Integer.toHexString(0xFF & byteArray[i]).length() == 1)     
	                md5StrBuff.append("0").append(Integer.toHexString(0xFF & byteArray[i]));     
	            else     
	                md5StrBuff.append(Integer.toHexString(0xFF & byteArray[i]));     
	        }     
	      //16位加密，从第9位到25位
	        return md5StrBuff.substring(8, 24).toString().toUpperCase();    
	    }  

	  public static void netError(Context context)
	  {
	    AlertDialog.Builder dialog = new AlertDialog.Builder(context);
	    dialog.setTitle(R.string.errorTitle);
	    dialog.setMessage(R.string.nonetwork);
	    dialog.setPositiveButton("确定", null);
	    dialog.show();
	  }
}
