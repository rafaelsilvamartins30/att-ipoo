public class FuncionarioHorista  extends Funcionario{
    private float horas;
    private float bonus;

    public FuncionarioHorista(String nome, String formacao, int idade, float horas, float bonus){
        super(nome, formacao, idade);
        this.horas = horas;
        this.bonus = bonus;    
    }

    public float getHoras() {
        return horas;
    }

    public void setHoras(float horas) {
        this.horas = horas;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public float gerarSalarioHorista(){
        return gerarSalario() + (horas * bonus);
    }
    
}