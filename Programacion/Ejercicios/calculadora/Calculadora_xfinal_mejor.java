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

public class Calculadora_xfinal_mejor {
    
     static int datoUno=0,datoDos=0; 
    
    


    
    public static   int  suma (int x)
  {
     return (x+datoUno+datoDos);
  }    
     

   
         
    public static void Uno(int x)
    {datoUno=x;}
    
    public static void Dos(int x)
    {datoDos=x;}
    
     public static void Uno()
    {  Scanner sc=new Scanner(System.in); 
    
    
    try
          {
            datoUno=sc.nextInt();

          }
        
        catch (java.util.InputMismatchException     pepito)
            
           {}
    }
     
    public static void Dos()
    {Scanner sc=new Scanner(System.in);        
       try
          {
            datoDos=sc.nextInt();

          }
        
        catch (java.util.InputMismatchException     pepito)
            
           {}
    }
    
    
  public static void main(String[] args) 
    {
     Uno(5);
     
        System.out.println("Dame un valor para el dato nº 2 :");
        
     Dos();
    
        System.out.println("Los valores de los datos son "+datoUno+ " y "+datoDos);
        System.out.println("la suma con el numero 20 es  " + suma(20));
     
        
    
    
    }     
 
    
    
    
}
