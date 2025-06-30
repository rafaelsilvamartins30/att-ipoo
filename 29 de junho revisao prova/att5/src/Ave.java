public class Ave extends Animal {
    private boolean voa;

    public Ave(String name, String fala) {
        super(name, fala);
        this.voa = true;
    }

    @Override
    public String toString() {
        return super.toString() + ", Ave [voa=" + voa + "]";
    }
}
