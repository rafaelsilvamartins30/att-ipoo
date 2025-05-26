public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private Double saldo; 

    public ContaBancaria(String numeroConta, String titular){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
    }
    public void depositar(Double valor){
        saldo = saldo + valor;
    }
    public void sacar(Double valor){
        if (saldo >= valor) {
            saldo = saldo - valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
    public Double consulta(){
        return saldo;
    }
    public void exibir(){
        System.out.println("Conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}
