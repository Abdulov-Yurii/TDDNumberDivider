import java.util.ArrayList;
import java.util.List;

/**
 * Created by employee on 11/4/16.
 */
public class NumberDivider {
    private static List<String> variants = new ArrayList<>();


    public static List<String> divide(int value) {
        if (value < 0){
            throw new RuntimeException("expected negative value " + value);
        }else if (value == 0 || value == 1){
            variants.add(value + "");
            return variants;
        }else {
            getSimplyNumbers(value);
            return variants;
        }
    }

    private static void getSimplyNumbers(int value) {
        for (int i = 2; i < value; i++) {
            if (value % i == 0){
                variants.add("[" + i + ", " + (value/i) + "]");
            }
        }
    }
}
