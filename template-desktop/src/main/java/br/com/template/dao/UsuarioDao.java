package br.com.template.dao;

import br.com.template.entidade.Usuario;
import br.com.template.persistencia.AbstractDao;

public class UsuarioDao extends AbstractDao<Usuario> {

	public UsuarioDao() {
		super(Usuario.class);
	}
}