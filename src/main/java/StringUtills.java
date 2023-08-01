import java.util.List;

public class StringUtills {

    public static boolean isEmpty(String input) {
        return input == null || input.equals("");
    }

    public static boolean isOneSplitor(List<String> input) {
        return input.contains(",") && !input.contains(":");
    }

    public static boolean isTwoSplitor(String input) {
        return input.contains(",") && input.contains(":");
    }

    public static boolean isSpecificSplitor(String input) {
        return input.contains("//") && input.contains("\n");
    }

    public static String removeNonNumeric(String input) {
        return input.replaceAll("[^0-9]", "");
    }
}
