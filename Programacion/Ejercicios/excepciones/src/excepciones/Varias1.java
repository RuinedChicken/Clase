
package excepciones;

import java.util.Scanner;


public class Varias1 {

    
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
            
          }
        
        catch (java.lang.ArithmeticException     pepito)
            
           { division=0; }            
        
        
        catch (java.util.InputMismatchException     juanito)
            
           { division=-1;}
           
        
         System.out.println("la division es :"+ division);       
         System.out.println("fin");

           
      }
}

        
        
        
        
        
   