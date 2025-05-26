public class App {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("123", "Rafael");
        c1.depositar(1500.0);
        c1.sacar(300.0);
        c1.sacar(2000.0);
        c1.depositar(2000.0);
        System.out.println(c1.consulta());
        c1.exibir();
    }
}
