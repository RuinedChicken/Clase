/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones_variables_locyglob;

/**
 * 
 * 
 * 
 *
 * @author Usuario
 */
public class Calculadora_var_class {
   static int a=6,b=9;
    
    
   public static   int  suma ()
  {
     return (a+b);
  }   
    
     public static  int  resta ()
             
  {
      int aux=a-b;
     return aux;
  } 
         
    
    
  public static void main(String[] args) 
    {int resul;
     resul=suma();
    System.out.println("la suma es : " +resul);
    
    System.out.println("la resta es : " + resta());
     
     
      
 
     
    }   
      
    
    
    
    
    
}
