Proceso Estatura
	Definir alumno, i Como Entero;
	Definir altura Como Real;
	Definir media como Real;
	i <- 0;
	media <-0;
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
	
	Escribir "La media de altura de la clase es ", media,"cm";
	
FinProceso
