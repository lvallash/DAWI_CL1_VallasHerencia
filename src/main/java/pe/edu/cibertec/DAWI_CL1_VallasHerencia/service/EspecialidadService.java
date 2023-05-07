package pe.edu.cibertec.DAWI_CL1_VallasHerencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.cibertec.DAWI_CL1_VallasHerencia.model.bd.Especialidad;
import pe.edu.cibertec.DAWI_CL1_VallasHerencia.repository.EspecialidadRepository;

@Service
public class EspecialidadService {
	
	@Autowired
	private EspecialidadRepository especialidadRepository;
	
	public List<Especialidad> listarEspecialidad(){
		return especialidadRepository.findAll();
	}
	
	public void registrarEspecialidad(Especialidad especialidad) {
		especialidadRepository.save(especialidad);
	}

}
