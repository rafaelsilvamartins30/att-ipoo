import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro("Rex", "Au Au", 4, "Pitbull"));
        animais.add(new Papagaio("Loro", "Olá", "Verde"));

        for (Animal animal : animais) {
            System.out.println(animal); // Chama o toString certo
            animal.falar();             // Chama o método falar
            System.out.println();
        }
    }
}
