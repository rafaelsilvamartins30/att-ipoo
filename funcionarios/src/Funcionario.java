public class Funcionario {
    private String nome;
    private String formacao;
    private int anos;

    public Funcionario(String nome, String formacao, int anos){
        this.nome = nome;
        this.formacao =formacao;
        this.anos = anos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }

    public float gerarSalario(){
        if ( formacao.equals("medio")) {
            return 1500 + (500 * anos);
        } else if (formacao.equals("superior")) {
            return (1500 * 3) + (500 * anos);
        }
        return 0;
    }
    
}