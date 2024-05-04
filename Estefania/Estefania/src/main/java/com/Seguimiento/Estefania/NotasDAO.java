package com.Seguimiento.Estefania;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotasDAO extends JpaRepository<Notas, Integer>{

}