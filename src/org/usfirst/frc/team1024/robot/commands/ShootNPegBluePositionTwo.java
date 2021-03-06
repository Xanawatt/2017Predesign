package org.usfirst.frc.team1024.robot.commands;

import org.usfirst.frc.team1024.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ShootNPegBluePositionTwo extends Command {

    public ShootNPegBluePositionTwo() {
        Robot.drivetrain.driveForwardfullSpeed();
        // after certain distance to position at right distance from boiler
        Robot.drivetrain.stop();
        Robot.drivetrain.turnRight(1.0, 225);
        // shoot
        Robot.drivetrain.drive(-1.0, -1.0);
    	Timer.delay(0.5);
    	Robot.drivetrain.stop();
    	Robot.drivetrain.turnRight(1.0, 90);
    	Robot.drivetrain.drive(1.0, 1.0);
    	//after certain distance to land north peg
    	Robot.drivetrain.stop();
    	Robot.drivetrain.turnRight(1.0, 0);
    	Robot.drivetrain.drive(1.0, 1.0);
    	//after certain distance
    	Robot.drivetrain.stop();
    	Robot.drivetrain.turnLeft(1.0, 60);
    	//put peg on
        
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
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
