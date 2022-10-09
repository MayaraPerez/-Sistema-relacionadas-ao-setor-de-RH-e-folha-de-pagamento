package Atividade3_entidades;

public class Horista extends funcionario {

	//ATRIBUTOS
	private double salarioHorista;
	private double valorHora;
	private int horasTrabalhada;

	//CONSTRUTOR VAZIO
	public Horista () {
		
	}
	
	//CONSTRUTOR PARAMETRO
		public Horista(String nome, double salario, int aumento, double salarioHorista, double valorHora,
			int horasTrabalhada) {
		super(nome, salario, aumento);
		this.salarioHorista = salarioHorista;
		this.valorHora = valorHora;
		this.horasTrabalhada = horasTrabalhada;
	}

	//ENCAPSULAMENTO
	public double getSalarioHorista() {
		return salarioHorista;
	}



	public void setSalarioHorista(double salarioHorista) {
		this.salarioHorista = salarioHorista;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int getHorasTrabalhada() {
		return horasTrabalhada;
	}

	public void setHorasTrabalhada(int horasTrabalhada) {
		this.horasTrabalhada = horasTrabalhada;
	}
	
	//SOBRECARGA DE METODO 
	@Override
    public double mostrarDados() {
        super.mostrarDados();
        System.out.println("Salario: " + this.salarioHorista);
        System.out.println("Horas Trabalhadas: " + this.horasTrabalhada);
        System.out.println("Valor da hora: " + this.valorHora);
		return this.salarioHorista;
	
	}
 

	
}

	
