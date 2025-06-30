import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        List<Gato> gatos = new ArrayList<>();
        List<Cachorro> dogs = new ArrayList<>();
        gatos.add(new Gato("Clebinho", "Himalaia", true));
        gatos.add(new Gato("Joaozinho", "Himalaia", false));
        dogs.add(new Cachorro("Bob", "Himalaia", "Pastor"));
        dogs.add(new Cachorro("Cachinho", "Canis Radius", "Poodle"));
        for (Cachorro cachorro : dogs) {
            System.out.println(cachorro);
        }
        for (Gato gato : gatos) {
            System.out.println(gato);
        }

        System.out.println((gatos.get(0).equals(dogs.get(0))? "Sim" : "Não"));
    }
}
