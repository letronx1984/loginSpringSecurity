package pe.com.cibertec.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="tb_usuario")
public class UsuarioEntity {

	
	
	@Id 
	@Column(name="dni_usuario", unique=true, columnDefinition = "CHAR(8)", length = 8, nullable =false)
	private String dniUsuario;
	
	@Column(name ="nombre_usuario", nullable=false)
	private String nomUsuario;
	
	@Column(name="password_usuario", nullable=false)
	private String password;
		//==========================================================================0\\
	public String getDniUsuario() {
		return dniUsuario;
	}

	public void setDniUsuario(String dniUsuario) {
		this.dniUsuario = dniUsuario;
	}

	public String getNomUsuario() {
		return nomUsuario;
	}

	public void setNomUsuario(String nomUsuario) {
		this.nomUsuario = nomUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UsuarioEntity [dniUsuario=" + dniUsuario + ", nomUsuario=" + nomUsuario + ", password=" + password
				+ "]";
	}

	public UsuarioEntity(String dniUsuario, String nomUsuario, String password) {
		super();
		this.dniUsuario = dniUsuario;
		this.nomUsuario = nomUsuario;
		this.password = password;
	}

	public UsuarioEntity() {
		super();
	}
	
	
}
