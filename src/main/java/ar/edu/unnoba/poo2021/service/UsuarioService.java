package ar.edu.unnoba.poo2021.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;
import ar.edu.unnoba.poo2021.model.Usuario;

public interface UsuarioService extends UserDetailsService{
	public Usuario create(Usuario user);
	public List<Usuario> getUsuarios();
	public void delete(Long idUser);
	public Usuario getUsuario(Long idUser);
	public Usuario update(Usuario user);
}
