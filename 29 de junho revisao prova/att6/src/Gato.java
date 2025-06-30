public class Gato extends Animal {
    private boolean gostaDeCaixa;
    public Gato(String name, String fala, boolean gostaDeCaixa) {
        super(name, fala);
        this.gostaDeCaixa = gostaDeCaixa;
    }
    public boolean isGostaDeCaixa() {
        return gostaDeCaixa;
    }
    public void setGostaDeCaixa(boolean gostaDeCaixa) {
        this.gostaDeCaixa = gostaDeCaixa;
    }
    @Override
    public String toString() {
        return super.toString() + " Gosta de caixa: " + gostaDeCaixa;
    }
    
}
