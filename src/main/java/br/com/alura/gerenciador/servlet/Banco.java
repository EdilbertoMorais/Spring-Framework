package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> listaEmpresas = new ArrayList<Empresa>();
	
	//simulando um banco de dados ->
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Caelum");
		Banco.listaEmpresas.add(empresa);
		Banco.listaEmpresas.add(empresa2);
	} //  <- simulando um banco de dados 

	public void adiciona(Empresa empresa) {
		Banco.listaEmpresas.add(empresa);
	}
	
	public List<Empresa> getEmpresas() {
		return Banco.listaEmpresas;
	}	

}
