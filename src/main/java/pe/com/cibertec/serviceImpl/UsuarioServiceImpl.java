
package pe.com.cibertec.serviceImpl;
import java.util.List;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import pe.com.cibertec.model.UsuarioEntity;
import pe.com.cibertec.repository.UsuarioRepository;
import pe.com.cibertec.service.UsuarioService;
import pe.com.cibertec.utils.Utilitarios;


@RequiredArgsConstructor
@Service
public class UsuarioServiceImpl implements UsuarioService{

	
	private final Utilitarios utilitarios;
	
	
	private final UsuarioRepository usuarioRepository;

	@Override
	public List<UsuarioEntity> listarUsuarios() {
		
		return usuarioRepository.findAll();
	}

	@Override
	public void crearUsuario(UsuarioEntity usuarioEntity) {
		String hashedPassword = utilitarios.hashearPassword(usuarioEntity.getPassword());
		
		usuarioEntity.setPassword(hashedPassword);
		usuarioRepository.save(usuarioEntity);
	}


	@Override
	public void actualizarUsuario(String dniUsuario, UsuarioEntity usuarioEntity) {
		
		UsuarioEntity usuarioEncontrado = buscarPorDni(dniUsuario);
		if(usuarioEncontrado==null) {
			throw new RuntimeException("Usuario no encontrado");
		}
		try {
			usuarioEncontrado.setNomUsuario(usuarioEncontrado.getNomUsuario());
			usuarioEncontrado.setPassword(usuarioEncontrado.getPassword());
		} catch (Exception e) {
			throw new RuntimeException("Usuario no encontrado");
		}
		
	}

	@Override
	public void eliminarUsuario(String dniUsuario) {
		UsuarioEntity usuarioEncontrado = buscarPorDni(dniUsuario);
		if(usuarioEncontrado==null) {
			throw new RuntimeException("usuario no encontrado ");
			
		}
		usuarioRepository.delete(usuarioEncontrado);
		
	}

	@Override
	public UsuarioEntity buscarPorDni(String dniUsuario) {
		return usuarioRepository.findByDniUsuario(dniUsuario);
	}
	
	
	
}
