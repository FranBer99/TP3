package ar.edu.unnoba.poo2021.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unnoba.poo2021.model.Usuario;
import ar.edu.unnoba.poo2021.repository.UsuarioRepository;

@Service
public class UsuarioServiceImp implements UsuarioService{
	
	@Autowired
	private UsuarioRepository usuarioRepo;
	
	@Override
	public Usuario create(Usuario user) {
		if(usuarioRepo.findByEmail(user.getEmail()) == null) {
			usuarioRepo.save(user);
		}
		return user;
	}

	@Override
	public List<Usuario> getUsuarios() {
		return usuarioRepo.findAll();
	}

	@Override
	public void delete(Long idUser) {
		usuarioRepo.deleteById(idUser);		
	}

	@Override
	public Usuario getUsuario(Long idUser) {
		return usuarioRepo.findById(idUser).get();
	}

	@Override
	public Usuario update(Usuario usuario) {
		Usuario uDB = usuarioRepo.findById(usuario.getId()).get();
        uDB.setNombre(usuario.getNombre());
        uDB.setApellido(usuario.getApellido());
        return usuarioRepo.save(uDB);
    }
}
