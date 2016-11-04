import java.util.ArrayList;
import java.util.List;

/**
 * Created by employee on 11/4/16.
 */
public class NumberDivider {
    private static List<Integer> variants = null;


    public static List<Integer> divide(int value) {
        variants = new ArrayList<>();
        if (value < 0) {
            throw new RuntimeException("expected negative value " + value);
        } else if (value == 0 || value == 1) {
            variants.add(value);
            return variants;
        } else {
            for (int easilyNumber = 2; easilyNumber <= value; ) {
                if (value % easilyNumber == 0) {
                    variants.add(easilyNumber);
                    value = value / easilyNumber;
                } else
                    easilyNumber += 1;
            }
            return variants;
        }
    }
}
