public class Funcionario {


	/*
	 * read.next() para String read.nextInt() para inteiro read.nextDouble()
	 * para double read.next().charAt(0) para primeiro caracter
	 * 
	 * 
	 */

	private String nome;
	private int mes;
	private int ano;
	private int horas;
	private double valorHora;

	public Funcionario(String nome, int mes, int ano, int horas, double valorHora) {
		super();
		this.nome = nome;
		this.mes = mes;
		this.ano = ano;
		this.horas = horas;
		this.valorHora = valorHora;
	}


	public Funcionario() {
		// TODO Auto-generated constructor stub
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getHora() {
		return horas;
	}

	public void setHora(int hora) {
		this.horas = hora;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	
	//Retorna os dados transformados em String
	@Override
	public String toString() {
		return nome + " "+ mes+" "+ano+" "+horas+" "+ valorHora;
	}

}
