
package excepciones;

import java.util.Scanner;


public class VariasMejor {

    
    public static void main(String[] args)
    {  Scanner x=new Scanner(System.in);
       
       int num=0;
       boolean correcto;
       
       
       do{           
          try
           {
            System.out.println("dime un numero ") ;
            num=x.nextInt();
            correcto=true;
           }
        
          catch (java.util.InputMismatchException     e)            
            { System.out.println("el numero debe ser entero, volvemos a introducir");
              correcto=false;  
              
              x.nextLine();//  para lmpiar los caracteres de entrada y funcionar bien
            }      
           
          }while (!correcto);
       
       
         System.out.println("el numero introducido es :"+num);       
        

           
      }
}

        
        
        
        
        
   