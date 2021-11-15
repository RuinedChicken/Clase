
package entrada;


        import java.io.*; /*necesario para el uso de sentencias de introduccion*/

public class entrada {

    
 public static void main(String[] args) 
{
     BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
  

      String s="";
      int a=0;
      float b=0.0f;
  
         System.out.println("introduce un nombre : ");
              
             try { 
      
                       s=teclado.readLine(); 
                       System.out.println("has introducido  "+s);
              }
              

              catch(java.io.IOException errorintroduccion) {System.out.println("error en la introduccion :"); }
              
          System.out.println("introduce un numero entero : ");
              try { 
      
                        s=teclado.readLine();
                       a=Integer.parseInt(s);
                       System.out.println("has introducido  "+a);
              }
              

              catch(java.io.IOException errorintroduccion) {System.out.println("error en la introduccion :"); }
              catch (java.lang.NumberFormatException otroerror) {System.out.println("introduce los numeros adecuados :");}
              
                  
              
 
     System.out.println("introduce un numero flotante : ");
              try { 
      
                        s=teclado.readLine();
                       b=Float.parseFloat(s);
                       System.out.println("has introducido  "+b);
              }
              

              catch(java.io.IOException errorintroduccion) {System.out.println("error en la introduccion :"); }
              catch (java.lang.NumberFormatException otroerror) {System.out.println("introduce los numeros adecuados :");}             
    }
}

