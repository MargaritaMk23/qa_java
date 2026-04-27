package familycat;
import java.util.List;


public class Cat {

    public String getSound() {
        return "Мяу";
    }

    public List<String> getFood() throws Exception {
        Feline feline = new Feline();
        return feline.eatMeat();
    }
}
