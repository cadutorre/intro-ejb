package br.com.cadu.devmedia.introejb.web.exemplo;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.function.Consumer;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.cadu.devmedia.introejb.services.exemplo.CorretorServicoLocal;

@WebServlet("/oiMundo")
public class CorretorServletView extends HttpServlet {

	private static final long serialVersionUID = -500386881146681398L;

	@Inject
	private CorretorServicoLocal corretorServico;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		corretorServico.listaCorretor().forEach(imprimirNo(resp));
	}

	private Consumer<String> imprimirNo(HttpServletResponse resp) {
		return c -> {
			try {
				resp.getWriter().println(c);
			} catch (IOException e) {
				throw new UncheckedIOException(e);
			}
		};
	}

}
