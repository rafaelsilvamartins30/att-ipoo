public class FuncionarioComissionado extends Funcionario {
    private int itensVendidos;
    private float comissao;
    
    public FuncionarioComissionado(String nome, String formacao, int idade, float comissao,  int itensVendidos){
        super(nome, formacao, idade);
        this.itensVendidos = itensVendidos;
        this.comissao = comissao;    
    }

    public int getItensVendidos() {
        return itensVendidos;
    }

    public void setItensVendidos(int itensVendidos) {
        this.itensVendidos = itensVendidos;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
    
     public float gerarSalarioComissionado(){
         return gerarSalario() + (comissao * itensVendidos);
    }
}