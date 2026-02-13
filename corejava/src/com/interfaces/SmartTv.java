package com.interfaces;

public interface SmartTv {
	
	public static final double defaultvolume=100;
	public void powerOn();
	void powerOff();
	void volumeIncrease(double volume);
	void volumeDecrease(double volume);
	void ChangeChannel(double channelNumber);

}
