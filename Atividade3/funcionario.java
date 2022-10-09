package Atividade3_entidades;

public class funcionario {

	private String nome;
	private double salario;
	private int aumento;
	
	//CONSTRUTOR VAZIO
	public funcionario() {
		
	}
	
	//CONSTRUTOR PARAMETRO
	public funcionario(String nome, double salario, int aumento) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.aumento = aumento;
	}

	//ENCAPSULAMENTO
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getAumento() {
		return aumento;
	}

	public void setAumento(int aumento) {
		this.aumento = aumento;
	}
	
	//METODOS
	public double aumentoSalario(double aumento) {
		return salario = salario + aumento * 1.1;
	}
	
    public double mostrarDados() {
        return this.salario;
    }
	

	
}
