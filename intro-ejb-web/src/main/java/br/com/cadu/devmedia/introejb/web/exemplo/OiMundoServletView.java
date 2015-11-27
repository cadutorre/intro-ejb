package br.com.cadu.devmedia.introejb.web.exemplo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.cadu.devmedia.introejb.services.exemplo.OiMundoServicoLocal;

@WebServlet("/oiMundo")
public class OiMundoServletView extends HttpServlet {

	private static final long serialVersionUID = -500386881146681398L;

	// @EJB
	private OiMundoServicoLocal oiMundoServletView;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.getWriter().append(oiMundoServletView.oiMundo());

	}

}
