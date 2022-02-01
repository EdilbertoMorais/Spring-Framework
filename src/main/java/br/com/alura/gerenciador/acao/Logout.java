package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession sessao = request.getSession();
		
//		sessao.removeAttribute("usuarioLogado"); nesse codigo a sess�o HTTP ainda � preservada
		sessao.invalidate(); // usando o comando invalidate() a sessao HTTP e os cookies s�o destruidos
		
		return "redirect:entrada?acao=LoginForm";
	}

}
