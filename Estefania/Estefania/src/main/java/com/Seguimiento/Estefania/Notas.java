package com.Seguimiento.Estefania;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Estefania")
public class Notas {
	@Id
	private int id;
	private String cedula;
	private String nombre;
	private String nota1;
	private String nota2;
	private String nota3 ;
	private String resultado;

	public Notas() {
		super();
	}

public Notas(int id, String cedula, String nombre, String nota1, String nota2,String nota3,String resultado){
    super();
		this.id = id;
		this.cedula = cedula;
		this.nombre = nombre;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.resultado = resultado;
}

public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getCedula() {
    return cedula;
}
public void setCedula(String cedula) {
    this.cedula = cedula;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getNota1() {
    return nota1;
}
public void setNota1(String nota1) {
    this.nota1 = nota1;
}
public String getNota2() {
    return nota2;
}
public void setNota2(String nota2) {
    this.nota2 = nota2;
}
public String getNota3() {
    return nota3;
}
public void setNota3(String nota3) {
    this.nota3 = nota3;
}
public String getResultado() {
    return resultado;
}
public void setResultado(String resultado) {
    this.resultado = resultado;
}

@Override
public String toString() {
    return "Notas [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", nota1=" + nota1
            + ", nota2=" + nota2 + ", nota3=" + nota3 + ", resultado=" + resultado + "]";
}
}


