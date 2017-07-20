package org.usfirst.frc.team2169.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public class ActuatorMap {

	public static final int driveLeft1Port = 1;
	public static final int driveLeft2Port = 2;
	public static final int driveRight1Port = 3;
	public static final int driveRight2Port = 4;
	public static final int flywheel1Port = 5;
	public static final int flywheel2Port = 6;
	
	
	//Solenoid Ports
	public static final int driveShiftForwardPort = 1;
	public static final int driveShiftReversePort = 2;
	
	
	//Analog Inputs
	public static final int flywheelEncoderInputPort = 1;
	public static final int flywheelEncoderOutputPort = 2;
	
	//Solenoid States
	public static DoubleSolenoid.Value highGear = DoubleSolenoid.Value.kForward;
	public static DoubleSolenoid.Value lowGear = DoubleSolenoid.Value.kForward;
}

