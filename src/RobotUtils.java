import lejos.nxt.LCD;
import lejos.nxt.Button;


public class RobotUtils {
	
	public RobotUtils(){
		
	}

	public void showMessage() {
		LCD.drawInt(7337, 0, 0);
		Button.waitForAnyPress();
		
	}
	
	
}
