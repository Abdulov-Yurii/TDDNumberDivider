/**
 * Created by employee on 11/4/16.
 */
public class NumberDivider {


    public static void divide(int value) {
        if (value < 0){
            throw new RuntimeException("expected negative value " + value);
        }
    }
}
