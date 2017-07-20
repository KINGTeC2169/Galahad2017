package org.usfirst.frc.team2169.robot;

import edu.wpi.first.wpilibj.Joystick;

public class ControlMap {
	
	Joystick primary1;
	Joystick primary2;
	Joystick secondary;
	
	int brakeBoth = 1;
	int shiftUpBoth = 2;
	int shiftDownBoth = 3;
	
	public ControlMap(){
		
		primary1 = new Joystick(0);
		primary2 = new Joystick(1);
		secondary = new Joystick(2);
	
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
	
	public boolean flywheelRun(){
		if(primary1.getRawButton(brakeBoth) || primary2.getRawButton(brakeBoth)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean intakeIn(){
		if(primary1.getRawButton(shiftUpBoth) || primary2.getRawButton(shiftUpBoth)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean intakeOut(){
		if(primary1.getRawButton(shiftDownBoth) || primary2.getRawButton(shiftDownBoth)){
			return true;
		}
		else{
			return false;
		}
	}

}
