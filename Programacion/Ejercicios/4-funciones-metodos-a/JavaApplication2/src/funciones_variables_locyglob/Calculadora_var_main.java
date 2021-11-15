/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones_variables_locyglob;

/**
 *
 * @author Usuario
 */
public class Calculadora_var_main 
{
    
    
    public static   int  suma (int uno,int dos)
  {
     return (uno+dos);
  }   
    
     public static  int  resta (int a, int b)
             
  {
      int aux=(a-b);
     return aux;
  } 
         
    
    
  public static void main(String[] args) 
    {int a=5,b=2,resul;
     resul=suma(a,b);
    System.out.println("la suma es : " +resul);
    
    System.out.println("la resta es : " + resta(a,b));
    System.out.println("la resta es : " + resta(23,11)); 
     
      
 
     
    }   
   
    
}
