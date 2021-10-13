Proceso ArrayCalificaciones
	
	Definir i Como Entero;
	Definir materias, suma Como Entero;
	Dimension materias[10];
	Definir media como Real;
	suma <- 0;
	
	Para i<-0 Hasta 9 Con Paso 1 Hacer
		Escribir "Introduce la calificacion numero ", i;
		Leer materias[i];
	FinPara
	
	Para i<- 0 Hasta 9 Con Paso 1 Hacer
		Escribir materias[i];
		suma <- suma + materias[i];
	FinPara
	media<- suma/10;
	
	Escribir "La media es: ", media;
	
FinProceso
