
package primerosobj;


public class PersonaStaticpublic {
  
  /*edad y altura son datos representativos 
     y como se tratan en todos los métodos 
     los hacemos globales
     Al igual que los métodos deben ser static
     */
  public static int edad;
  public static float altura;
    
     
    
         
    public static  boolean  mayoredad()
             
  {
      if (edad>=18) return true;
      else return false;
  } 
    public static  void  cumple()
             
  { 
      edad++;
      System.out.println("felicidades por tu "+ edad+"º cumpleaños");
  } 
    
    
    
     
 
    
}
