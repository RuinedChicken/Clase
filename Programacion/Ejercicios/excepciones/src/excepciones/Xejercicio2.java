
package excepciones;

import java.util.Scanner;


public class Xejercicio2 {

    
    public static void main(String[] args)
    {  Scanner x=new Scanner(System.in);
      
    //llenar el vector con datos correctos siguiendo el ejemplo de la clase VariasMejor
    // x.nextLine(); usar para limpiar los caracteres de entrada cuando no se para el programa a pedir datos al usuario
              
    
       int vec[]=new int[4]; 
       
       System.out.println("vamos a introducir datos: ");
      
       
       for(int i=0;i<vec.length;i++)
            {System.out.println("dime el dato para la posición "+i+"  :") ;
             vec[i]=x.nextInt();}   
                
       for (int i = 0; i < 4; i++) 
            {   System.out.print(vec[i] + "----- "); }
            
               
       System.out.println("fin");

         
           
      }
}

        
        
        
        
        
   