package org.usfirst.frc.team2169.robot.Subsystems;

import org.usfirst.frc.team2169.robot.ActuatorMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DriveTrain extends Subsystem {

	CANTalon leftMaster;
	CANTalon leftSlave;
	CANTalon rightMaster;
	CANTalon rightSlave;
	DoubleSolenoid shifter;
	
	public DriveTrain() {
		
		leftMaster = new CANTalon(ActuatorMap.driveLeftMasterPort);
		leftSlave = new CANTalon(ActuatorMap.driveLeftSlavePort);
		rightMaster = new CANTalon(ActuatorMap.driveRightMasterPort);
		rightSlave = new CANTalon(ActuatorMap.driveRightSlavePort);
		
		leftSlave.changeControlMode(CANTalon.TalonControlMode.Follower);
		leftSlave.set(ActuatorMap.driveLeftMasterPort);
		
		rightSlave.changeControlMode(CANTalon.TalonControlMode.Follower);
		rightSlave.set(ActuatorMap.driveRightMasterPort);
		
		shifter = new DoubleSolenoid(10, ActuatorMap.driveShiftForwardPort, ActuatorMap.driveShiftReversePort);
	
	}
	
	public void drive(double left, double right){
		
		leftMaster.set(left);
		rightMaster.set(-right);
		
	}
	
	public void shift(boolean up, boolean down){
		
		if(up){
			shifter.set(ActuatorMap.highGear);
		}
		
		else if(down){
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

		leftMaster.set(0);
		leftSlave.set(0);
		rightMaster.set(0);
		rightSlave.set(0);
		
	}

}
