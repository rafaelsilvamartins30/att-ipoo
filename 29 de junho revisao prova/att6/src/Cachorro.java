public class Cachorro extends Animal{
    private String raca;

    public Cachorro(String name, String especie, String raca) {
        super(name, especie);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return super.toString() + ", raça: " + raca ;
    }

    
}
