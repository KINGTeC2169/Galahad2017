package org.usfirst.frc.team2169.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class ControlMap {
	
	Joystick primary1;
	Joystick primary2;
	Joystick secondary;
	
	int brakeBoth = 1;
	int shiftUp = 4;
	int shiftDown = 5;
	
	public ControlMap(){
		
		primary1 = new Joystick(0);
		primary2 = new Joystick(1);
		//secondary = new Joystick(2);
	
	}
	
	public double leftThrottle(){
		SmartDashboard.putDouble("Left Drive", primary1.getRawAxis(1));
		return primary1.getRawAxis(1);
	}
	
	public double rightThrottle(){
		
		SmartDashboard.putDouble("Right Drive", primary2.getRawAxis(1));
		return primary2.getRawAxis(1);
		
	}
	
	public double flywheelSpeed(){
		
		SmartDashboard.putDouble("Flywheel Power", primary1.getRawAxis(2));
		return primary1.getRawAxis(2);
	}
	
	public boolean flywheelRun(){
		
		
		
		if(primary1.getRawButton(1) || primary2.getRawButton(1)){
			SmartDashboard.putBoolean("Running Flywheel", true);
			return true;
		}
		else{
			SmartDashboard.putBoolean("Running Flywheel", false);
			return false;
		}
	}
	

	public boolean shiftUp(){
		if(primary1.getRawButton(shiftUp) || primary2.getRawButton(shiftUp)){
			SmartDashboard.putString("Gear", "High Gear");
			return true;
		}
		else{
			return false;
		}
		
	}
	
	public boolean shiftDown(){
		if(primary1.getRawButton(shiftDown) || primary2.getRawButton(shiftDown)){
			SmartDashboard.putString("Gear", "Low Gear");
			return true;
		}
		else{
			return false;
		}
		
	}
	
	public boolean intakeIn(){
		if(primary1.getRawButton(3) || primary2.getRawButton(3)){
			SmartDashboard.putString("Intake In", "Running");
			return true;
		}
		else{
			SmartDashboard.putString("Intake In", "Idle");
			return false;
		}
		
	}
	
	public boolean intakeOut(){
		if(primary1.getRawButton(2) || primary2.getRawButton(2)){
			SmartDashboard.putString("Intake Out", "Running");
			return true;
		}
		else{
			SmartDashboard.putString("Intake Out", "Idle");
			return false;
		}
	}

	public double intakeSpeed() {
		SmartDashboard.putDouble("Intake Speed", primary1.getRawAxis(2));
		return primary2.getRawAxis(2);
	}

}
