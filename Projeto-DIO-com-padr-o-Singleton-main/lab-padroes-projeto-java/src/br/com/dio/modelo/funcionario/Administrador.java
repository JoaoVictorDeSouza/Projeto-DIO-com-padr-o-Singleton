package br.com.dio.modelo.funcionario;


public class Administrador extends Funcionario {

	/**
	 * Classe criada para encapsular a instancia da classe Administrador 
	 *
	 */
	private static class InstanciaAdministrador {
		public static Administrador instancia = new Administrador(1850.0, "Ana Paula", "Administradora", "Malhado", "Rua do cano", 741);
	}
	
	
	private Administrador(double salario, String nome, String cargo, String bairro, String rua, Integer numero) {
		super(salario, nome, cargo, bairro, rua, numero);
	}

	/**
	 * Metodo que retorna a instancia da classe Gerente, e caso não tenha sido instanciado, ele ira instancia-la
	 * @return
	 */
	public static Administrador getAdministrador() {
		return InstanciaAdministrador.instancia;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + super.getNome() + " Cargo " + super.getCargo();
	}
}
