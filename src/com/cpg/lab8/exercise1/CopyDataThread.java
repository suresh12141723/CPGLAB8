package com.cpg.lab8.exercise1;
import java.io.*;
public class CopyDataThread extends Thread 
{
	File source,target;
	
    CopyDataThread(File source,File target)
    {
      this.source=source;
      this.target=target;
    }
    
    
    public void run()
    {
    	try(FileOutputStream fos=new FileOutputStream(target,true);FileInputStream fis=new FileInputStream(source))
    	{
    	   while(true)
    	   {
    		   byte[] b=new byte[10];
    		   fis.read(b);
    		   System.out.println("10 characters copied!");
    		   Thread.sleep(1000*5);
    		   fos.write(b);
    		   int b1;
    		   if((b1=fis.read())==-1)
    		   {
    			   break;
    		   }
    		   else
    			   fos.write(b1);
    	   }
    	}
    	
    	catch(FileNotFoundException e)
    	{
    		
    	} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
