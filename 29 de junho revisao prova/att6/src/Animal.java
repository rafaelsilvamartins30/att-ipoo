public class Animal {
    private String nome;
    private String especie;
    public Animal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    @Override 
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if(!(obj instanceof Animal)) {
        // } else if (obj == null || getClass() != obj.getClass()){ caso o objeto seja nulo ou não seja da mesma classe
            return false;
        } else if(obj == null || getClass() != obj.getClass()){
            return false;
        } else{
            Animal outro = (Animal) obj;   
            return especie.equals(outro.especie);
        }
    }
    @Override
    public String toString() {
        return "Nome: " + nome + ", especie: " + especie;
    }
}
