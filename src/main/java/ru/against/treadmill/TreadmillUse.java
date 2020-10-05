package ru.against.treadmill;

import ru.against.treadmill.athlete.Athlete;
import ru.against.treadmill.obstacle.Obstacle;

public class TreadmillUse {


    public boolean runOnTreadmill(Athlete athlete, Obstacle obstacle){
        double actualAthlete = athlete.getMaxDistance();
        double actualObstacle = obstacle.getSizeObstacles();
        if(actualAthlete>=actualObstacle){
            return true;
        }else{
            return false;
        }
    }
}


