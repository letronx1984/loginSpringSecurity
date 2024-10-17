package pe.com.cibertec.service;

import java.util.List;


import pe.com.cibertec.model.UsuarioEntity;

public interface UsuarioService {

	
	List<UsuarioEntity> listarUsuarios();
	void crearUsuario(UsuarioEntity usuarioEntity);
	void actualizarUsuario(String dniUsuario, UsuarioEntity usuarioEntity);
	void eliminarUsuario(String dniUsuario);
	UsuarioEntity buscarPorDni(String dniUsuario);
}
