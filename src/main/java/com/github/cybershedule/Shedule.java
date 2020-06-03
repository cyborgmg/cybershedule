package com.github.cybershedule;

import java.util.Date;

public class Shedule extends SheduleBase {
	
	
	
	private Shedulable shedulable;
	private Integer timeInTime;
	
	public Shedule(Shedulable shedulable, Integer timeInTime) {
		super();
		this.shedulable = shedulable;
		this.timeInTime = timeInTime;
	}

	public void start(String threadname) {
		
		super.start_(threadname);
			
	}

	@Override
	public void execute() {
		
		System.out.println((new Date()).toString()+" getCount()="+getCount()+" timeInTime="+timeInTime+" (getCount()%timeInTime==0)="+(getCount()%timeInTime==0));
		
		if(getCount()%timeInTime==0) {
			
			System.out.println("zeraCount()");
			zeraCount();
			
			new Thread() {
				public void run() {
					shedulable.execute();
				}
			}.start();	
			
		}
		
	}

	
}