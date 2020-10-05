package ru.against.treadmill;

import ru.against.treadmill.athlete.Athlete;
import ru.against.treadmill.obstacle.Obstacle;

public class WallUse {


    public boolean jumpToWall(Athlete athlete, Obstacle obstacle){
        double actualAthlete = athlete.getMaxHeight();
        double actualObstacle = obstacle.getSizeObstacles();
        if (actualAthlete>=actualObstacle){
            return true;
        }else {
            return false;
        }
    }
}
