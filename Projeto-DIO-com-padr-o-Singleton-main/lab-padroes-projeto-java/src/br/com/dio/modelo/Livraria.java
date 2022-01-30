package br.com.dio.modelo;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

import br.com.dio.modelo.funcionario.Funcionario;


public class Livraria {

	private static class InstanciaLivraria {
		public static Livraria instanciaLivraria = new Livraria();
	}
	private List<Livro> livros = new ArrayList<>();
	private List<Funcionario> funcionarios = new ArrayList<>();
	private Set<Cliente> clientes = new LinkedHashSet<>(); 
	private String rua = "Uruguaiana";
	private String bairro = "Diadema";
	private int numero = 987;
	
	private Livraria() {
	}
	
	public static Livraria getLivraria() {
		return InstanciaLivraria.instanciaLivraria;
	}
	
	public List<Livro> getLivros() {
		return livros;
	}

	/**
	 * Método que adiciona uma conta instanciada a lista de Contas 
	 * @param conta
	 */
	public void addLivros(Livro livros){
		this.livros.add(livros); 
	}
	
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	
	/**
	 * Método que adiciona um Funcionario instanciado a lista de Funcionarios
	 * @param funcionario
	 */
	public void addFuncionario(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}
	
	public void addClinete(Cliente clientes) {
		this.clientes.add(clientes);
	}
	
	public String getRua() {
		return this.rua;
	}

	
	public void setRua(String rua) {
		this.rua = rua;
	}

	
	public Integer getNumero() {
		// TODO Auto-generated method stub
		return this.numero;
	}

	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	
	public String getBairro() {
		return this.bairro;
	}

	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}	

	@Override
	public int hashCode() {
		return Objects.hash(funcionarios, livros);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livraria other = (Livraria) obj;
		return Objects.equals(funcionarios, other.funcionarios) && Objects.equals(livros, other.livros);
	}


	public void escolhaLivro(String leitura) {
		 Optional<Livro> livro = this.livros.stream().findFirst();
	        if(livro.isPresent()) {
	            this.livros.add(livro.get());
	            this.livros.remove(livro.get());
	        } else {
	            System.err.println("Não temos este livro!!!");
	        }
		
	}
	
	@Override
	public String toString() {
		return "Livraria Contos do saber, localizado no bairro: " + 
				bairro + " na rua: " + rua + " número: " + numero;
	}
}
