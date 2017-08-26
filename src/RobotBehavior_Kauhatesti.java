import lejos.robotics.subsumption.Behavior;

public class RobotBehavior_Kauhatesti implements Behavior {
	private boolean suppressed;
	private RobotUtils utility;

	public RobotBehavior_Kauhatesti() {
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

		utility.openClaw();
		utility.closeClaw();

	}
}
