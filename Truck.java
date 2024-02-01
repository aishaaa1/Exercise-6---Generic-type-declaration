import java.awt.*;

public abstract class Truck extends Vehicle implements MoveFlake {
    protected Flake flake;
    public Truck(int nrDoors, Color color, double enginePower, String modelName) {
        super(nrDoors, color, enginePower, modelName);
    }
    public Flake getFlake() {return flake;}
    @Override
    public abstract void raiseFlake();
    @Override
    public abstract void lowerFlake();



}
