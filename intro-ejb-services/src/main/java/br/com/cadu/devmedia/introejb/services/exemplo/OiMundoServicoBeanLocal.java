package br.com.cadu.devmedia.introejb.services.exemplo;

import javax.ejb.Local;
import javax.ejb.Stateless;

@Stateless
@Local(OiMundoServicoLocal.class)
public class OiMundoServicoBeanLocal implements OiMundoServicoLocal {

	@Override
	public String oiMundo() {
		return "Oi Mundo!!";
	}

}
