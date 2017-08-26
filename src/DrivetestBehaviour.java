import lejos.robotics.subsumption.Behavior;
import lejos.nxt.Motor;

public class DrivetestBehaviour implements Behavior {

	// private TouchSensor touch;
	// private UltrasonicSensor sonar;
	RobotUtils utils = new RobotUtils();
	
	public DrivetestBehaviour()
    {
       
    }

	private boolean suppressed = false;

	public boolean takeControl() {
		return true;
	}

	public void suppress() {
		suppressed = true;
	}

	public void action() {
		suppressed = false;
		Motor.A.rotate(-180, true);
		Motor.C.rotate(-360, true);

		while (Motor.C.isMoving() && !suppressed)
			Thread.yield();

		Motor.A.stop();
		Motor.C.stop();
	}

}
