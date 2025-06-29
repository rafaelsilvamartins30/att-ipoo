import java.util.ArrayList;
import java.util.List;;

public class Empresa {
    private String cnpj;
    private List<FuncionarioComissionado> listaDeFuncionariosComissionado;
    private List<FuncionarioHorista> listaDeFuncionariosHorista;

    public Empresa(String cnpj) {
        listaDeFuncionariosComissionado = new ArrayList<>();
        listaDeFuncionariosHorista = new ArrayList<>();
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<FuncionarioComissionado> getListaDeFuncionariosComissionado() {
        return listaDeFuncionariosComissionado;
    }

    public void setListaDeFuncionariosComissionado(List<FuncionarioComissionado> listaDeFuncionariosComissionado) {
        this.listaDeFuncionariosComissionado = listaDeFuncionariosComissionado;
    }

    public List<FuncionarioHorista> getListaDeFuncionariosHorista() {
        return listaDeFuncionariosHorista;
    }

    public void setListaDeFuncionariosHorista(List<FuncionarioHorista> listaDeFuncionariosHorista) {
        this.listaDeFuncionariosHorista = listaDeFuncionariosHorista;
    }

    public void admitirFuncionarioHorista(FuncionarioHorista objeto){
        listaDeFuncionariosHorista.add(objeto);
    }

    public void admitirFuncionarioComissionado(FuncionarioComissionado objeto){
        listaDeFuncionariosComissionado.add(objeto);
    }

    public void gerarRelatorio(){
        System.out.println("CNPJ: "+cnpj);
        System.out.println();
        for (FuncionarioComissionado funciComi : listaDeFuncionariosComissionado) {
            System.out.println("Nome: " + funciComi.getNome());
            System.out.println("Nivel: " + funciComi.getFormacao());
            System.out.println("Tempos: " + funciComi.getAnos());
            System.out.println("Salario: " + funciComi.gerarSalarioComissionado());
            System.out.println();
        }
        for (FuncionarioHorista funciHora : listaDeFuncionariosHorista) {
            System.out.println("Nome: " + funciHora.getNome());
            System.out.println("Nivel: " + funciHora.getFormacao());
            System.out.println("Tempos: " + funciHora.getAnos());
            System.out.println("Salario: " + funciHora.gerarSalarioHorista());
        }

    }
}