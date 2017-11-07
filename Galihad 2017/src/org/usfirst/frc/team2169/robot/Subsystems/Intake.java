package org.usfirst.frc.team2169.robot.Subsystems;

import org.usfirst.frc.team2169.robot.ActuatorMap;

import com.ctre.CANTalon;

public class Intake {
	
	CANTalon intakeMaster;
	CANTalon intakeSlave;
	
	public Intake(){
	
		intakeMaster = new CANTalon(ActuatorMap.intakeMasterPort);
		intakeSlave = new CANTalon(ActuatorMap.intakeSlavePort);
		
		intakeSlave.changeControlMode(CANTalon.TalonControlMode.Follower);
		intakeSlave.set(ActuatorMap.intakeMasterPort);
		
	}
	
	public void intakeStick(double speed){
		
		intakeMaster.set(speed);
		
	}
	
	public void intakeButton(boolean in, boolean out, double speed){
		if(in){
			intakeMaster.set(speed);
		}
		
		else if(out){
			intakeMaster.set(-speed);
		}
		
		else{
			intakeMaster.set(0);
		}
	}

}
