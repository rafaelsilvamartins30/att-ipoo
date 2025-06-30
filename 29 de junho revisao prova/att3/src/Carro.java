public class Carro extends Veiculo {
    private int portas;

    public Carro(String modelo, String placa, int portas) {
        super(modelo, placa);
        this.portas = portas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Portas= " + portas ;
    }

}
