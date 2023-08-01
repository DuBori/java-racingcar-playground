import java.util.List;

public class Calculator {
    public static int add(String numberOne, String numberTwo) {
        return Integer.parseInt(numberOne) + Integer.parseInt(numberTwo);
    }

    public static int stackadd(List<String> strings) {
        int result = 0;

        for (String s : strings) {
            result+=Integer.parseInt(s);
        }

        return result;
    }
}
