import java.util.Objects;

public class Car {
    public static final int MAX_LENGTH = 5;
    private String name;
    private StringBuffer stack = new StringBuffer();

    public Car(String name) {
        validate(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void go(int number) {
        validateNumber(number);
        if (number > 3) {
            stack.append("-");
            System.out.println(name + " : "+stack);
        }
    }

    private void validateNumber(int number) {
        if (number < 0 || number > 9) {
            throw new NumberFormatException("0 - 9 사이의 값을 넣어주세요.");
        }
    }

    public StringBuffer getStack() {
        return stack;
    }

    public String print() {
        return name + ":" + getStack();
    }

    public static boolean validate(String name) {
        if (name.length() > MAX_LENGTH) {
            throw new NumberFormatException();
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(getName(), car.getName()) && getStack().toString().equals(car.getStack().toString());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getStack().toString());
    }


}
