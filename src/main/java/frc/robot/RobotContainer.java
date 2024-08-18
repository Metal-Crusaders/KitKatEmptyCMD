// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import frc.robot.commands.DriveForSeconds;
import frc.robot.commands.DriveTeleop;
import frc.robot.subsystems.Drivetrain;



public class RobotContainer {

  // Motors
  VictorSP leftFront, rightFront, leftRear, rightRear;

  OI oi;

  // Subsystems
  Drivetrain drivetrain;

  DriveTeleop driveTeleop;
  DriveForSeconds driveForDistance;

  public RobotContainer() {

    leftFront = new VictorSP(RobotMap.LEFT_FRONT_ID);
    leftRear = new VictorSP(RobotMap.LEFT_REAR_ID);
    rightFront = new VictorSP(RobotMap.RIGHT_FRONT_ID);
    rightRear = new VictorSP(RobotMap.RIGHT_REAR_ID);

    drivetrain = new Drivetrain(leftFront, leftRear, rightFront, rightRear);

    oi = new OI();
    
    driveTeleop = new DriveTeleop(drivetrain, oi::getXboxLeftTrigger, oi::getXboxRightTrigger, oi::getXboxLeftX);
    
    driveForDistance = new DriveForSeconds(drivetrain, 1);

    configureBindings();
  }

  private void configureBindings() {

    new JoystickButton(oi.getXbox(), OI.XBOX_A).onTrue(driveForDistance);

  }

  public Command getAutonomousCommand() {
    return null;
  }
  
}
