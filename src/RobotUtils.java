import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.nxt.Button;
import lejos.nxt.TouchSensor;
import lejos.nxt.SensorPort;

public class RobotUtils {
	TouchSensor touch;
	
	public RobotUtils(){
		TouchSensor touch = new TouchSensor(SensorPort.S1);	
		
	}

	public void moveForward() {
		Motor.A.forward();
		Motor.B.forward();
	}
	
	public void moveBack() {
		Motor.A.backward();
		Motor.B.backward();
		
	}
	
	public void turnLef(int degree) {
		Motor.A.forward();
		
	}
	
	public void turnRight(int degree ) {
		Motor.B.forward();
	}
	
	public void closeClaW() {
		Motor.C.rotate(90);
		
	}
	public void openClaw() {
		Motor.C.rotate(90);
	}
	
	public boolean touchSensorIsPressed() {
	return touch.isPressed();
	}
	
	
}
