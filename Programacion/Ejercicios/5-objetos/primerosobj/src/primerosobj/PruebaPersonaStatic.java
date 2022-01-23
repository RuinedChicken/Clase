/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package primerosobj;

/**
 *
 * @author Usuario
 */
public class PruebaPersonaStatic {
   public static void main(String[] args) 
    {
    System.out.println("los datos de inicio son: " + PersonaStaticpublic.edad +" y "+PersonaStaticpublic.altura);
    PersonaStaticpublic.edad=7;
    PersonaStaticpublic.altura=1.09f;
    System.out.println("La persona tiene  "+ PersonaStaticpublic.edad+" años");
    System.out.println("Su estatura es "  + PersonaStaticpublic.altura);
    if (PersonaStaticpublic.mayoredad())  System.out.println("es mayor de edad");
    else   System.out.println("es menor de edad");
     PersonaStaticpublic.cumple();
    System.out.println("la edad despues de cumplir años es  : " +PersonaStaticpublic.edad);
      
    System.out.println("----------------------");
    /*   System.out.println("los datos de inicio son: " + PersonaS.edad +" y "+ PersonaS.altura);
    no hay acceso al ser privados */
    PersonaStatic.setedad(18);
    PersonaStatic.setaltura(1.80f);
    System.out.println("La persona tiene  "+ PersonaStatic.getedad()+" años");
    System.out.println("Su estatura es "  + PersonaStatic.getaltura());
    
    if (PersonaStatic.mayoredad())  System.out.println("es mayor de edad");
    else   System.out.println("es menor de edad");
     PersonaStatic.cumple();
    System.out.println("la edad despues de cumplir años es  : " +PersonaStatic.getedad());
    }   
}
