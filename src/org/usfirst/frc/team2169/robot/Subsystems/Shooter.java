package org.usfirst.frc.team2169.robot.Subsystems;

import org.usfirst.frc.team2169.robot.ActuatorMap;
import org.usfirst.frc.team2169.robot.Constants;
import org.usfirst.frc.team2169.robot.Subsystems.Subsystem;
import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import org.usfirst.frc.team2169.robot.Util.PIDObject;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Encoder;

public class Shooter extends Subsystem{

	
	CANTalon flywheelMaster;
	CANTalon flywheelSlave;
	double talonSpeed;
	
	public Shooter(){
		
		//Defining Flywheels
		flywheelMaster = new CANTalon(ActuatorMap.flywheel1Port);
		flywheelSlave = new CANTalon(ActuatorMap.flywheel2Port);
		
		//Setting Master/Slave
        flywheelMaster.changeControlMode(CANTalon.TalonControlMode.PercentVbus);
        flywheelSlave.changeControlMode(CANTalon.TalonControlMode.Follower);
		flywheelSlave.set(ActuatorMap.flywheel1Port);
		
		//Setting up encoder
        flywheelMaster.setFeedbackDevice(CANTalon.FeedbackDevice.CtreMagEncoder_Relative);
        
        //PID Values currently based on recommended dual 775 values from team 254.  
        //Remeber to test with the old 550s or upgrade motors.
        flywheelMaster.setPID(Constants.fwP, Constants.fwI, Constants.fwD, Constants.fwF, Constants.fwIZone, Constants.fwRampRate, 0);
        
        //Setting Speed Mode
        flywheelMaster.changeControlMode(CANTalon.TalonControlMode.Speed);
        

	
	}
	
	public void checkForEncoder(){
		
		if(flywheelMaster.isSensorPresent(CANTalon.FeedbackDevice.CtreMagEncoder_Relative) != CANTalon.FeedbackDeviceStatus.FeedbackStatusPresent){
			DriverStation.reportError("No Flywheel Encoder m8!", true);
		}
		
	}
	
	public void setSpeed(double goalRPM){
		
		//Well that was easy ;)
		flywheelMaster.set(goalRPM);
		
	}
	
	
	@Override
	public void pushToDashboard() {
		
	}

	@Override
	public void zeroSensors() {
		
	}

	@Override
	public void stop() {
		
	}

}
