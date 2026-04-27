package familycat;
import java.util.List;


public class Feline {

    public List<String> eatMeat() throws Exception { // Может выбросить ошибку
        return List.of("Животные", "Птицы", "Рыба");
    }

    public String getFamily() {
        return "Кошачьи";
    }

    public int getKittens() {
        return 1;
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    } // 1 котёнок по умолчанию
}