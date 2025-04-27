import java.util.Scanner; // para ler entradas

public class Prova { // classe prova
    private Questao questao; // atributo privado para so a classe acessar que apresenta uma questao da classe Questao 

    public Prova() { // construtor publico para poder ser acessado por qualquer um, quando criado um objeto da classe prova uma questao é gerada 
        questao = new Questao();
    }

    public void aplicar() { // metodo publico para poder ser acessado por qualquer um que aplica a prova
        Scanner entrada = new Scanner(System.in); // cria um objeto da classe Scanner

        System.out.println(questao.consultarEnunciado()); // mostra a pergunta 
        System.out.print("Sua resposta: "); // pede a resposta
        int resposta = entrada.nextInt(); // recebe a resposta

        if (questao.corrigir(resposta)) { //condicional para correção
            System.out.println("Você tentou 1 vez e acertou a questão."); // se acertar de primeira
        } else {
            System.out.println("Você ganhou mais uma chance! Digite outra resposta para a questão."); // se errar a primeira tenta denovo

            System.out.print("Sua nova resposta: "); // pede a nova resposta
            resposta = entrada.nextInt(); // recebe a nova resposta

            if (questao.corrigir(resposta)) { // condicional se acertar ou errar a segunda vez
                System.out.println("Você tentou 2 vezes e acertou a questão.");
            } else {
                System.out.println("Você tentou 2 vezes e errou a questão.");
            }
        }
        
    }
}
