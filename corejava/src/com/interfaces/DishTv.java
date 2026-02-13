package com.interfaces;

public class DishTv implements SmartTv {
	
	public void powerOn() {
		System.out.println("power on the dishtv");
	}
	public void powerOff() {
		System.out.println("powerof the dishtv");
	}
	public void volumeIncrease(double volume) {
		System.out.println("increasee the volume: "+(SmartTv.defaultvolume+volume));
	}
	public void volumeDecrease(double volume) {
		System.out.println("decrease the volume: "+(SmartTv.defaultvolume-volume));
	}
	public void ChangeChannel(double channelNumber) {
		System.out.println("change the channel number: "+channelNumber);

	}

}
