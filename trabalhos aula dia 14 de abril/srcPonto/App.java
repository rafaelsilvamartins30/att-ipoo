public class App {
    public static void main(String[] args) {
        Ponto p1 = new Ponto (1.5, -2.5);
        
        System.out.println(p1.getPonto());

        Ponto p2 = new Ponto(3.5, 5.5);
        
        System.out.printf("A distancia entre os pontos é: %.2f\n", p1.calcularDistancia(p2));
    }
}
