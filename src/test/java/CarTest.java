import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void 자동차이름부여테스트_5보다작을때(){
        assertTrue(new Car("빵빵이").getName().length() < 5);
    }

    @Test
    void 자동차이름부여테스트_5보다클때(){
        assertFalse(new Car("빵빵이빵빵빵").getName().length() < 5);
    }

    @Test
    void 자동차이름_5자초과했을때기능(){
        assertThrows(NumberFormatException.class,() -> {
            CarUtills.validate(new Car("빵빵이빵빵빵").getName());
        });
    }

    
}