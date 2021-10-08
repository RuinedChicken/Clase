Proceso NotaEndes
	Definir alumno, input, nota, notaNueva Como Entero;
	Dimension alumno[25];
	Dimension nota[25];
	
	
	Escribir "Introduce el número de alumno cuya posición ";
	Escribir "quieres modificar.";
	Leer input;
	
	Escribir "Introduce su nota nueva";
	Leer notaNueva;
	
	alumno[input] <-notaNueva;
	
	Escribir alumno[input];
	
	
FinProceso
