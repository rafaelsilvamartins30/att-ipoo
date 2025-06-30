import java.util.Set;
import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        Set<Funcionario> funcionarios = new HashSet<>();

        funcionarios.add(new Funcionario("Cleber", "1230589400"));
        funcionarios.add(new Funcionario("Junior", "1230589401"));
        funcionarios.add(new Funcionario("Joao", "1230589404"));
        funcionarios.add(new Funcionario("Junior", "1230589400"));
        funcionarios.add(new Funcionario("Cleber", "1230589405"));

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
            System.out.println();
        }

    }
}
