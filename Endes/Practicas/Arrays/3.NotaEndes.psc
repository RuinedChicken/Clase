Proceso NotaEndesMejorada
	Definir alumno, nota, input, i Como Entero;
	Definir media como Real;
	i <- 0;
	media <-0;
	Dimension alumno[25];
	Dimension nota[25];
	
	Para i<-0 Hasta 24 Con Paso 1 Hacer
		nota[i]<-5;
		alumno[i]<-nota[i];
		media <- media + nota[i];
	FinPara
	
	media<- media / 25;
	
	Escribir "Selecciona un alumno cuya nota y posicion quieras conocer";
	Leer input;
	
	Escribir "El alumno en la posicion ", input, " tiene un ", nota[input], ". La media del curso es ", media;

	
FinProceso
