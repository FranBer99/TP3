package ar.edu.unnoba.poo2021.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ar.edu.unnoba.poo2021.model.Usuario;
import ar.edu.unnoba.poo2021.repository.UsuarioRepository;

@Service
public class UsuarioServiceImp implements UsuarioService{
	
	@Autowired
	private UsuarioRepository usuarioRepo;
	//@Autowired
	//private BCryptPasswordEncoder passwordEncoder;
	
	@Override
	public Usuario create(Usuario user) {
		if(usuarioRepo.findByEmail(user.getEmail()) == null) {
			//user.setPassword(passwordEncoder.encode(user.getPassword()));
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

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Usuario usuario = usuarioRepo.findByEmail(email);
		if(usuario == null) {
			throw new UsernameNotFoundException("Email Invalido");
		}
		return new org.springframework.security.core.userdetails.User(usuario.getEmail(), usuario.getPassword(), usuario.getAuthorities());
	}
}
