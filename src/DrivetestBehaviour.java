import lejos.robotics.subsumption.Behavior;
import lejos.nxt.Motor;

public class DrivetestBehaviour implements Behavior {
	
	RobotUtils utility;
	private boolean suppressed;

	public DrivetestBehaviour() {
		suppressed = false;
		utility = new RobotUtils();
	}

	public boolean takeControl() {
		return true;
	}

	public void suppress() {
		suppressed = true;
	}

	public void action() {
		suppressed = false;
		utility.moveForward();
		while (Motor.B.isMoving() && !suppressed)
			Thread.yield();

		Motor.A.stop();
		Motor.B.stop();
	}

}
