/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotcode.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Rishi
 */
public class Drivetrain extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    Talon t1=new Talon(1);
    Talon t2=new Talon(2);
    Talon t3=new Talon(3);
    Talon t4=new Talon(4);
    public void initDefaultCommand() {       
        }
    public void setTalonForward(){
        t1.set(1);
        t2.set(1);
        t3.set(1);
        t4.set(1);
    }
    public void setTalonReverse(){
        t1.set(-1);
        t2.set(-1);
        t3.set(-1);
        t4.set(-1);
    }
    public void setTalonStop(){
        t1.set(0);
        t2.set(0);
        t3.set(0);
        t4.set(0);
    }
    public void setTalonSpeed(double speed){
        t1.set(speed);
        t2.set(speed);
        t3.set(speed);
        t4.set(speed);
    }
}
