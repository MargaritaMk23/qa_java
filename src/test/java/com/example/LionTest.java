package com.example;

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
    public void getKittensReturnsValue() throws Exception {
        when(feline.getKittens()).thenReturn(1);

        Lion lion = new Lion("Самец", feline); // Передали мок внутрь Lion

        assertEquals(1, lion.getKittens());
    }

    @Test
    public void getFoodReturnsFood() throws Exception {
        List<String> food = List.of("Животные", "Птицы", "Рыба");
        when(feline.eatMeat()).thenReturn(food);

        Lion lion = new Lion("Самец", feline);

        assertEquals(food, lion.getFood());
    }

    @Test
    public void maleLionHasMane() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void femaleLionNoMane() throws Exception {
        Lion lion = new Lion("Самка", feline);
        assertFalse(lion.doesHaveMane());
    }

    @Test(expected = Exception.class) // Если передать не "Самец" и не "Самка"
    public void invalidGenderThrowsException() throws Exception {
        new Lion("Ошибка", feline);
    }
}
