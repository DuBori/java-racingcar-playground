public class Car {
    private String name;
    private StringBuffer stack = new StringBuffer();
    public Car(String name) {
        this.name = name;
    }

    public void go() {
        if (CarUtills.RandomNumber() > 3) {
            stack.append("-");
        }
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
