import org.junit.Test;

/**
 * Created by employee on 11/4/16.
 */
public class TestingNumberDivider {

    @Test
    public void puttNumber(){
        NumberDivider.divide(6);
    }

    @Test(expected = RuntimeException.class)
    public void putNegativeNumber(){
        NumberDivider.divide(-3);
    }
}
