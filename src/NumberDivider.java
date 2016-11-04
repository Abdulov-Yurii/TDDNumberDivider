import java.util.ArrayList;
import java.util.List;

/**
 * Created by employee on 11/4/16.
 */
public class NumberDivider {
    private static List<Integer> variants = null;


    public static List<Integer> divide(int number) {
        variants = new ArrayList<>();
        if (number < 0) {
            throw new RuntimeException("expected negative number " + number);
        } else if (number == 0 || number == 1) {
            variants.add(number);
            return variants;
        } else {
            return searchDivides(number);
        }
    }

    private static List<Integer> searchDivides(int number){
        for (int easilyNumber = 2; easilyNumber <= number; ) {
            if (number % easilyNumber == 0) {
                variants.add(easilyNumber);
                number = number / easilyNumber;
            } else
                easilyNumber += 1;
        }
        return variants;
    }
}
