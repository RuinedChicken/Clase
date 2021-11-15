
package excepciones;

import java.util.Scanner;


public class VectorScanner {

    
    public static void main(String[] args)
    {  Scanner x=new Scanner(System.in);
       
       int vec[]=new int[4]; 
       
       System.out.println("vamos a introducir datos: ");
      
       
       try
       {
           for(int i=0;i<vec.length;i++)
            {System.out.println("dime el dato para la posición "+i+"  :") ;
             vec[i]=x.nextInt();}   
                
            for (int i = 0; i <= 4; i++) //no existe la posicion 4 --son del 0 a la 3
              {   System.out.print(vec[i] + "----- "); }
            
        }
        catch (java.lang.ArrayIndexOutOfBoundsException      e1)
            
             {System.out.println("****   error . posicion incorrecta del vector  ***");    }
        
        catch (java.util.InputMismatchException     e2)
            
             {System.out.println("no es un valor correcto");}
           
         
         System.out.println("fin");

           
      }
}

        
        
        
        
        
   