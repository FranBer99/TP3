package ar.edu.unnoba.poo2021.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ar.edu.unnoba.poo2021.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
