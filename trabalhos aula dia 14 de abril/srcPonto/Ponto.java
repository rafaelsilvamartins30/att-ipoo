public class Ponto {
    private double x;
    private double y;
    
    public Ponto ( double x ,double y){
        this.x = x;
        this.y = y;
    }
    
    public String getPonto() {
        return String.format("As coordenadas (x, y) do ponto são (%.1f, %.1f)", x, y);
    }

    public double calcularDistancia(Ponto outro){
        double dx = this.x - outro.x;
        double dy = this.y - outro.y;
        return Math.sqrt(Math.pow(dx,2) + Math.pow(dy,2));
    }
}
