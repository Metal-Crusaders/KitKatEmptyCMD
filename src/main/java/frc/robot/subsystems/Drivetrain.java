package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {

    VictorSP leftFront, leftRear, rightFront, rightRear;
    
    public Drivetrain(VictorSP leftFront, VictorSP leftRear, VictorSP rightFront, VictorSP rightRear) {
        this.leftFront = leftFront;
        this.leftRear = leftRear;
        this.rightFront = rightFront;
        this.rightRear = rightRear;
    }

    public void set(double lfSpeed, double lrSpeed, double rfSpeed, double rrSpeed) {
        this.leftFront.set(lfSpeed);
        this.leftRear.set(lrSpeed);
        this.rightFront.set(rfSpeed);
        this.rightRear.set(rrSpeed);
    }

    public void set(double leftSpeed, double rightSpeed) {
        this.set(leftSpeed, leftSpeed, rightSpeed, rightSpeed);
    }

    public void set(double speed) {
        this.set(speed, speed, speed, speed);
    }

    public void stop() {
        this.set(0);
    }

}
