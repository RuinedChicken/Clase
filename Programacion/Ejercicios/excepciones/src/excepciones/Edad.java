
package excepciones;

import java.util.Scanner;


public class Edad {

    
    public static void main(String[] args)
    {  Scanner x=new Scanner(System.in);
       
       int num;
       
        try
          {
            System.out.println("dime tu edad correctamente o tendrás 90");
            num=x.nextInt();
          }
        
        catch (java.util.InputMismatchException     pepito)
            
           {  
             num = 90;
           }
        
                 
         System.out.println("la edad es :"+ num);

           
      }
}

        
        
        
        
        
   