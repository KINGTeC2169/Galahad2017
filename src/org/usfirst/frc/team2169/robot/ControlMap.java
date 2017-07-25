package org.usfirst.frc.team2169.robot;

import org.usfirst.frc.team2169.robot.sticks.BothSticks;

import edu.wpi.first.wpilibj.Joystick;

public class ControlMap {
	
	Joystick primary1;
	Joystick primary2;
	
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
		//If either of the triggers are pressed, return true.
		if(primary1.getRawButton(BothSticks.runFlywheel) || primary2.getRawButton(BothSticks.runFlywheel)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean intakeIn(){
		if(primary1.getRawButton(BothSticks.intakeIn) || primary2.getRawButton(BothSticks.intakeIn)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean intakeOut(){
		if(primary1.getRawButton(BothSticks.intakeOut) || primary2.getRawButton(BothSticks.intakeOut)){
			return true;
		}
		else{
			return false;
		}
	}

}
