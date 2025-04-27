import java.util.Scanner;
public class investimento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // declaracao de scanner para leitura
        int meses = 0; // declaracao de variavel
        double valorPedro, valorJoao;
        System.out.print("Qual valor investido por Joao? "); // leitura dos valores
        valorJoao = entrada.nextDouble();
        System.out.print("Qual valor investido por Pedro? ");
        valorPedro = entrada.nextDouble();
        while (valorJoao <= valorPedro) { // estrutura de repeticao
            valorJoao = valorJoao + (valorJoao * 0.025);
            valorPedro = valorPedro + (valorPedro * 0.005);
            meses++;
        }
        System.out.print("Quantidade de meses: " + meses); //impressao na tela
        entrada.close(); // fechamento do scanner
    }
}
