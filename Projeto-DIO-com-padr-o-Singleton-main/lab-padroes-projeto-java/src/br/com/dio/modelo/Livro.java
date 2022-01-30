package br.com.dio.modelo;

public class Livro {

	private String nome;
	private String genero;
	private int paginas;
	private String autor;
	private static int quantidadesLivros;
	
	
	public Livro(String nome, String genero, int paginas, String autor) {
		this.nome = nome;
		this.genero = genero;
		this.paginas = paginas;
		this.autor = autor;
		this.quantidadesLivros += 1;
		
	}
	
	public String getNome() {
		return nome;
	}
	public String getGenero() {
		return genero;
	}
	public int getPaginas() {
		return paginas;
	}
	public String getAutor() {
		return autor;
	}
	
	public static int getQuantidadesLivros() {
		return quantidadesLivros;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + this.nome + " Genero: " + this.genero + " Paginas: " + this.paginas + " Autor: " + this.autor;
	}
}
