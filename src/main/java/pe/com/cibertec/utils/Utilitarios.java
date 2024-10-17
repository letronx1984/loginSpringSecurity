package pe.com.cibertec.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
@Component
public class Utilitarios {

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public String hashearPassword(String password) {
		return passwordEncoder.encode(password);
	}
}