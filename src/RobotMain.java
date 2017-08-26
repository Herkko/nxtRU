import lejos.nxt.Button;

public class RobotMain {

	public static void main(String[] args) {
		Button.waitForAnyPress();
		RobotUtils utils = new RobotUtils();
		
		utils.showMessage();
		
		
		//Tänne vois luoda kokeilumielessä olion tosta Robot Utils
		//luokasta ja kattoa että miten sen saa toimimaan täältä käsin
		//Molemmat luokat pitää kuitenkin kääntää ja linkata ja uploadata.
		
	}

}
