Proceso Estatura
	Definir alumno, i, cuantosSuperior, cuantosInferior Como Entero;
	Definir altura Como Real;
	Definir media como Real;
	i <- 0;
	media <-0;
	cuantosInferior<- 0;
	cuantosSuperior<- 0;
	Dimension alumno[30];
	Dimension altura[30];
	
	Para i<-0 Hasta 10 Con Paso 1 Hacer
		altura[i]<-175;
	FinPara
	
	Para i<-10 Hasta 20 Con Paso 1 Hacer
		altura[i]<-180;
	FinPara
	
	Para i<-21 Hasta 29 Con Paso 1 Hacer
		altura[i]<-195;
	FinPara
	
	Para i<-0 Hasta 29 Con Paso 1 Hacer
		alumno[i]<-altura[i];
		media<- media + altura[i];
	FinPara
	
	media<- media / 30;
	
	Para i<-0 Hasta 29 Con Paso 1 Hacer
		Si altura[i]<media Entonces
			cuantosInferior<- cuantosInferior +1;
		SiNo
			cuantosSuperior<- cuantosSuperior +1;
		FinSi
	FinPara
	
	Escribir "La media de altura de la clase es ", media,"cm";
	Escribir "Hay ", cuantosInferior, " alumnos por debajo de la media.";
	Escribir "Hay ", cuantosSuperior, " alumnos por encima de la media.";
	
FinProceso
