Proceso Alumnado
	
	// queremos saber cuantos alumnos son mayores de edad
	Definir alumnos como Entero;
	Definir i, j Como Entero;
	j <- 0;
	Dimension alumnos[5];
	
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Escribir "Indica edad del alumno: ", i+1;
		Leer alumnos[i];
	FinPara
	
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Escribir "Indica edad del alumno: ", i+1;
		alumnos[i]<- alumnos[i] + 2;
	FinPara
	
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Escribir "Indica edad del alumno: ", i+1;
		Escribir "La edad del alumno ", i+1, " es", alumnos[i];
	FinPara
	
	Mientras alumnos[j] < alumnos[5] Hacer
		Si alumnos[j]  >= 18 Entonces
			Escribir "La edad del alumno ", j+1, " es", alumnos[j];
		FinSi
	FinMientras
FinProceso
