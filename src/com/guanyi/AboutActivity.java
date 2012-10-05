package com.guanyi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.guanyi.R;
import com.guanyi.tools.ActivityManagerTool;
import com.guanyi.tools.Tools;

public class AboutActivity extends Activity
  implements View.OnClickListener
{
  private TextView button_more;
  private ImageView classify;
  private DisplayMetrics dm = null;
  private ImageView index;
  private ImageView logo;
  private ImageView more;
  private ImageView search;
  private ImageView shop_car;
  private ImageView shopcar_num;
  private TextView ver;

  private void initToolBar()
  {
    this.index = ((ImageView)findViewById(R.id.index));
    this.classify = ((ImageView)findViewById(R.id.classify));
    this.search = ((ImageView)findViewById(R.id.search));
    this.shop_car = ((ImageView)findViewById(R.id.shopcar));
    this.more = ((ImageView)findViewById(R.id.more));
    this.shopcar_num = ((ImageView)findViewById(R.id.shopcar_num));
    this.index.setOnClickListener(this);
    this.classify.setOnClickListener(this);
    this.search.setOnClickListener(this);
    this.shop_car.setOnClickListener(this);
    this.more.setOnClickListener(this);
    this.more.setImageResource(R.drawable.home_menu_more_selected);
    
  }

  private void other()
  {
    this.dm = new DisplayMetrics();
    getWindowManager().getDefaultDisplay().getMetrics(this.dm);
    Tools.drawShopCarNum(this, this.dm, this.shopcar_num);
  }

  protected void onActivityResult(int requestCode1, int requestCode2, Intent paramIntent)
  {
    if ((requestCode1 == 0) && (requestCode1 == 1111))
    {
      setResult(1111);
      finish();
    }
  }

  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
	    default:
	    case R.id.button_more:
	    	
	    	
	    	
	    case R.id.about_logo:
	    	
	    	
	    case R.id.index:
	    {  finish();
	       this.index.setImageResource(R.drawable.home_menu_home_selected);
	       this.more.setImageResource(R.drawable.home_menu_more_normal);
	       Tools.switchHome(this);}
	    case R.id.classify:
	    	
	    	
	    	
	    case R.id.search:
	    	
	    	
	    case R.id.shopcar:
	    	
	    	
	    	
	    case R.id.more:
	    	
	    	
	    	
    }
//    while (true)
//    {
//      return;
//      finish();
//      continue;
//      this.index.setImageResource(2130837621);
//      this.more.setImageResource(2130837622);
//      Tools.switchHome(this);
//      continue;
//      this.more.setImageResource(2130837622);
//      this.index.setImageResource(2130837621);
//      Tools.switchHome(this);
//      continue;
//      this.classify.setImageResource(2130837619);
//      this.more.setImageResource(2130837622);
//      Intent localIntent4 = new Intent();
//      localIntent4.setFlags(131072);
//      localIntent4.setClass(this, ProductClassfyActivity.class);
//      startActivityForResult(localIntent4, 0);
//      setResult(1111);
//      finish();
//      continue;
//      this.search.setImageResource(2130837625);
//      this.more.setImageResource(2130837622);
//      Intent localIntent3 = new Intent();
//      localIntent3.setFlags(131072);
//      localIntent3.setClass(this, SearchActivity.class);
//      startActivityForResult(localIntent3, 0);
//      setResult(1111);
//      finish();
//      continue;
//      this.shop_car.setImageResource(2130837627);
//      this.more.setImageResource(2130837622);
//      Intent localIntent2 = new Intent();
//      localIntent2.setFlags(131072);
//      localIntent2.setClass(this, ShopCarActivity.class);
//      startActivityForResult(localIntent2, 0);
//      setResult(1111);
//      finish();
//      continue;
//      this.more.setImageResource(2130837623);
//      Intent localIntent1 = new Intent();
//      localIntent1.setFlags(131072);
//      localIntent1.setClass(this, MoreActivity.class);
//      startActivityForResult(localIntent1, 0);
//      setResult(1111);
//      finish();
//    }
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(Window.FEATURE_NO_TITLE);

    setContentView(R.layout.about);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 1);
  //  ActivityManagerTool.getActivityManager().add(this);
    this.button_more = ((TextView)findViewById(R.id.button_more));
    this.button_more.setOnClickListener(this);
    this.logo = ((ImageView)findViewById(R.id.about_logo));
    this.logo.setOnClickListener(this);
    this.ver = ((TextView)findViewById(R.id.about_version));
    this.ver.setText("版本号:V2.1.0 For Android");
    initToolBar();
    other();
  }

  protected void onDestroy()
  {
    System.gc();
    ActivityManagerTool.getActivityManager().removeActivity(this);
    super.onDestroy();
  }

  public void onPause()
  {
    super.onPause();
  }

  protected void onRestart()
  {
    super.onRestart();
    Tools.drawShopCarNum(this, this.dm, this.shopcar_num);
  }

  protected void onResume()
  {
    super.onResume();
    Tools.setBottom(this, 5);
  }

  protected void onStart()
  {
    super.onStart();
  }
}
