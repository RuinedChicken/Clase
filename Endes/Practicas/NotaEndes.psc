Proceso NotaEndes
	Definir alumno, input, nota, notaNueva Como Entero;
	Dimension alumno[25];
	Dimension nota[25];
	
	
	Escribir "Introduce el n�mero de alumno cuya posici�n ";
	Escribir "quieres modificar.";
	Leer input;
	
	Escribir "Introduce su nota nueva";
	Leer notaNueva;
	
	alumno[input] <-notaNueva;
	
	Escribir alumno[input];
	
	
FinProceso
