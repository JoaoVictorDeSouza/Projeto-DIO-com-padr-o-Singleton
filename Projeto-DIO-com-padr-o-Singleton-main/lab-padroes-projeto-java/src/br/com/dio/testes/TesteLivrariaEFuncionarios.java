package br.com.dio.testes;

import br.com.dio.modelo.Livraria;
import br.com.dio.modelo.funcionario.Administrador;
import br.com.dio.modelo.funcionario.Bibliotecario;
import br.com.dio.modelo.funcionario.Faxineiro;
import br.com.dio.modelo.funcionario.Gerente;
import br.com.dio.modelo.funcionario.Recepcionista;
import br.com.dio.modelo.funcionario.Rh;

public class TesteLivrariaEFuncionarios {

	public static void main(String[] args) {
		
		Livraria livraria = Livraria.getLivraria();
		
		//Cargos que tem somente um funcionario tem o construtor privado para garantir que ele seja instanciado uma unica vez
		Gerente gerente = Gerente.getGerente();
		Administrador adm = Administrador.getAdministrador();
		Bibliotecario bibliotecario = Bibliotecario.getBibliotecario();
		Rh recursosHumanos = Rh.getRh();
		
		//Cargos que podem ter dois ou mais funcionarios tem construtores publicos casos necessite criar outros
		Faxineiro faxineiro = new Faxineiro(1100.0, "Ricardo", "Faxineiro", "Malhado", "Vilela", 124);
		Recepcionista Recepcionista = new Recepcionista(1100.0, "Carolina", "Recepcionista", "São Miguel", "Tapera", 1424);

		livraria.addFuncionario(gerente);
		livraria.addFuncionario(adm);
		livraria.addFuncionario(bibliotecario);
		livraria.addFuncionario(recursosHumanos);
		livraria.addFuncionario(faxineiro);
		livraria.addFuncionario(Recepcionista);
		
		System.out.println("Lista de Funcionarios da livraria:");
		System.out.println(livraria.getFuncionarios().get(0));
		System.out.println(livraria.getFuncionarios().get(1));
		System.out.println(livraria.getFuncionarios().get(2));
		System.out.println(livraria.getFuncionarios().get(3));
		System.out.println(livraria.getFuncionarios().get(4));
		System.out.println(livraria.getFuncionarios().get(5));
	}

}
