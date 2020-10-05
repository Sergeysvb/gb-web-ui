package ru.against.treadmill.obstacle;

public class Wall implements Obstacle{
    private double sizeObstacles;

    public Wall (double sizeObstacles) {

        this.sizeObstacles = sizeObstacles;
    }

    @Override
    public double getSizeObstacles() {
        return sizeObstacles;
    }

}
