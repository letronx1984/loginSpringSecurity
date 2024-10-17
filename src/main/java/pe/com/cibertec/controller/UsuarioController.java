package pe.com.cibertec.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
import pe.com.cibertec.model.UsuarioEntity;
import pe.com.cibertec.service.UsuarioService;

@Controller
@RequiredArgsConstructor
public class UsuarioController {

	private final UsuarioService usuarioService;
	
	@GetMapping("/usuarios")
	public String home(Model model) {
		
		List<UsuarioEntity> listadoUsuario = usuarioService.listarUsuarios();
		model.addAttribute("listadoUsuario",listadoUsuario);
		return "listar_usuario";
	}
}
