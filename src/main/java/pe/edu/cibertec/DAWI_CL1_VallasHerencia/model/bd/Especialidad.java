package pe.edu.cibertec.DAWI_CL1_VallasHerencia.model.bd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Especialidad")
public class Especialidad {
	 @Id
	 private Integer idEsp;
	 @Column
	 private String nomEsp;
	 @Column 
	 private Double costo;
	
	
}
