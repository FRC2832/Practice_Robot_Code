package org.usfirst.frc2832.PracticeRobotCode.subsystems;

import org.usfirst.frc2832.PracticeRobotCode.commands.AllForward;
import org.usfirst.frc2832.PracticeRobotCode.RobotMap;
import org.usfirst.frc2832.PracticeRobotCode.commands.DefaultDrive;

import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class WheelMotors extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public static CANTalon lFrontDrive = RobotMap.lFront;
	public static CANTalon rFrontDrive = RobotMap.rFront;
	public static CANTalon lRearDrive = RobotMap.lRear;
	public static CANTalon rRearDrive = RobotMap.rRear;
	public static RobotDrive robotDriveSystem = RobotMap.driveSystem;
	
	public WheelMotors() {
    	
	}
	
	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DefaultDrive());
    }
}

