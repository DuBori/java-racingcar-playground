import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Play {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    public Play() {
        Cars cars = new Cars(inputCar());
        cars.getCarsName();
        int tryCount = inputTryNumber();
        logic(cars, tryCount);
    }

    private void logic(Cars cars, int tryCount) {
        for (int i = 0; i < tryCount; i++) {
            cars.getCarList()
                    .forEach(it -> it.go(random.nextInt(9)+1));
            if(isFinsh(cars)){
                System.out.println(checkWiner(cars)+"가 최종 우승했습니다.");
                break;
            }
        }
    }

    private static String checkWiner(Cars cars) {
        return cars.getCarList()
                .stream()
                .filter(it -> it.getStack().length() == 5)
                .map(it->it.getName()+",").collect(Collectors.joining());
    }

    private static boolean isFinsh(Cars cars) {
        return cars.getCarList()
                .stream()
                .anyMatch(it -> it.getStack().length() == 5);
    }

    private int inputTryNumber() {
        System.out.println("시도할 회수는 몇회인가요?");
        return scanner.nextInt();
    }

    public String inputCar() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return scanner.next();
    }
}
