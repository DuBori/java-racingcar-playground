import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarUtills {

    public static final int MAX_LENGTH = 5;
    public static final Random RANDOM = new Random();

    public static boolean validate(String name) {
        if (name.length() > MAX_LENGTH) {
           throw new NumberFormatException();
        }
        return true;
    }

    public static List<Car> inputCar(String string) {
        String[] cars = string.split(",");
        List<Car> list = new ArrayList<>();
        for (String car : cars) {
            list.add(new Car(car));
        }
        return list;
    }

    public static int RandomNumber() {
        return RANDOM.nextInt(9)+1;
    }
}
