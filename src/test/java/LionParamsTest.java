import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class LionParamsTest {
    private final String lionSex;
    private final boolean expected;

    public LionParamsTest(String lionSex, boolean expected) {
        this.lionSex = lionSex;
        this.expected = expected;

    }
    @Parameterized.Parameters
    public static Object[][] getLionSexData() {
        return new Object[][] {
                { "Самец", true},
                { "Самка", false},
        };
    }

    @Test
    public void checkLionSex() throws Exception {
        Lion lion = new Lion(lionSex);
            boolean actual = lion.hasMane;
            assertEquals(expected, actual);

        }

    }

