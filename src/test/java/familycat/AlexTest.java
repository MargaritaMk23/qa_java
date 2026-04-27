package familycat;

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
        public void getFriends_ReturnsCorrectList() throws Exception {
            Alex alex = new Alex(feline);

            List<String> friends = alex.getFriends();

            assertEquals(3, friends.size());
            assertTrue(friends.contains("Марти"));
            assertTrue(friends.contains("Глория"));
            assertTrue(friends.contains("Мелман"));
        }

        @Test
        public void getPlaceOfLiving_ReturnsZoo() throws Exception {
            Alex alex = new Alex(feline);

            String place = alex.getPlaceOfLiving();

            assertEquals("Нью-Йоркский зоопарк", place);
        }

        @Test
        public void getKittens_ReturnsZero() throws Exception {
            Alex alex = new Alex(feline);

            assertEquals(0, alex.getKittens());
        }

        @Test
        public void isMaleLion_HasMane() throws Exception {
            Alex alex = new Alex(feline);

            assertTrue(alex.doesHaveMane());
        }
    }



