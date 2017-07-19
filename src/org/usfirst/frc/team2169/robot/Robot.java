package org.usfirst.frc.team2169.robot;

import org.usfirst.frc.team2169.robot.Subsystems.DriveTrain;

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
	
	@Override
	public void robotInit() {
		
		drive = new DriveTrain();
		controls = new ControlMap();
		
	}

	@Override
	public void autonomousInit() {
		
	}

	@Override
	public void autonomousPeriodic() {
	
	}

	@Override
	public void teleopPeriodic() {
	
		drive.drive(controls.leftThrottle(), controls.rightThrottle());
		drive.shift(controls.shiftUp(), controls.shiftDown());
		
	}

	@Override
	public void testPeriodic() {
	}
}

