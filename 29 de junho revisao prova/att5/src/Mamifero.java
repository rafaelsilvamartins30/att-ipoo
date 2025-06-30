public class Mamifero extends Animal {
    private int patas;

    public Mamifero(String name, String fala, int patas) {
        super(name, fala);
        this.patas = patas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Mamifero [patas=" + patas + "]";
    }
}
