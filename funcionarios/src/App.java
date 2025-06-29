public class App {
    public static void main(String[] args) throws Exception {
        Empresa empresa = new Empresa("123456789/0001-98");
		FuncionarioHorista func1 = new FuncionarioHorista("Luiz","superior",2,100.0f,80.0f);
		FuncionarioComissionado func2 = new FuncionarioComissionado("Paulo","medio",1,200.0f,5);
		
		empresa.admitirFuncionarioHorista(func1);
		empresa.admitirFuncionarioComissionado(func2);
		
		empresa.gerarRelatorio();

		System.out.println("\nFuncionário 1 é igual ao Funcionário 2?: " + func1.equals(func2));
    }
}
