import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class FelineParamsTest {

    private final int kittensCount;
    private final int expected;


    public FelineParamsTest(int kittensCount, int expected) {
        this.kittensCount = kittensCount;
        this.expected = expected;
    }
    @Parameterized.Parameters
    public static Object[][] getKittensData() {
        return new Object[][] {
                { 2, 2},
                { 10, 10},
                { 101, 101},
                { 0, 0},
        };
    }

    @Test
    public void checkFelinesKittensCount() {
        Feline feline = new Feline();
        assertEquals(expected, feline.getKittens(kittensCount));
    }

}
