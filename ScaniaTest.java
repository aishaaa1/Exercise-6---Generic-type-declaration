import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class ScaniaTest {
    Scania car;

    @BeforeEach
    void setUp() {
        car = new Scania(2, Color.cyan, 234, "Scania");
    }

    @Test
    void raiseFlake() {
        car.currentSpeed = 0;
        car.raiseFlake();
        System.out.print(car.flake.getAngle());
    }

    @Test
    void lowerFlake() {
    }

    @Test
    void move() {
        car.currentSpeed = 10;
        car.flake.setAngle(20);
        car.move();
        assertEquals(0, car.currentSpeed);
        System.out.print(car.flake.getAngle());
    }
}