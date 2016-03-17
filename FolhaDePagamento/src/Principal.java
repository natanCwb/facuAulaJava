import java.util.Scanner;


public class Principal {

	

	public static void main(String[] args) {
		
		/* Comando para ler dados
		 * read.next() para String read.nextInt() para inteiro read.nextDouble()
		 * para double read.next().charAt(0) para primeiro caracter */			
		Scanner read = new Scanner(System.in);
		
		
		
		
		//Cria um Array de varios ArrayLists -- SERÁ QUE ISSO É NECESSÁRIO???
		Dados dados = new Dados();
	
		
		int escolha, buscMes, buscAno;
		String buscNome;
		
		
		
	
	

		do {

			System.out.println("Escolha a opção: ");
			System.out.println("1 - Cadastrar Funcionario");
			System.out.println("2 - Consultar Folha");
			System.out.println("3 - Listar Folha");
			System.out.println("4 - Sair");
			escolha = read.nextInt();

			switch (escolha) {

			case 1:
		
				//Criando o novo objeto funcionario
				Funcionario funcionario = new Funcionario();
				
				//Recebendo a leitura dos dados e setando para dentro dos atributos da Classe Funcionario para o novo objeto funcionario
				System.out.print("Nome :");
				funcionario.setNome(read.next());

				System.out.print("Mes :");
				
				funcionario.setMes(read.nextInt());

				System.out.print("ano :");
				funcionario.setAno(read.nextInt());

				System.out.print("Quantidade de horas :");
				funcionario.setHora(read.nextInt());

				System.out.print("Valor das horas em R$ ");
				funcionario.setValorHora(read.nextDouble());
				
				
				dados.cadastrandoFuncionario(funcionario);
				
				
				
			
				break;	
				
			case 2:
				
				System.out.println("Declare o Nome do funcionário solicitado :");
				buscNome = read.next();
				
				System.out.println("Declare o Mes solicitado :");
				buscMes = read.nextInt();
				
				System.out.println("Declare o ano solicitado :");
				
				buscAno = read.nextInt();
				
				dados.buscaFuncionario(buscNome, buscMes, buscAno);
				
						
									
				
				break;
				
							
				

			}// swhitCase
			
		} while (escolha != 4);
		System.exit(0);
		
	}// main
}

// printar na tela

// array[0]=a;

// System.out.println(array[0].nome + " " + array[0].nasc + " "+array[0].cargo+"
// "+array[0].salario );