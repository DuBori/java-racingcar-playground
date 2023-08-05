import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cars {
    private List<Car> carList;

    public Cars(List<Car> carList) {
        this.carList = carList;
    }

    public List<Car> inputCar(String string) {
        String[] cars = string.split(",");
        List<Car> list = new ArrayList<>();
        for (String car : cars) {
            list.add(new Car(car));
        }
        return list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cars)) return false;
        Cars cars = (Cars) o;
        return carList.equals(cars.carList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carList);
    }
}
