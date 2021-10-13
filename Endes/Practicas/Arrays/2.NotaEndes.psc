Proceso NotaEndes
	Definir alumno, nota, input, i Como Entero;
	i <- 0;
	Dimension alumno[25];
	Dimension nota[25];
	
	Para i<-0 Hasta 24 Con Paso 1 Hacer
		nota[i]<-5;
		alumno[i]<-nota[i];
	FinPara

	
	Escribir "Selecciona un alumno cuya nota quieras conocer";
	Leer input;
	
	Escribir "El alumno en la posicion ", input, " tiene un ", nota[input];
	
FinProceso
