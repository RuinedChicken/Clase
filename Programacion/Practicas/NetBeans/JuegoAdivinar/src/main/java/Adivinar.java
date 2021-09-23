/**
 *
 * @author Luis Manuel Soler Fernández
 */

import java.util.Scanner;

public class Adivinar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Hacer un juego de aciertos en el que un usuario
        introduzca un número y otro tenga varios intentos para adivinarlo.
        
        Ante cada intento fallido el programa nos dirá si era más alto o más bajo.
        Contaremos cuántos intentos llevamos. */
        
        /*Caracteristicas adicionales:
        Puntuacion?
        Tiempo?
        Maximo de intentos?
        Maximo de intentos = puntuacion maxima
        puntuacion final = puntuacion maxima - intentos
        facil/dificil
        */
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Por favor, introduce el número entero que quieres que se adivine");
        int numeroSecreto = lector.nextInt();
        int numeroIntento;
        int i = 1;
        int salir = 0;
        int maximoIntentos;
        int puntuacionFinal;
        
        // System.out.println("Por favor, selecciona una dificultad:\n");
        System.out.println("1. Fácil\n2. Difícil");
        do{
            System.out.println("Introduce un número para intentar adivinar el número secreto: ");
            numeroIntento = lector.nextInt();
            if (numeroIntento == numeroSecreto){
                System.out.println("¡Felicidades! Adivinaste el número " + numeroSecreto + ". Has necesitado " + i +" intentos.");
                ++salir;
            }else if (numeroIntento < numeroSecreto){
                System.out.println("¡Incorrecto! El número secreto es mayor. Este es tu intento número: " + i + ".");
                ++i;
            }else if (numeroIntento > numeroSecreto){
                System.out.println("¡Incorrecto! El número secreto es menor. Este es tu intento número: " + i + ".");
                ++i;
            }
        }while (salir != 1);
        
        
    }
    
}
