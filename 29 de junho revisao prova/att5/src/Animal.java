public class Animal {
    private String name;
    private String fala;

    public Animal(String name , String fala) {
        this.name = name;
        this.fala = fala;
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + ", fala=" + fala + "]";
    }

    public void falar(){
        System.out.println("O animal " + name + " fala: " + fala);
    }
}

