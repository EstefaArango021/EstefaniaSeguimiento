function nota(){
	
	let cedula=document.getElementById("cedula").value;
	let nombre=document.getElementById("nombre").value;
	let nota1=document.getElementById("nota1").value;
	let nota2=document.getElementById("nota2").value;
	let nota3=document.getElementById("nota3").value;
	let resultado=document.getElementById("resultado").value;
	
	if(!(/^[0-9]{5,10}$/.test(cedula))){
		alert("Cédula Incorrecta \nIngrese solo numeros \nMin5. Max10");
		return false;
		
	}else if(!(/^[a-zA-ZñÑ ]{3,20}$/.test(nombre))){
		alert("Nombre Incorrecto \nIngrese solo letras \nMin3. Max20");
		return false;
	}
	if(!(/^[0-9]{5,10}$/.test(nota1))){
		alert("Nota incorrecta \nIngrese solo numeros \nMin5. Max10");
		return false;
	}
	if(!(/^[0-9]{5,10}$/.test(nota2))){
		alert("Nota incorrecta \nIngrese solo numeros \nMin5. Max10");
		return false;
	}
	if(!(/^[0-9]{5,10}$/.test(nota3))){
		alert("Nota incorrecta \nIngrese solo numeros \nMin5. Max10");
		return true;
	}
	
}