public class ItemBiblioteca {
    private String titulo;
    private int anoPublicacao;
    private boolean disponivel;

    public ItemBiblioteca(String titulo, int anoPublicacao, boolean disponivel) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public  void emprestar(){
            setDisponivel(false);
    }

    public void devolver() {
        setDisponivel(true);
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + 
               "\nAno de Publicacao: " + anoPublicacao + 
               "\nDisponivel: " + (disponivel ? "Sim" : "Nao");
    }
}
