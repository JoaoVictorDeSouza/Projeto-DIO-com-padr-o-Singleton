package br.com.dio.modelo.funcionario;



public class Bibliotecario extends Funcionario {

	private static class InstanciaBibliotecario {
		public static Bibliotecario instancia = new Bibliotecario(1550.0, "Pedro", "Bibliotecario", "Malhado", "Rua Xavier", 841);
	}
	
	private Bibliotecario(double salario, String nome, String cargo, String bairro, String rua, Integer numero) {
		super(salario, nome, cargo, bairro, rua, numero);
	}

	public static Bibliotecario getBibliotecario() {
		return InstanciaBibliotecario.instancia;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + super.getNome() + " Cargo " + super.getCargo();
	}
}
