import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.nxt.Button;


public class RobotUtils {
	
	public RobotUtils(){
		
		
	}

	public void showMessage() {
		LCD.drawInt(7337, 0, 0);
		Button.waitForAnyPress();
		
	}
	public void kauhaKiinni() {
		Motor.C.rotate(90);
		
		
		
	}
	public void kauhaAuki() {
		Motor.C.rotate(90);
	}
	
	
}
