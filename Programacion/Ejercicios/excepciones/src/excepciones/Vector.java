
package excepciones;

import java.util.Scanner;


public class Vector {

    
    public static void main(String[] args)
    {         
       int vec[]={5,89,4,51};
        
        try 
        {
            for (int i = 0; i <= 14; i++) //no hay posicion 14 en el vector
              
            {   System.out.print(vec[i] + "----- "); }
            
        }

        catch (java.lang.ArrayIndexOutOfBoundsException      pepe)
            
         {System.out.println("****   error . posicion incorrecta del vector  ***");    }
        
        
         
         System.out.println("fin");

           
      }
}

        
        
        
        
        
   