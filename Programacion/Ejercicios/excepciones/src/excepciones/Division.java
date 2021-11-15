
package excepciones;

import java.util.Scanner;


public class Division {

    
    public static void main(String[] args)
    {  Scanner x=new Scanner(System.in);
       
       int num1,num2,division=0;
       
        try
          {
            System.out.println("dime dividendo ") ;
            num1=x.nextInt();
            System.out.println("dime divisor ") ;
            num2=x.nextInt();
            division=num1/num2;
            System.out.println("la division es :"+ division);
          }
        
        catch (java.lang.ArithmeticException     pepito)
            
           { System.out.println("no se puede dividir por 0"); 
            }
        
                 
         System.out.println("fin");

           
      }
}

        
        
        
        
        
   