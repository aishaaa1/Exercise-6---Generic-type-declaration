import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class CarTransportTest {
    CarTransport car;
    CarTransport test;
    @BeforeEach
    void setUp() {
        car = new CarTransport();
        test = new CarTransport();
    }

    @Test
    void lowerFlake() {
        car.currentSpeed = 0;
        car.lowerFlake();
    }

    @Test
    void raiseFlake() {
    }

    @Test
    void loadTruck() {
        //car.loadTruck(test);
    }

    @Test
    void unloadTruck() {
    }

    @Test
    void isClose() {
    }

    @Test
    void hasFlake() {
    }
}