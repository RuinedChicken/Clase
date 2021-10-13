Proceso PlazasAvion
	
	Definir i, plaza, contadorTurista, contadorVip Como Entero;
	Definir plazasTotal, plazaTurista, plazaVip Como Caracter;
	
	Dimension plazaTurista[120];
	Dimension plazaVip[80];
	i<- 0;
	contadorTurista<-0;
	contadorVip<-0;

	Repetir		
		plaza<-azar(2);
		Si plaza = 0 Y contadorTurista < 120 Entonces
			plazaTurista[contadorTurista]<-"Turista";
			contadorTurista<- contadorTurista+1;
		FinSi	
		Si plaza = 1 Y contadorVip < 80 Entonces
			plazaVip[contadorVip]<-"VIP";
			contadorVip<- contadorVip+1;
		FinSi
		
		i<- i+1;
	Hasta Que i = 100;
	
	Escribir "Ya no queda tiempo para reservar. El avion despega con ", contadorTurista, " plazas de turista ocupadas.";
	Escribir "Y ", contadorVip, " plazas Vip ocupadas.";
	
	
FinProceso
