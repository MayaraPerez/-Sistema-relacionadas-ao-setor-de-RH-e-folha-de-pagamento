package Atividade3_entidades;

public class Assalariado extends funcionario {
	

	private double salarioMensal;
	
	//CONSTRUTOR VAZIO
	public Assalariado (){
		
	}

	//CONSTRUTOR PARAMETRO
	public Assalariado(String nome, double salario, int aumento, double salarioMensal) {
		super(nome, salario, aumento);
		this.salarioMensal = salarioMensal;
	}

	//ENCAPSULAMENTO
		public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

	//SOBRECARGA DE METODO 
	@Override
    public double mostrarDados() {
        super.mostrarDados();
        System.out.println("Salario: " + this.salarioMensal);
		return salarioMensal;
    }
	

}
