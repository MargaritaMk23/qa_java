package familycat;
import java.util.List;


public class Lion {

    private Feline feline; // Зависимость(инъекция)
    private boolean hasMane; // имеет ли гриву

    public Lion(String gender, Feline feline) throws Exception { // Передаём пол и зависимость
        this.feline = feline;

        if (gender.equals("Самец")) {
            hasMane = true;
        } else if (gender.equals("Самка")) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола");
        }
    }

    public int getKittens() { // Обращаемся к Feline
        return feline.getKittens();
    }

    public List<String> getFood() throws Exception { // Обращаемся к Feline
        return feline.eatMeat();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }
}

