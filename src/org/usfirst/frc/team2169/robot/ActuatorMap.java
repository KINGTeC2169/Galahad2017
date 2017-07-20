package org.usfirst.frc.team2169.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public class ActuatorMap {

	public static final int driveLeftMasterPort = 4;
	public static final int driveLeftSlavePort = 5;
	public static final int driveRightMasterPort = 6;
	public static final int driveRightSlavePort = 7;
	public static final int flywheelMasterPort = 1;
	public static final int flywheelSlavePort = 2;
	public static final int intakeMasterPort = 9;
	public static final int intakeSlavePort = 10;
	
	
	
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

