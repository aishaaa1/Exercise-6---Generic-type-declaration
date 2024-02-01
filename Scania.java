import java.awt.*;

public class Scania extends Truck {
    public Scania(int nrDoors, Color color, double enginePower, String modelName) {
        super(nrDoors, color, enginePower, modelName);
        this.flake = new Flake(0);
    }

    @Override
    public void raiseFlake() {
        if (getCurrentSpeed() != 0) {
            throw new IllegalArgumentException("Vehicle is moving");
        }
        flake.increaseAngle();
    }

    @Override
    public void lowerFlake() {
        if (getCurrentSpeed() != 0) {
            throw new IllegalArgumentException("Vehicle is moving");
        }
        flake.decreaseAngle();
    }

    @Override
    public void incrementSpeed(double amount) {

    }

    @Override
    public void decrementSpeed(double amount) {

    }
    @Override
    public void move() {
        if (flake.getAngle() != 0) {
            stopEngine();
        }
        else {
            super.move();
        }
    }
}
