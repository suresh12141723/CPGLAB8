package com.cpg.lab8.exercise2;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimerClassToDisplay  implements Runnable{
	
	
	public void displayTime()
	{
	  Thread obj=new Thread(this,"TimerClassThread");
	  obj.start();
	}
	
	public void run()
	{
		
	     SimpleDateFormat sm=new SimpleDateFormat("hh:mm:ss");
	    while(true)
	    {
	    	Calendar cal=Calendar.getInstance();
	     System.out.println(sm.format(cal.getTime()));
	     try {
			Thread.sleep(1000*10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    }
	}

}
