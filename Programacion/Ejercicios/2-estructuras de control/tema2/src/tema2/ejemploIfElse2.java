
package tema2;
import java.util.Scanner;  

      

public class ejemploIfElse2 {

   
    public static void main(String[] args)     
    {       
        Scanner teclado = new Scanner(System.in);     
        
        int edad;
        System.out.println("dime tu edad:");
        edad=teclado.nextInt();
        
        if ( edad>=18 )
        {   System.out.println("eres mayor de edad");
            System.out.println("y ten mucho cuidado");
        }
        else
        { System.out.println("eres menor de edad");
        }
        
          System.out.println("hemos terminado");
        
        
        
    }
    
}

        

