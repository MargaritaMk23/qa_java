package familycat;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;


public class CatTest {

    @Test
    public void getSound_ReturnsMeow() {
        Cat cat = new Cat();
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFood_ReturnsExactList() throws Exception {
        Cat cat = new Cat();

        List<String> expected = List.of("Животные", "Птицы", "Рыба");

        assertEquals(expected, cat.getFood());
    }
}
