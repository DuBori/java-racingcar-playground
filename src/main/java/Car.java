public class Car {
    private String name;
    private StringBuffer stack = new StringBuffer();
    public Car(String name) {
        this.name = name;
    }

    public RacingResult go() {
        if (stack.length() > 4) {
            return new RacingResult(name, "우승");
        }
        if (CarUtills.RandomNumber() > 3) {
            stack.append("-");
        }
        return RacingResult.empty();
    }

    public String getName() {
        return name;
    }

    public StringBuffer getStack() {
        return stack;
    }

    public String print() {
        return name + ":" + getStack();
    }
}
