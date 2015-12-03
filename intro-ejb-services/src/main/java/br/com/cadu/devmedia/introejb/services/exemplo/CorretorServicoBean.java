package br.com.cadu.devmedia.introejb.services.exemplo;

import java.util.Arrays;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;

@Stateless
@Local(CorretorServicoLocal.class)
public class CorretorServicoBean implements CorretorServicoLocal {

	@Override
	public List<String> listaCorretor() {
		return Arrays.asList("Carlos","Diego","Leonardo");
	}

}
