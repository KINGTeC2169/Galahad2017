package org.usfirst.frc.team2169.robot.Subsystems;

import org.usfirst.frc.team2169.robot.ActuatorMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public class DriveTrain extends Subsystem {

	CANTalon left1;
	CANTalon left2;
	CANTalon right1;
	CANTalon right2;
	DoubleSolenoid shifter;
	
	public DriveTrain() {
		
		left1 = new CANTalon(ActuatorMap.driveLeft1Port);
		left2 = new CANTalon(ActuatorMap.driveLeft2Port);
		right1 = new CANTalon(ActuatorMap.driveRight1Port);
		right2 = new CANTalon(ActuatorMap.driveRight2Port);
	
	}
	
	public void drive(double left, double right){
		
		left1.set(left);
		left2.set(left);
		right1.set(right);
		right2.set(right);
		
	}
	
	public void shift(boolean up, boolean down){
		
		if(up && shifter.get() == ActuatorMap.lowGear){
			shifter.set(ActuatorMap.highGear);
		}
		
		else if(down && shifter.get() == ActuatorMap.highGear){
			shifter.set(ActuatorMap.lowGear);
		}
		
	}
	
	
	@Override
	public void pushToDashboard() {
		
	}

	@Override
	public void zeroSensors() {

	}

	@Override
	public void stop() {

		left1.set(0);
		left2.set(0);
		right1.set(0);
		right2.set(0);
		
	}

}
