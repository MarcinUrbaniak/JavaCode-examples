package com.example;

public class Energy {

    private static final double GRAVITY = 9.81;
    private double mass = 0;
    private double speed = 0;

    public Energy(double mass, double speed) {
        this.mass = mass;
        this.speed = speed;
    }

   public double getEnergy(){
        return GRAVITY * mass * speed;
   }

    public static double getGRAVITY() {
        return GRAVITY;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        if (mass > 0){
            this.mass = mass;
        }
        else {
            this.mass = 0;}

    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }
}
