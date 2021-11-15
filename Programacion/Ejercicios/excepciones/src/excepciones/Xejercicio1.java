
package excepciones;

import java.util.Scanner;


public class Xejercicio1 {

    
    public static void main(String[] args)
    {  Scanner x=new Scanner(System.in);     
     // siguiendo el ejemplo de VariasMejor mejorar el programa para que se pueda realizar la division
     // x.nextLine(); usar para limpiar los caracteres de entrada cuando no se para el programa a pedir datos al usuario              
               
       int num1,num2,division=0;
      
            System.out.println("dime dividendo ") ;
            num1=x.nextInt();
            System.out.println("dime divisor ") ;
            num2=x.nextInt();
            division=num1/num2;                         
       
         System.out.println("la division es :"+ division);       
         System.out.println("fin");
         
      }
}

        
        
        
        
        
   