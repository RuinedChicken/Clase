import java.util.Scanner;

/*Diseñar una aplicación que declare una tabla de 10 elementos enteros.
Leer mediante el teclado 8 números. Después se debe pedir un número y una posición,
insertarlo en la posición indicada, desplazando los que estén detrás.*/

public class Main {

    public static void main(String[] args) {
        //Inicializamos un Array de tamaño 10
        int v[]= new int [10];
        int posicion, n;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<v.length-2;i++){
            System.out.println("Dime el elemento "+(i+1)+" del vector");
            v[i] = sc.nextInt();
        }
        
        System.out.println("Dime una posición en la que quieres meter el número que queda: ");
        posicion=sc.nextInt();
        System.out.println("Dime el número que queda: ");
        n=sc.nextInt();
        
        for(int i=v.length-posicion-1;;i++){
            System.out.println(v[i-1]);
        }

    }    
}
