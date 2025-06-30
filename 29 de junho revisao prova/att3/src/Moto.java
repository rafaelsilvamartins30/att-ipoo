public class Moto extends Veiculo {
    private boolean partidaEletrica;

    public Moto(String modelo, String placa, boolean partidaEletrica) {
        super(modelo, placa);
        this.partidaEletrica = partidaEletrica;
    }

    @Override
    public String toString() {
        return super.toString() + ", Partida Eletrica= " + (partidaEletrica ?"Sim"  : "Não");
    }
    
}
