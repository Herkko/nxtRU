
import lejos.robotics.subsumption.Behavior;

public class RobotBehavior_escape implements Behavior {
	private boolean suppressed;
	private RobotUtils utility;

	public RobotBehavior_escape() {
		suppressed = false;
		utility = new RobotUtils();
	}

	public boolean takeControl() {
		return utility.escapeDown();
	}

	public void suppress() {
		suppressed = true;
	}

	public void action() {
		System.exit(0);
	}

}
