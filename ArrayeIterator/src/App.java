import java.util.ArrayList;
import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        ArrayList<Aluno> A = new ArrayList<>();
        A.add(new Aluno("Ana", 5, 6.8));
        A.add(new Aluno("Cleber", 9, 7.8));
        A.add(new Aluno("Anais", 7, 5.8));
        A.add(new Aluno("Achilles", 4, 4));
        A.add(new Aluno("Rodolfo", 9, 3.8));

        for ( Aluno Alunos : A){
            System.out.println(Alunos.getNome());
        }
        System.out.println("       ");

        Iterator<Aluno> it = A.iterator();
        while (it.hasNext()) {
            Aluno Alunos  = it.next();
            if (Alunos.getNota() < 6.0) {
                it.remove();                
            }
        }

        for ( Aluno Alunos : A){
            System.out.println(Alunos.getNome());
        }

    }
}
