Proceso MultiDimension
	// cambiar filas por columnas
	
	definir vec, i, j, input Como Entero;
	
	dimension vec[4,3];
	
	// 1 2 3 4
	// 5 6 7 8
	// 1 2 3 4
	
	//girarla, matriz traspuesta
	
	// loop de lectura
	Para i<-0 Hasta 3 Con Paso 1 Hacer
		Escribir "Dime numeros para rellenar el array";
		Leer input;
		vec[i,j]<-input;
	FinPara
	
	
	
	
	
FinProceso
