package org.usfirst.frc2832.PracticeRobotCode.commands;

import org.usfirst.frc2832.PracticeRobotCode.Robot;
import org.usfirst.frc2832.PracticeRobotCode.subsystems.WheelMotors;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DefaultDrive extends Command {

    public DefaultDrive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.wheels);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Joystick control = Robot.oi.xBoxController;
    	double speed = -control.getRawAxis(1) * 0.7;
    	double turn = control.getRawAxis(4) * 0.7;
    	WheelMotors.robotDriveSystem.arcadeDrive(speed, turn);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
