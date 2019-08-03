package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot nick=new Robot();
	nick.setSpeed(50);
	nick.move(100);
	nick.turn(-90);
nick.move(200);
nick.penDown();
nick.turn(180);
nick.move(500);
nick.turn(180);
nick.move(250);
nick.turn(-90);
nick.move(500);
nick.turn(90);
nick.move(100);
nick.turn(90);
nick.move(10);
nick.hide();


}
}
