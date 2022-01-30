package br.com.dio.testes;

import java.io.IOException;

import br.com.dio.modelo.Cliente;

import java.util.Scanner;

import br.com.dio.modelo.Livraria;
import br.com.dio.modelo.Livro;

public class TesteLivrariaEClientes {

	public static void main(String[] args) throws IOException{
		Scanner leitor = new Scanner(System.in);
		Livraria livraria = Livraria.getLivraria(); 	
		
		System.out.println(livraria.toString());
		
		
		Livro livro = new Livro("Mitologia Nordica", "Mito", 286, "Neil Gaiman");
		Livro livro1 = new Livro("Linguagem, Programação e Banco de Dados", "T.I", 286, "Gislaine Camila Lapasini Leal");
		Livro livro2 = new Livro("Arquitetura de TI como estrategia empresarial", "T.I.", 286, " Jeanne W. Ross, David Robertson, Peter Weill");
		Livro livro3 = new Livro("Dois a Dois", "Romance", 286, "Nicholas Sparks");
		livraria.addLivros(livro);
		livraria.addLivros(livro1);
		livraria.addLivros(livro2);
		livraria.addLivros(livro3);
		
		Cliente cliente = new Cliente("joao", "11.111.111-12", "111.111.111-11");
		Cliente cliente1 = new Cliente("mariana", "22.222.222-22", "333.333.333-33");
		Cliente cliente2 = new Cliente("marcia", "233.232.323-42", "444.444.444-40");
		livraria.addClinete(cliente);
		livraria.addClinete(cliente1);
		livraria.addClinete(cliente2);
		
		
		System.out.println("Livros disponiveis na Contos do Saber:");
		System.out.println(livraria.getLivros());
		
		System.out.println("  ");
		System.out.println("Escolha um livro para ler:");
		String leitura = leitor.next();
		livraria.escolhaLivro(leitura);
		
		System.out.println(livraria.getLivros());
		
		
	}

}
