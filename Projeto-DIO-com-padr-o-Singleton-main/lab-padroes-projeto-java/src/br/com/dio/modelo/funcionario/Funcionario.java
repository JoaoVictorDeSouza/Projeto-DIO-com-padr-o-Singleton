package br.com.dio.modelo.funcionario;


public abstract class Funcionario {

	private double salario;
	private String cargo;
	private String nome;
	private String rua;
	private String bairro;
	private int numero;
	
	public Funcionario(double salario, String nome, String cargo, String bairro, String rua, Integer numero) {
		this.salario = salario;
		this.nome = nome;
		this.cargo = cargo;
		this.bairro = bairro;
		this.rua = rua;
		this.numero = numero;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getRua() {
		return this.rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public Integer getNumero() {
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

	
}
