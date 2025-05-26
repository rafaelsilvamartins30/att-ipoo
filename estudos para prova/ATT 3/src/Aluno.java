public class Aluno {
    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;
     
    public Aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = 0;
        this.nota2 = 0;
    }

    public void setNota1(double nota1){
        this.nota1 = nota1;
    }

    public void setNota2(double nota2){
        this.nota2 = nota2;
    }

    public double media(){
        
        return (nota1 + nota2) / 2;
    }

    public boolean aprovar(){
        return media() >= 6.0;
    }

    public void exibir(){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Media: " + media());
        System.out.println("Aprovado: " + (aprovar() ? "Sim" : "Não"));
    }
    
}
