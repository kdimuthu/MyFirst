package RobotClass;

import java.awt.Robot;

public class Utility_Robot 
{	
	//This is a reused library for keyboard key pressings
	public static void useKeys(int PressKey, int ReleaseKey) throws Exception
	{	
		Robot robot=new Robot();	
		robot.keyPress(PressKey);
		robot.keyRelease(ReleaseKey);
	}

}
