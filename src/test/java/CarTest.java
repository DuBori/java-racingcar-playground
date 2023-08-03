import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void 자동차이름부여테스트_5보다작을때() {
        assertTrue(new Car("빵빵이").getName().length() < 5);
    }

    @Test
    void 자동차이름부여테스트_5보다클때() {
        assertFalse(new Car("빵빵이빵빵빵").getName().length() < 5);
    }

    @Test
    void 자동차이름_5자초과했을때기능() {
        assertThrows(NumberFormatException.class,() -> {
            CarUtills.validate(new Car("빵빵이빵빵빵").getName());
        });
    }
    @Test
    void 자동차_전진기능_테스트() {
        Car 빵빵이 = new Car("빵빵이");
        빵빵이.go();
        assertTrue("-".equals(빵빵이.getStack().toString()));
    }

    @Test
    @Disabled
    void 자동차_이름_쉼표구분() {
        String string = "빵빵이,빵빵삼,빵빵사";
        List<Car> list = new ArrayList<>();
        list.add(new Car("빵빵이"));
        list.add(new Car("빵빵삼"));
        list.add(new Car("빵빵사"));
    } // 잘 안됐습니다.
    @Test
    @RepeatedTest(100)
    void 랜덤함수_1_9까지() {
        Random random = new Random();
        int i = random.nextInt(9) + 1;
        assertTrue(() -> {
            if(0 < i  && i < 10){
                return true;
            }
            return false;
        });
    }

    @Test
    void 자동차_경주_게임_5글자_쌓이면이긴다(){
        Car 빵빵이 = new Car("빵빵이");
        for (int i = 0; i < 20; i++) {
            RacingResult result = 빵빵이.go();
            if (result.getMsg() != null && result.getMsg().equals("우승")) {
                result.printRacingMsg();
                break;
            }
        }

    }





    
}