import java.util.List;
import java.util.Objects;

public class Cars {
    private List<Car> carList;

    public Cars(List<Car> inputCar) {
        this.carList = inputCar;
    }

    public List<Car> getCarList() {
        return carList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars = (Cars) o;
        return Objects.equals(carList, cars.carList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carList);
    }
}
