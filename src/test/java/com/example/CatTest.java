package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;


public class CatTest {

    @Test
    public void getSoundReturnsMeow() {
        Cat cat = new Cat(new Feline());
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodReturnsExactList() throws Exception {
        Cat cat = new Cat(new Feline());

        List<String> expected = List.of("Животные", "Птицы", "Рыба");

        assertEquals(expected, cat.getFood());
    }
}