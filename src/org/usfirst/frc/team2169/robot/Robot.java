package org.usfirst.frc.team2169.robot;

import org.usfirst.frc.team2169.robot.Subsystems.DriveTrain;
import org.usfirst.frc.team2169.robot.Subsystems.Intake;
import org.usfirst.frc.team2169.robot.Subsystems.Shooter;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	
	DriveTrain drive;
	ControlMap controls;
	Shooter flywheel;
	Intake intake;
	
	@Override
	public void robotInit() {
		try{
			
			drive = new DriveTrain();
			controls = new ControlMap();
			flywheel = new Shooter();
			intake = new Intake();
			
		}
		catch(Exception e){
			DriverStation.reportError(e.toString(), true);
		}
	
	}

	@Override
	public void autonomousInit() {
		
	}

	@Override
	public void autonomousPeriodic() {
	
	}

	@Override
	public void teleopPeriodic() {
	
		try{
			
			drive.drive(controls.leftThrottle(), controls.rightThrottle());
			intake.intakeButton(controls.intakeIn(), controls.intakeOut());
			//drive.shift(controls.shiftUp(), controls.shiftDown());
			flywheel.runFlywheel(controls.centerThottle(), controls.runFlywheel());
		
		}
		catch(Exception e){
			DriverStation.reportError(e.toString(), true);
		}
		
		
		
	}

	@Override
	public void testPeriodic() {
	}
}

