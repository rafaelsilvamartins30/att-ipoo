public class Veiculo {
    private String modelo;
    private String placa;

    public Veiculo(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Modelo= " + modelo + ", Placa= " + placa ;
    }
    
}
