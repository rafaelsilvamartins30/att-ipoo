public class Funcionario {
    private String nome;
    private String cpf;
    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override 
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        } else if(!(obj instanceof Funcionario)){
            return false;
        } else{
            Funcionario outro = (Funcionario) obj;
            return cpf.equals(outro.cpf);
        }
    }
    @Override 
    public int hashCode() {
        return cpf.hashCode();
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", cpf=" + cpf + "]";
    }

    
}
