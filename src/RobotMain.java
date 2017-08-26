import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class RobotMain {

	public static void main(String[] args) {

		//RobotUtils utils = new RobotUtils();
		
		Behavior b1 = new DrivetestBehaviour();
		//Behavior b2 = new RobotBehavior_Kauhatesti();
		Behavior b3 = new RobotBehavior_HittedWall();
		Behavior b4 = new RobotBehavior_escape();
		Behavior[] bArray = {b1, b3, b4 };
		Arbitrator arby = new Arbitrator(bArray);
		arby.start();

	}

}
