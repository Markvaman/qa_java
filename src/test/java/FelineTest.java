
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;


import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {


    @Spy
    private Feline feline;
    @Test
    public void checkFelineEatMeat() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба")); //здесь заглушка,
        // чтобы метод гетфуд с параметром хищник
        // всегда возвращал конкретно этот список, даже если в Энимал список изменится
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void testGetFamilyReturnFeline() {
        String expected = "Кошачьи";
        assertEquals(expected, feline.getFamily());
    }

    @Test
    public void testGetKittensReturnOne() {
        int expected = 1;
        assertEquals(expected, feline.getKittens());
    }


}
