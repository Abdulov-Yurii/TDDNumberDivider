import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

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

    @Test
    public void whenPutNegativeNumberThrowsException(){
        RuntimeException exception = null;
        try {
            NumberDivider.divide(-10);
        }catch (RuntimeException e){
            exception = e;
        }
        assertThat("expected negative number -10", is(exception.getMessage()));
    }

    @Test
    public void getDividerZeroOrOne(){
        assertThat("[1]", is(NumberDivider.divide(1).toString()));
    }

    @Test
    public void getDividerStandardNumber(){
        assertThat("[2, 3]", equalTo(NumberDivider.divide(6).toString()));
    }

    @Test
    public void putBigNumber(){
        String variants = NumberDivider.divide(50).toString();
        assertThat(variants, containsString("[2, 5, 5]") );
    }
}
