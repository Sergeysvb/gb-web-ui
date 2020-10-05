package ru.against.treadmill.athlete;

public class Person implements Athlete{

    private String name;
    private double maxRun;
    private double maxJump;

    public Person(String name, double run, double jump){
        this.name =  name;
        this.maxRun = run;
        this.maxJump = jump;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getMaxDistance() {
        return maxRun;
    }

    @Override
    public double getMaxHeight() {
        return maxJump;
    }
}
