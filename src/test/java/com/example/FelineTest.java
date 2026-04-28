package com.example;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;


public class FelineTest {

    @Test
    public void eatMeatReturnsFood() throws Exception {
        Feline feline = new Feline();

        List<String> expected = List.of("Животные", "Птицы", "Рыба");

        assertEquals(expected, feline.eatMeat()); // Проверка наличия списка
    }

    @Test
    public void getFamilyReturnsCorrectValue() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensDefault() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }
}