import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by nadja on 13.04.16.
 */
public class MyClassTest {

    private MyClass myClass;

    @Before
    public void setup() {
        myClass = new MyClass();
    }

    @Test
    public void onePlusOne() {
        assertThat(myClass.add(1, 1), is(2));
    }
}
