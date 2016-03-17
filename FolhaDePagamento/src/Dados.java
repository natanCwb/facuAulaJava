import java.util.ArrayList;

public class Dados {

	// Criando Array do tipo Funcionario(CLASE)
	ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

	public void cadastrandoFuncionario(Funcionario funcionario) {

		// add o objeto funcionario dentro do Array funcionarios
		funcionarios.add(funcionario);

	}

	public void buscaFuncionario(String N, int M, int A) {// NÃO CONSIGUI CAPTAR A STRING, DIZ QUE GET NÃO É INT E NÃO ACEITA STRING

		for (int i = 0; i < funcionarios.size(); i++) {

			if (funcionarios.get(i).getMes() == M && funcionarios.get(i).getAno() == A) { 

				System.out.println("foi encontrado " + N +" "+ M +" "+ A);

			} // if
			
		} // for
	}// buscaFUnc*

}
