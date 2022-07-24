package com.example.raju.schedule;

import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
@Component
public class ReportGenerator {
	private SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
	public static int count=0;
@Scheduled(fixedDelay = 2000) 
  private void ReportGenerator() throws InterruptedException {
	System.out.println("Hi Count Started"+(++count));
	
	Thread.sleep(3000);
	
	System.out.println("Count End "+count+"--"+sdf.format(new Date()));
	 System.out.println("Hi Raju "+ new Date());
}
}
