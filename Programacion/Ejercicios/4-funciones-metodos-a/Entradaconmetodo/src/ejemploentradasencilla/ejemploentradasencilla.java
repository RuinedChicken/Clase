/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploentradasencilla;
      import java.io.*; /*necesario para el nuevo introducir*/

public class ejemploentradasencilla {
    
    
    
    public static int tecladoi()
    {       
       BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));     
       int a;      
       
         try{    
                  
                             
                         a=Integer.parseInt(teclado.readLine()   );
                      
                       
         }           
          catch (  java.lang.NumberFormatException   x){a=0;}   
          catch (  java.io.IOException   x){a=0;}   
         
        return a;

    
    
    }
    
    public static void saludo()
            
    {
        System.out.println("todo va bien, sigue aís fjgdfhgjdfgfhjgdfj");
    }      
    
    
    
    public static void main(String[] args) throws IOException
    {
  
    
      int num1,num2,num3,suma=0;
 
  
         System.out.println("introduce un numero entero : ");
    
        num1=tecladoi();
         saludo();
           System.out.println("introduce otro numero entero : ");
                         
         num2=tecladoi();    
          saludo();
          System.out.println("introduce otro numero entero : ");
         num3=tecladoi();
         saludo();
         suma=num1+num2+num3;
         System.out.println("suma------"+suma);
         
                   
              }
              

              
                  
              }
       
    

