package org.usfirst.frc.team2169.robot;

import edu.wpi.first.wpilibj.Joystick;

public class ControlMap {
	
	Joystick primary1;
	Joystick primary2;
	
	int runFlywheel = 1;
	int intakeIn = 2;
	int intakeOut = 3;
	
	public ControlMap(){
		
		primary1 = new Joystick(0);
		primary2 = new Joystick(1);
	
	}
	
	public double leftThrottle(){
		return primary1.getRawAxis(1);
	}
	
	public double rightThrottle(){
		return primary2.getRawAxis(1);
	}
	
	public double centerThottle(){
		return primary1.getRawAxis(2);
	}
	
	public boolean runFlywheel(){
		if(primary1.getRawButton(runFlywheel) || primary2.getRawButton(runFlywheel)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean intakeIn(){
		if(primary1.getRawButton(intakeIn) || primary2.getRawButton(intakeIn)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean intakeOut(){
		if(primary1.getRawButton(intakeOut) || primary2.getRawButton(intakeOut)){
			return true;
		}
		else{
			return false;
		}
	}

}
