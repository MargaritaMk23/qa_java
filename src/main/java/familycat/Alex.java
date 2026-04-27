package familycat;
import java.util.List;


public class Alex extends Lion { // Наследуется от Lion

    public Alex(Feline feline) throws Exception {
        super("Самец", feline); // Всегда Самец
    }

    public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override // Переопределение метода
    public int getKittens() {
        return 0;
    }
}
