package frc.robot.commands;

import edu.wpi.first.math.filter.SlewRateLimiter;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drivetrain;

import java.util.function.DoubleSupplier;

public class DriveForSeconds extends Command {

    private Drivetrain driveTrain;
    private double seconds;

    private Timer timer;

    public DriveForSeconds(Drivetrain driveTrain, double seconds) {

        this.driveTrain = driveTrain;
        this.seconds = seconds;
        this.timer = new Timer();

        addRequirements(driveTrain);
    }

    @Override
    public void initialize() {
        // WRITE CODE HERE
    }

    @Override
    public void execute() {
        // WRITE CODE HERE
    }

    @Override
    public boolean isFinished() {
        // WRITE CODE HERE (you can delete the code below, it's just there so this function doesn't throw an error)
        return false;
    }

    @Override
    public void end(boolean interrupted) {
        // WRITE CODE HERE
    }


}