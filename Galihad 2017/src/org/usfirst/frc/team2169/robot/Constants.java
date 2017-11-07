package org.usfirst.frc.team2169.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public class Constants {

	//Flywheel PID
	public static final double fwP = 0.12;
	public static final double fwI = 0;
	public static final double fwD = 0.5;
	public static final double fwF = 0.014;
	public static final int fwIZone = (int) (1023.0 / fwP);
	public static final double fwRampRate = 0;
	
}
