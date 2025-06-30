import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args)  {
        List<ItemBiblioteca> itens = new ArrayList<>();
        itens.add(new Livro("O Senhor dos Anéis", 1954, true, "George Orwell", 1216));
        itens.add(new Livro("1984", 1949, false, "George Orwell", 1216));
        itens.add(new Revista("Veja", 0, false, 0));

        if (itens.get(0).equals(itens.get(1))) {
            System.out.println("Os itens são iguais.");
        } else {
            System.out.println("Os itens são diferentes.");
        }

        for (ItemBiblioteca item : itens) {
            System.out.println(item);
            System.out.println("-------------------");
        }
    }

}
