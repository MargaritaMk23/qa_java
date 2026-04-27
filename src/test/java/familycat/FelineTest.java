package familycat;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;


public class FelineTest {

    @Test
    public void eatMeat_ReturnsFood() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.eatMeat();
        assertNotNull(food); // Проверка наличия списка
    }

    @Test
    public void getFamily_ReturnsCorrectValue() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittens_Default() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }
}
