package model;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Curso {
	private String nombre;
	private String tematica;
	private double precio;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private List<Alumno> alumnos;
}
