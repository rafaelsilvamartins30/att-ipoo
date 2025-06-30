public class Cachorro extends Animal{
    private String raca;

    public Cachorro(String name, String fala, String raca) {
        super(name, fala);
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
