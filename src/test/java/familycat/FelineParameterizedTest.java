package familycat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class FelineParameterizedTest {

    private int input;
    private int expected;

    public FelineParameterizedTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][] {
                {1, 1},
                {5, 5},
                {0, 0}
        };
    }

    @Test
    public void getKittens_ReturnsCorrectCount() {
        Feline feline = new Feline();
        assertEquals(expected, feline.getKittens(input));
    }
}
