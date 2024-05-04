package com.Seguimiento.Estefania;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

public class NotasServicio implements Notasinterface {

    @Autowired
	private NotasDAO notasDAO;

    @Override
	@Transactional
	public void guardar(Notas nota) {
		notasDAO.save(nota);
	}

	@Override
	@Transactional
	public List<Notas> listado() {
		return notasDAO.findAll();
	}

	@Override
	@Transactional
	public Notas consultar(Integer id) {
		return notasDAO.findById(id).orElse(null);
	}

}
