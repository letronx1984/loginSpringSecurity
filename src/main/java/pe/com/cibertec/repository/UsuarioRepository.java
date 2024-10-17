package pe.com.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.com.cibertec.model.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, String> {
	
	UsuarioEntity findByDniUsuario(String dniUsuario);
	
}
