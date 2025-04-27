import java.util.Random; // para gerar numeros aleatorios

public class Questao { // Classe Questao
    private String enunciado; // atributo privado para so a classe acessar que tem a questao
    private int gabarito; // atributo privado para so a classe acessar que tem o gabarito

    public Questao() { // construtor da classe publico para poder ser acessado por qualquer um chamado automaticamente quando objeto é criado
        Random rand = new Random(); // cria um objeto da classe Random
        int a = rand.nextInt(10); // gera um numero aleatorio
        int b = rand.nextInt(10); // same thing
        this.enunciado = "Quanto é " + a + " * " + b + "?"; // atribui o texto do enunciado
        this.gabarito = a * b; // atribui o valor da resposta
    }

    public String consultarEnunciado() { // metodo publico para poder ser acessado por qualquer um para mostrar enunciado
        return enunciado;
    }

    public boolean corrigir(int respostaAluno) { // metodo publico para poder ser acessado por qualquer um que verifica resposta
        return respostaAluno == gabarito;
    }
}
