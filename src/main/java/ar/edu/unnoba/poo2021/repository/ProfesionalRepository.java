package ar.edu.unnoba.poo2021.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ar.edu.unnoba.poo2021.model.Profesional;

@Repository
public interface ProfesionalRepository extends JpaRepository<Profesional, Long>{

}