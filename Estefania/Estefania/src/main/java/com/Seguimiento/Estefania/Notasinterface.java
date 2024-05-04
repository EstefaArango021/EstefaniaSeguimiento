package com.Seguimiento.Estefania;

import java.util.List;

public interface EstudianteInterface {

	public void guardar (Notas nota);
	
	public List<Notas> listado();
	
	public Notas consultar (Integer id);

	//guardar
	//listar

}