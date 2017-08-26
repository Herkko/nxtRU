import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.nxt.Button;
import lejos.nxt.TouchSensor;
import lejos.nxt.SensorPort;
import lejos.nxt.LightSensor;
import lejos.nxt.UltrasonicSensor;

public class RobotUtils {
	TouchSensor touch = new TouchSensor(SensorPort.S1);	
	LightSensor light = new LightSensor(SensorPort.S2);
	UltrasonicSensor sonic = new UltrasonicSensor(SensorPort.S3);
	
	public RobotUtils(){
			
	}

	public void moveForward() {
		Motor.A.forward();
		Motor.B.forward();
	}
	
	public void moveForwardCentimeters(int centimeters) {
		Motor.A.rotate(centimeters);
		Motor.B.rotate(centimeters);
	}
	
	public void moveBack() {
		Motor.A.backward();
		Motor.B.backward();	
	}
	
	public void moveBackCentimeters(int centimeters) {
		Motor.A.rotate(centimeters);
		Motor.B.rotate(centimeters);
	}
	
	public void stopMotors() {
		Motor.A.stop();
		Motor.B.stop();
	}
	
	public void turnLef(int degree) {
		Motor.A.rotate(degree);
		
	}
	
	public void turnRight(int degree ) {
		Motor.B.rotate(degree);
	}
	
	public void closeClaw() {
		Motor.C.rotate(140);
		
	}
	public void openClaw() {
		Motor.C.rotate(-140);
	}
	
	public boolean touchSensorPressed() {
		return touch.isPressed();
	}
	 public boolean escapeDown() {
		 return Button.ESCAPE.isDown();
	 }
	
	
}
