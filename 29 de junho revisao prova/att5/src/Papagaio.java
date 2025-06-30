public class Papagaio extends Ave {
    private String cor;

    public Papagaio(String name, String fala, String cor) {
        super(name, fala);
        this.cor = cor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Papagaio [cor=" + cor + "]";
    }
}

