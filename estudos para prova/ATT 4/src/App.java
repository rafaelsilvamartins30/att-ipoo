import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        Livro l1 = new Livro("Dom Casmurro", "Machado de Assis");
        Livro l2 = new Livro("A Revolução dos Bichos", "George Orwell");

        // Para l1
        System.out.println("Deseja emprestar o livro 1? (s/n)");
        char resposta = entrada.next().charAt(0);
        if (resposta == 's' || resposta == 'S') {
            l1.emprestar();
        }

        // Para l2
        System.out.println("Deseja emprestar o livro 2? (s/n)");
        resposta = entrada.next().charAt(0);
        if (resposta == 's' || resposta == 'S') {
            l2.emprestar();
        }

        // Exibir estado final
        System.out.println("\n== Resultado ==");
        l1.exibir();
        l2.exibir();

        entrada.close();
    }
}
