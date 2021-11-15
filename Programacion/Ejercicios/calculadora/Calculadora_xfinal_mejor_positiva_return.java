/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones_variables_locyglob;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class Calculadora_xfinal_mejor_positiva_return {
    
     static int datoUno=0,datoDos=0; 
    


    public static   int  suma (int x)
  {
     return (x+datoUno+datoDos);
  }    
     
    
     
    public static boolean Uno(int x)
    {  if (x>=0)
        {datoUno=x;
        return true;
        }
      return false;
    }
    
    
    
     public static boolean Uno()
    {  Scanner sc=new Scanner(System.in); 
        
        try
          {   int aux=sc.nextInt();
              return Uno(aux);
              

          }
        
        catch (java.util.InputMismatchException     pepito)
            
           {return false;}
    }
    public static boolean Dos(int x)
    {   if (x>=0)
         {datoDos=x;
         return true;
          }
        return false;
    } 
    public static boolean Dos()
    {Scanner sc=new Scanner(System.in);        
        try
          {
            int aux=sc.nextInt();
            return    Dos(aux);

          }
        
        catch (java.util.InputMismatchException     pepito)
            
           {return false;}
    }
    
    
  public static void main(String[] args) 
    {boolean bien=false; 
    
    
          System.out.println("Dame un valor positivo para el dato nº 1 :");
          
         Uno();  //sin control, sin tener en cuenta el return
     
            System.out.println("Dame un valor positivo para el dato nº 2 :");
           
          do{     
         
              bien=Dos();    //con control teniendo en cuenta el return
         
           } while(!bien);
    
        System.out.println("Los valores de los datos son "+datoUno+ " y "+datoDos);
        System.out.println("la suma con el numero 20 es  " + suma(20));
     
        
    
    
    }     
 
    
    
    
}
