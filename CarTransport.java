import java.awt.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class CarTransport extends Truck  {
    private final Deque<Car> transport;
    public CarTransport() {
        super(2, Color.WHITE, 500, "Krone");
        this.transport = new ArrayDeque<>();
        this.flake = new Flake(MODE.UP);
    }
    @Override
    public void incrementSpeed(double amount) {
        
    }
    @Override
    public void decrementSpeed(double amount) {

    }
    @Override
    public void lowerFlake() {
        if (getCurrentSpeed() != 0) {
            throw new IllegalArgumentException("The car is moving");
        }
        getFlake().downFlake();
    }

    @Override
    public void raiseFlake() {
        getFlake().upFlake();
    }

    public void loadTruck(Car car) {
        if(isClose(car) && getFlake().getMode() == MODE.DOWN && this.hasFlake()) {
            transport.push(car);
            car.setPosition(this.position.getX(), this.position.getY());
        }
    }
    public void unloadTruck(){
        if (getFlake().getMode() == MODE.DOWN) {
            transport.pop().setPosition(this.position.getX() + 2, this.position.getY() + 2);
        }
    }
    public boolean isClose(Car car) {
        return Math.abs(this.position.getX() - 2) >= Math.abs(car.position.getX())
                && Math.abs(this.position.getY() - 2) >= Math.abs(car.position.getY());
    }

    boolean hasFlake() {return true;}

}
