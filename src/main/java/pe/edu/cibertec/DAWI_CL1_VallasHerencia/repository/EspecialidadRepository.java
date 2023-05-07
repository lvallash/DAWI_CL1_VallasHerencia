package pe.edu.cibertec.DAWI_CL1_VallasHerencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.cibertec.DAWI_CL1_VallasHerencia.model.bd.Especialidad;

@Repository
public interface EspecialidadRepository 
	extends JpaRepository <Especialidad, Integer> {

}
