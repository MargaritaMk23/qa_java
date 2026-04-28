package com.example;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.List;
import static org.junit.Assert.*;


public class AlexTest {

    @Mock
    Feline feline;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getFriendsShouldReturnCorrectList() throws Exception {
        Alex alex = new Alex(feline);

        List<String> expected = List.of("Марти", "Глория", "Мелман");

        assertEquals(expected, alex.getFriends());
    }

    @Test
    public void getPlaceOfLivingReturnsZoo() throws Exception {
        Alex alex = new Alex(feline);

        String place = alex.getPlaceOfLiving();

        assertEquals("Нью-Йоркский зоопарк", place);
    }

    @Test
    public void getKittensReturnsZero() throws Exception {
        Alex alex = new Alex(feline);

        assertEquals(0, alex.getKittens());
    }

    @Test
    public void isMaleLionHasMane() throws Exception {
        Alex alex = new Alex(feline);

        assertTrue(alex.doesHaveMane());
    }
}
