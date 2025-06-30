public class Revista extends ItemBiblioteca{
    private int numeroEdicao;

    public Revista(String titulo, int anoPublicacao, boolean disponivel, int numeroEdicao) {
        super(titulo, anoPublicacao, disponivel);
        this.numeroEdicao = numeroEdicao;
    }
    
    public int getNumeroEdicao() {
        return numeroEdicao;
    }

    public void setNumeroEdicao(int numeroEdicao) {
        this.numeroEdicao = numeroEdicao;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nNumero da Edicao: " + numeroEdicao;    
    }

}