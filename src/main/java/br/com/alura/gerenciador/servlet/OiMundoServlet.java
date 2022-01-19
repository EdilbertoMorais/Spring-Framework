package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


//oi
@WebServlet (urlPatterns = "/oi") // -> chamado de mapeamento servlet URL que responde ao chamado do servlet
public class OiMundoServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws IOException {
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
        out.println("<body>");
        out.println("<h1>oi mundo, parabens vc escreveu o primeiro servlets.</h1>");
        out.println("</body>");
        out.println("</html>");
		
		System.out.println("o servlet OiMundoServlet foi chamado");
	}
	

}
