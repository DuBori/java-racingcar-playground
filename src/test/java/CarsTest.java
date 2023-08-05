import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarsTest {

    @Test
    @Disabled
    void 빵빵이들_넣기() {
        List<Car> testList = new ArrayList<>();
        testList.add(new Car("빵빵이"));
        testList.add(new Car("빵빵삼"));
        testList.add(new Car("빵빵사"));

        Cars cars = new Cars(Collections.emptyList());
        cars.inputCar("빵빵이,빵빵삼,빵빵사");

        assertTrue(cars.equals(testList)); // 과장님께 물어보도록 하자
    }
}