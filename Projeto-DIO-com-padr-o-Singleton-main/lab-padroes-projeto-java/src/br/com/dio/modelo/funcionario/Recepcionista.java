package br.com.dio.modelo.funcionario;


public class Recepcionista extends Funcionario {

	public Recepcionista(double salario, String nome, String cargo, String bairro, String rua, Integer numero) {
		super(salario, nome, cargo, bairro, rua, numero);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + super.getNome() + " Cargo " + super.getCargo();
	}

}
