package familycat;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.List;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


public class LionTest {

    @Mock
    Feline feline; // Создаём мок - фейк-объект

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    } // Инициализация мока перед каждым тестом

    @Test
    public void getKittens_ReturnsValue() throws Exception {
        when(feline.getKittens()).thenReturn(3);

        Lion lion = new Lion("Самец", feline); // Передали мок внутрь Lion

        assertEquals(3, lion.getKittens());
    }

    @Test
    public void getFood_ReturnsFood() throws Exception {
        List<String> food = List.of("Животные");
        when(feline.eatMeat()).thenReturn(food);

        Lion lion = new Lion("Самец", feline);

        assertEquals(food, lion.getFood());
    }

    @Test
    public void maleLion_HasMane() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void femaleLion_NoMane() throws Exception {
        Lion lion = new Lion("Самка", feline);
        assertFalse(lion.doesHaveMane());
    }

    @Test(expected = Exception.class) // Если передать не "Самец" и не "Самка"
    public void invalidGender_ThrowsException() throws Exception {
        new Lion("Ошибка", feline);
    }
}