public class Produto {
    private String nome;
    private double preco;
    private String codBarra;

    public Produto(String nome, double preco, String codBarra) {
        this.nome = nome;
        this.preco = preco;
        this.codBarra = codBarra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", codBarra=" + codBarra + "]";
    }
    
    @Override
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        } else if(!(obj instanceof Produto)) {
            return false;
        } else {
            Produto outro = (Produto) obj;
            return this.codBarra.equals(outro.codBarra);
        }
    }

    @Override
    public int hashCode() {
        return codBarra.hashCode();
    }
}
