package br.com.dio.modelo.funcionario;


public class Rh extends Funcionario {
	
	private static class InstanciaRh {
		public static Rh instancia = new Rh(1850.0, "Ana Paula", "Recursos Humanos", "Malhado", "Rua do cano", 741);
	}
				
	private Rh(double salario, String nome, String cargo, String bairro, String rua, Integer numero) {
		super(salario, nome, cargo, bairro, rua, numero);
	}

	public static Rh getRh() {
		return InstanciaRh.instancia;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + super.getNome() + " Cargo " + super.getCargo();
	}
}
