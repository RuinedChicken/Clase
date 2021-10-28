/**
 *
 * @author Luis Manuel Soler Fernández
 */

/* El siguiente es un juego de aciertos en el que un usuario
introduce un número y otro tiene varios intentos para adivinarlo.

Ante cada intento fallido el programa nos dirá si el número a
adivinar es más alto o más bajo. Contaremos cuántos intentos llevamos.

Cuanto más alto sea el número a adivinar más puntos podemos sacar.  */

import java.util.Scanner;

public class Adivinar {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        
        System.out.println("Por favor, introduce el número entero positivo que quieres que se adivine:");
        int numeroSecreto = 0;
        int errorInput;
        
        // El número a adivinar.
        
        do{
            try{
                numeroSecreto = lector.nextInt();
                if (numeroSecreto <0){
                    System.out.println("Por favor, introduce un número positivo:");
                }
                
                errorInput = 0;
            }catch (Exception e){
                        System.out.println("Error, no has introducido un número entero. Inténtalo de nuevo: ");
                        lector.nextLine();
                        errorInput = 1;
                    }
        }while (errorInput != 0 || numeroSecreto <0);
        
        // El número con el que intentamos adivinar.
        int numeroIntento;
        int i = 1;
        int salir = 0;
        int puntuacionMaxima = numeroSecreto - (i * 2);
        int puntuacionObtenida;
        
        do{            
            System.out.println("Introduce un número para intentar adivinar el número secreto: ");
            numeroIntento = lector.nextInt();
            if (numeroIntento == numeroSecreto){
                System.out.println("¡Felicidades! Adivinaste el número " + numeroSecreto + " en tu intento número: " + i + "\n");
                ++salir;
            }else if (numeroIntento < numeroSecreto){
                System.out.println("¡Incorrecto! El número secreto es mayor. Este es tu intento número: " + i + "\n");
                ++i;
            }else if (numeroIntento > numeroSecreto){
                System.out.println("¡Incorrecto! El número secreto es menor. Este es tu intento número: " + i + "\n");
                ++i;
            }
        }while (salir != 1);
        
        lector.close();
        puntuacionObtenida = numeroSecreto - (i * 2);
               
        System.out.println("Tu puntuación final es: " + puntuacionObtenida + "\n");
        System.out.println("La puntuación máxima es: " + puntuacionMaxima);
    }
    
}
