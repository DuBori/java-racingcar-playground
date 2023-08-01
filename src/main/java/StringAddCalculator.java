import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringAddCalculator {

    public static final String SPLTOR_SIMPYO = ",";
    public static final String SPLTOR_COLRON = ":";

    public static int splitAndSum(String input) {
        if (StringUtills.isEmpty(input)) {
            return 0;
        }
        List<String> strings = new ArrayList<>();
        if (input.contains(SPLTOR_SIMPYO) && !input.contains(":")) {
            strings = new ArrayList<>(Arrays.asList(input.split(SPLTOR_SIMPYO)));
            return Calculator.stackadd(strings);
        }
        if (StringUtills.isOneSplitor(strings)) {
            return Calculator.add(strings.get(0),strings.get(1));
        }

        if (StringUtills.isTwoSplitor(input)) {
            strings = new ArrayList<>(Arrays.asList(input.split("")));
            strings.remove(strings.indexOf(SPLTOR_SIMPYO));
            strings.remove(strings.indexOf(SPLTOR_COLRON));
            return Calculator.stackadd(strings);
        }

        if (StringUtills.isSpecificSplitor(input)) {
            ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(input.split("")));
            String newSplitor = arrayList.get(arrayList.indexOf("\n")-1);

            List<String> strings1 = arrayList.subList(arrayList.indexOf("\n")+1, arrayList.size());
            List<String> collect = strings1.stream().filter(it -> !it.equals(newSplitor))
                    .collect(Collectors.toList());


            return Calculator.stackadd(collect);
        }

        return Integer.parseInt(input);
    }
}
