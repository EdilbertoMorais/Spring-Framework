package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.alura.gerenciador.acao.Usuario;

public class Banco {
	
	private static List<Empresa> listaEmpresas = new ArrayList<Empresa>();
	private static List<Usuario> listaUsuarios = new ArrayList<Usuario>();
	
	private static Integer chaveSequencial = 1;
	
	//simulando um banco de dados ->
	static {
		Empresa empresa = new Empresa();
		empresa.setId(chaveSequencial++);
		empresa.setNome("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setId(chaveSequencial++);
		empresa2.setNome("Caelum");
		Banco.listaEmpresas.add(empresa);
		Banco.listaEmpresas.add(empresa2);
		
		Usuario u1 = new Usuario();
		u1.setLogin("edilberto");
		u1.setSenha("12345");
		
		Usuario u2 = new Usuario();
		u2.setLogin("Nico");
		u2.setSenha("12345");
		
		listaUsuarios.add(u1);
		listaUsuarios.add(u2);
		
	} //  <- simulando um banco de dados 

	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);	
		Banco.listaEmpresas.add(empresa);
	}
	
	public List<Empresa> getEmpresas() {
		return Banco.listaEmpresas;
	}

	public void removeEmpresa(Integer id) {
		
		Iterator <Empresa> it = listaEmpresas.iterator();
		while(it.hasNext()) {
			Empresa emp = it.next();
			if (emp.getId() == id) {
				it.remove();
			}
		}
	}

	public Empresa buscaEmpresaPelaId(Integer id) {
		for (Empresa empresa : listaEmpresas) {
			if(empresa.getId() == id) {
				return empresa;
			}
			
		}
		return null;
	}

	public Usuario existeUsuario(String login, String senha) {
		for(Usuario usuario : listaUsuarios) {
			if(usuario.ehIgual(login, senha)) {
				return usuario;
			}
		}
		return null;
	}	
}
