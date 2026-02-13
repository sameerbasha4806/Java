package com.interfaces;

public class SmartTvMain {

	public static void main(String[] args) {
	 SmartTv tv;
	 tv=new DishTv();
	 tv.ChangeChannel(34);
	 tv.volumeIncrease(37);
	 tv.volumeDecrease(34);
	 tv.powerOff();
	 tv.powerOn();

	}

}
