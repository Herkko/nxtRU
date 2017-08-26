import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.nxt.Button;
import lejos.nxt.TouchSensor;
import lejos.nxt.SensorPort;
import lejos.nxt.LightSensor;
import lejos.nxt.UltrasonicSensor;

public class RobotUtils {
	TouchSensor touch;
	LightSensor light;
	UltrasonicSensor sonic;
	
	public RobotUtils(){
		TouchSensor touch = new TouchSensor(SensorPort.S1);	
		LightSensor light = new LightSensor(SensorPort.S2);
		UltrasonicSensor sonic = new UltrasonicSensor(SensorPort.S3);

		
	}
<<<<<<< HEAD
	
=======

>>>>>>> 685a53ee8c2d7ef9a77dc12b214b2d04d9a81838
	public void moveForward() {
		Motor.A.forward();
		Motor.B.forward();
	}
	
	public void moveBack(int distanceA, int distanceB) {
		Motor.A.backward();
		Motor.B.backward();
		
	}
	
	public void turnLef(int degree) {
		Motor.A.forward();
		
	}
	
	public void turnRight(int degree ) {
		Motor.B.forward();
	}
	
	public void closeClaw() {
		Motor.C.rotate(90);
		
	}
	public void openClaw() {
		Motor.C.rotate(90);
	}
	
	public boolean touchSensorPressed() {
	return touch.isPressed();
	}
	 public boolean escapeDown() {
		 return Button.ESCAPE.isDown();
	 }
	
	
}
