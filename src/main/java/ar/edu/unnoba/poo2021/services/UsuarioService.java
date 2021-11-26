package ar.edu.unnoba.poo2021.services;

import org.springframework.stereotype.Service;
import ar.edu.unnoba.poo2021.model.Usuario;

@Service
public interface UsuarioService {
	public Usuario create(Usuario user);

}
