public class Cachorro extends Mamifero {
    private String raca;

    public Cachorro(String name, String fala, int patas, String raca) {
        super(name, fala, patas);
        this.raca = raca;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cachorro [raca=" + raca + "]";
    }
}

