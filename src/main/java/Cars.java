import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cars {
    private List<Car> carList;

    public Cars(List<Car> carList) {
        this.carList = carList;
    }

    public Cars(String inputValue) {
        this.carList = inputCar(inputValue);
    }

    public static List<Car> inputCar(String string) {
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

    public List<Car> getCarList() {
        return carList;
    }

    public void getCarsName() {
        StringBuffer stringBuffer = new StringBuffer();
        carList.forEach(it -> stringBuffer.append(it.getName() + ","));
        System.out.println("stringBuffer = " + stringBuffer.toString());
    }
}
