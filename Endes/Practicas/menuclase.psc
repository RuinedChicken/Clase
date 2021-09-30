Proceso sin_titulo
	
	Definir opc Como Entero;
	
	definir a Como Entero;
	
	Repetir
	
		Escribir "Estas son tus opciones:";
		
		Leer opc;
		
		Si opc !=0 Entonces
			Escribir "Indica valor";
			
			Leer a;
		FinSi
		
			Segun opc Hacer
				1: a<-a+3; Escribir a;
				2: a <-a-3; Escribir a;
				3: a<-a*3; Escribir a;
				De Otro Modo:
					Escribir "Nada que hacer";
			FinSegun
			
		Hasta Que opc = 0;
	
	Escribir "Adios";
	
FinProceso



