package ar.edu.unnoba.poo2021.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ar.edu.unnoba.poo2021.model.Intervencion;

@Repository
public interface IntervencionRepository extends JpaRepository<Intervencion, Long>{

}
