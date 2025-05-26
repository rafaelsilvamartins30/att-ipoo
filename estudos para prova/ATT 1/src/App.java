public class App {
    public static void main(String[] args) {
        Produto c1 = new Produto("Fusca", 900);

        c1.imprimir();
        c1.setNome("Golf");
        c1.setPreco(2000);
        c1.imprimir();
    }
}
