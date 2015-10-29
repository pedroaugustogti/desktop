package br.com.template.dao;

import java.util.List;

import br.com.template.dto.FiltroMesaDTO;
import br.com.template.entidade.Mesa;
import br.com.template.persistencia.ConsultasDaoJpa;

public class MesaDao extends ConsultasDaoJpa<Mesa> {

	public MesaDao() {
		super(Mesa.class);
	}

	public List<Mesa> pesquisaPorNumeroMesa(FiltroMesaDTO filtro) {
		
		return super.filtrarPesquisa(filtro, Mesa.class);
	}
}