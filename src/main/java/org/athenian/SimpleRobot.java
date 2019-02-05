package org.athenian;

import robocode.HitByBulletEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;

import java.awt.*;

public class SimpleRobot
    extends Robot {

  /**
   * MyFirstRobot's run method - Seesaw
   */
  public void run() {

    setColors(Color.red, Color.blue, Color.green); // body,gun,radar


    while (true) {
      ahead(100);
      turnGunRight(360);
      back(100);
      turnGunRight(360); // Spin gun around
    }
  }

  /**
   * Fire when we see a robot
   */
  public void onScannedRobot(ScannedRobotEvent e) {
    fire(1);
  }

  /**
   * We were hit!  Turn perpendicular to the bullet,
   * so our seesaw might avoid a future shot.
   */
  public void onHitByBullet(HitByBulletEvent e) {
    turnLeft(90 - e.getBearing());
  }
}

