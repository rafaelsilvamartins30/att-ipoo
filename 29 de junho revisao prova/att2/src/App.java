import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<Produto> produtos = new HashSet<>();
        produtos.add(new Produto("Arroz", 20.0, "1234567890123"));
        produtos.add(new Produto("Feijão", 10.0, "1234567890124"));
        produtos.add(new Produto("Macarrão", 5.0, "1234567890125"));
        produtos.add(new Produto("Camarao", 50.0, "1234567890123")); // Produto duplicado
    
        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        System.out.println( "tem quantos produtos cadastados: "+produtos.size());
    }

}
