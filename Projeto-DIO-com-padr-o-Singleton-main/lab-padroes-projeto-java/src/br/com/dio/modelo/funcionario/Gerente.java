package br.com.dio.modelo.funcionario;


public class Gerente extends Funcionario {

	/**
	 * Classe criada para encapsular a instancia da classe Gerente 
	 *
	 */
	private static class InstanciaGerente {
		public static Gerente instancia = new Gerente(1850.0, "Ana Paula", "Gerente", "Malhado", "Rua do cano", 741);
	}
	
	/**
	 * O construtor é privado pois o cargo de gerente é exclusivo para uma pessoa
	 * E ele recebe nos parametros as informações do funcionario instanciado
	 * @param salario
	 * @param nome
	 * @param cargo
	 * @param bairro
	 * @param rua
	 * @param numero
	 */
	private Gerente(double salario, String nome, String cargo, String bairro, String rua, Integer numero) {
		super(salario, nome, cargo, bairro, rua, numero);
	}
	
	/**
	 * Metodo que retorna a instancia da classe Gerente, e caso não tenha sido instanciado, ele ira instancia-la
	 */
	public static Gerente getGerente() {
		return InstanciaGerente.instancia;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome" + super.getNome() + " Cargo: " + super.getCargo();
	}
}
