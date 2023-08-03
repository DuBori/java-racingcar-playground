public class CarUtills {

    public static final int MAX_LENGTH = 5;

    public static boolean validate(String name) {
        if (name.length() > MAX_LENGTH) {
           throw new NumberFormatException();
        }
        return true;
    }

}
