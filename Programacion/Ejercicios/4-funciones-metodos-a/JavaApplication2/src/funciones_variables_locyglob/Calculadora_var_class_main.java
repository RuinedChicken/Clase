/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones_variables_locyglob;

/**
 *
 * @author Usuario
 */


public class Calculadora_var_class_main {
    
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
    
       public static   int  suma (int uno,int dos)
  {
     return (uno+dos);
  }   
    
     public static  int  resta (int uno, int dos)
             
  {
      int aux=(uno-dos);
     return aux;
  } 
         
    
    
  public static void main(String[] args) 
    {int a=5,b=2,resul;
     resul=suma(a,b);
    System.out.println("la suma del main es: " +resul);
    
    System.out.println("la resta del main es : " + resta(a,b));
     
     resul=suma();
    System.out.println("la suma del class es : " +resul);
    
    System.out.println("la resta del class es : " + resta());
     
    }     
 
    
    
    
}
