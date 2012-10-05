package com.guanyi.tools;

import java.util.List;
import android.app.Activity;
import android.app.Activity;
import android.app.Application;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ActivityManagerTool {

	  private static ActivityManagerTool manager;
	  private List<Activity> activities = new LinkedList();
	  private List<Class<?>> bottomActivities = new LinkedList();
	  private boolean isExist = false;

	  public static ActivityManagerTool getActivityManager()
	  {
	    if (manager == null)
	      manager = new ActivityManagerTool();
	    return manager;
	  }

	  public boolean add(Activity activity)
	  {	
		  boolean isExist = true;
		  if (isBottomActivity(activity) ){
			  return isExist;
		  }
		  
		  this.activities.add(activity);
				  
		  for(int i=0;i<this.activities.size();i++){
			  
	    	Activity tmp_act = (Activity)this.activities.get(i);
	    	
	    	if ( tmp_act.getClass().equals( activity.getClass()))
	    	{
	    		isExist = true;
	    	}
	    	
	    	if (!isBottomActivity(tmp_act) )
	        {
	    		popActivity(tmp_act);
	    		
	        }
	    	this.activities.remove(i);
		  }
	      return isExist;
	  }

	  public void backIndex(Activity paramActivity, Class<?> paramClass)
	  {
	    if (this.activities.size() <= 0){
	    	return;
	    }
		  if (isBottomActivity((Activity)this.activities.get(-1 + this.activities.size())))
		  {
		    Tools.switchHome(paramActivity);
		  }
	      /*
			       * if (this.activities.size() <= 0);
		    while (true)
		    {
		      return;
		      if (isBottomActivity((Activity)this.activities.get(-1 + this.activities.size())))
		      {
		        Tools.switchHome(paramActivity);
		        continue;
		      }
		    }*/
	  }

	  public Activity currentActivity()
	  {
	    return (Activity)this.activities.get(-1 + this.activities.size());
	  }

	  public void exit()
	  {
	    Iterator<Activity> activities = this.activities.iterator();
	    while (true)
	    {
	      if (!activities.hasNext())
	      {
	        System.out.println("退出系统");
	        System.exit(0);
	        return;
	      }
	      Activity act= (Activity)activities.next();
	      if (act == null)
	        continue;
	      act.finish();
	    }
	  }

	  public void finish(Activity paramActivity)
	  {
	    Iterator<Activity> localIterator = this.activities.iterator();
	    while (true)
	    {
	      if (!localIterator.hasNext())
	        return;
	      Activity localActivity = (Activity)localIterator.next();
	      if (paramActivity == localActivity)
	        continue;
	      localActivity.finish();
	    }
	  }

	  public boolean isBottomActivity(Activity paramActivity)
	  {
		  for (int i = 0;i<bottomActivities.size(); i++){
			  if (paramActivity.getClass() == this.bottomActivities.get(i)){
				 return true;
			  }
		  }
		  return false;
	  }

	  public void popActivity(Activity paramActivity)
	  {
	    if (paramActivity != null)
	    {
	      paramActivity.finish();
	      this.activities.remove(paramActivity);
	    }
	  }

	  public void removeActivity(Activity paramActivity)
	  {
	    if (paramActivity != null)
	      this.activities.remove(paramActivity);
	  }

	  public void setBottomActivities(Class<?> paramClass)
	  {
	    this.bottomActivities.add(paramClass);
	  }
}
