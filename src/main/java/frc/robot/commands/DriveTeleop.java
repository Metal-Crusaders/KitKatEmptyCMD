package frc.robot.commands;

import edu.wpi.first.math.filter.SlewRateLimiter;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drivetrain;

import java.util.function.DoubleSupplier;

public class DriveTeleop extends Command {


    private DoubleSupplier leftInput, rightInput, steeringInput;

    private final Drivetrain driveTrain;

    public DriveTeleop(Drivetrain driveTrain, DoubleSupplier leftInput, DoubleSupplier rightInput, DoubleSupplier steeringInput) {

        this.driveTrain = driveTrain;
        this.leftInput = leftInput;
        this.rightInput = rightInput;
        this.steeringInput = steeringInput;

        addRequirements(driveTrain);
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        // WRITE CODE HERE
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end(boolean interrupted) {
        // WRITE CODE HERE
    }


}