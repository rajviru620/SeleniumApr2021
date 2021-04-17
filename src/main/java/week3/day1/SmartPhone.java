package week3.day1;

public class SmartPhone extends AndroidPhone{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sm = new SmartPhone();
		
		//Calling Smart phone methods
		sm.connectWhatsApp();
		
		//Calling Android phone methods
	
		sm.takevideo();
		
		//Calling Smart phone methods
		
		sm.sendMsg();
		sm.makeCall();
		sm.saveContact();
		
	}
	
	public void connectWhatsApp() {
		System.out.println("WhatApp connected");
	}

}
