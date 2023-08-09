package step07;

public interface tv {
	public void powerOn();
	public void powerOff();
	public void VolumeUP();
	public void VolumeDown();
}
class TV implements tv{
	public void powerOn() {
		
	}
	public void powerOff() {
		
	}
	public void VolumeUP() {
		
	}	
	public void VolumeDown() {
		
	}
	 
}

class Lg extends TV{
	public void powerOn() {
		System.out.println("Lg TV - 전원을 켠다");
	}
	public void powerOff() {
		System.out.println("Lg TV - 전원을 끈다");
	}
	public void VolumeUP() {
		System.out.println("Lg TV - 소리를 높인다");
	}	
	public void VolumeDown() {
		System.out.println("Lg TV - 소리를 줄인다");
	}
}

class Samsung extends TV{
	public void powerOn() {
		System.out.println("Samsung TV - 전원을 켠다");
	}
	public void powerOff() {
		System.out.println("Samsung TV - 전원을 끈다");
	}
	public void VolumeUP() {
		System.out.println("Samsung TV - 소리를 높인다");
	}	
	public void VolumeDown() {
		System.out.println("Samsung TV - 소리를 낮춘다");
	}
}