import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

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

    @Test(expected = RuntimeException.class)
    @Ignore
    public void whenPutNegativeNumberThrowsException(){
        RuntimeException exception = null;
        try {
            NumberDivider.divide(-10);
        }catch (RuntimeException e){
            exception = e;
        }
        assertThat("expected negative value -10", is(exception.getMessage()));
    }

    @Test
    public void getDivider(){
        assertThat(1, equalTo(NumberDivider.divide(1)));
    }
}
