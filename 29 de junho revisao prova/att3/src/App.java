import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        List <Carro> carros = new ArrayList<>();
        List <Moto> motos = new ArrayList<>();

        motos.add(new Moto("Toyota", "150983", true));
        carros.add(new Carro( "Volks", "102931830", 4));
        

        for (Moto moto : motos) {
            System.out.println(moto);
            System.out.println();
        }

        for (Carro carro : carros) {
            System.out.println(carro);
            System.out.println();
        }
    }
}
