import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String args[]) {
		List<GerenciarFuncionario> funcionarios = new ArrayList<>();
		
		GerenciarFuncionario funcionario = new GerenciarFuncionario();
		GerenciarFuncionario funcionario2 = new GerenciarFuncionario();
		
		funcionario.setNome("Marcos");
		funcionario.setCpf("075,541.910-23");
		funcionario.setFuncao("Estagiário");
		funcionario.setIdade(26);
		
		funcionarios.add(funcionario);
		
		funcionario2.setNome("Carlos");
		funcionario2.setCpf("057,530.910-32");
		funcionario2.setFuncao("Full Stack Developer");
		funcionario2.setIdade(32);
		
		funcionarios.add(funcionario2);
		
		for(int i = 0;i <funcionarios.size();i++) {
			System.out.println((funcionarios.get(i).getNome()));
			System.out.println(funcionarios.get(i).getCpf());
			System.out.println(funcionarios.get(i).getFuncao());
			System.out.println(funcionarios.get(i).getIdade());
			System.out.println("_______________________________");
		}
		
		
		
		
		
		
	}
}
