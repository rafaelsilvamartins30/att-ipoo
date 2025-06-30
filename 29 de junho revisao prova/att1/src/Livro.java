public class Livro extends ItemBiblioteca {
    private String autor;
    private int numeroPaginas;

    public Livro(String titulo, int anoPublicacao, boolean disponivel, String autor, int numeroPaginas) {
        super(titulo, anoPublicacao, disponivel);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return super.toString() + 
               "\nAutor: " + autor + 
               "\nNumero de Paginas: " + numeroPaginas;
    }

    @Override 
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        } else if(!(obj instanceof Livro)){
            return false;
        } else {
            Livro outro = (Livro) obj;
            return autor.equals(outro.autor)  && numeroPaginas == outro.numeroPaginas;
        }
    }
}

