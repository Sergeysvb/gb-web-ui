package ru.against.treadmill.obstacle;

public class Treadmill implements Obstacle{
    private double sizeObstacles;

    public Treadmill (double sizeObstacles) {
        this.sizeObstacles = sizeObstacles;
    }

    @Override
    public double getSizeObstacles() {
        return sizeObstacles;
    }
}
