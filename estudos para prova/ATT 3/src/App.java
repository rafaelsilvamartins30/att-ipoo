import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Aluno[] alunos = new Aluno [3];
        String nomeaux, matriculaaux;
        Double nota1aux, nota2aux; 
        int contador = 0;

        for(int i = 0; i < 3; i++){
            System.out.println("Digite o nome do aluno: ");
            nomeaux = entrada.next();
            System.out.println("Digite a matrícula do aluno: ");
            matriculaaux = entrada.next();
            System.out.println("Digite a nota 1: ");
            nota1aux = entrada.nextDouble();
            System.out.println("Digite a nota 2: ");
            nota2aux = entrada.nextDouble();
            alunos[i] = new Aluno(nomeaux, matriculaaux);
            alunos[i].setNota1(nota1aux);
            alunos[i].setNota2(nota2aux);
            if (alunos[i].aprovar()) {
                contador++;
            }
        }

        System.out.println("------Resultado------");

        for(int i = 0; i < 3; i++){
            System.out.println();
            alunos[i].exibir();
            System.out.println();
        }
        System.out.println();
        System.out.println("Total de alunos aprovados: " + contador);
        System.out.println("Total de alunos reprovados: " + (3 - contador));
        
    }
}