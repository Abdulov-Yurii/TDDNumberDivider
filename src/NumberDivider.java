/**
 * Created by employee on 11/4/16.
 */
public class NumberDivider {


    public static int divide(int value) {
        if (value < 0){
            throw new RuntimeException("expected negative value " + value);
        }else if (value == 0 || value == 1){
            return value;
        }


        return 0;
    }
}
