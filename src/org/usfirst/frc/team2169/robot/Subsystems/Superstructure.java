package org.usfirst.frc.team2169.robot.Subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.SPI;

import com.kauailabs.navx.frc.AHRS;

public class Superstructure {

	public static AHRS ahrs;
	Compressor compressor;
	
	public Superstructure(){
		compressor = new Compressor(11);
		compressor.enabled();
		ahrs = new AHRS(SPI.Port.kMXP, (byte)200);
        ahrs.enableLogging(true);
        
	}

	
	
	
	//When a task that requires coordination of multiple subsystems is required, this area will be used.
	//todo figure out of constructor dual-calling will be a problem.  Perhaps convert to init loops if needed.
	
}
