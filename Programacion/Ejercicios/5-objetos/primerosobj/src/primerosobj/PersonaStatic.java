
package primerosobj;


public class PersonaStatic {
  
  /*edad y altura seran privados
     * no hay acceso desde fuera de la clase
     * sus valores se controlarán desde los metodos 
     * set y get
     */
  private static int edad;
  private static float altura;
    
    
   /* damos valores a los datos*/ 
   public static   void setedad (int x)
   {
    if (x>=0 && x<=110) edad=x;
  }   
    
    public static  boolean  setaltura(float x)
             
  {   if (x>=0) {altura=x;
                 return true;}
      else return false;
  
  } 
    /*devolvemos los valores para posibles consultas*/
       public static   int  getedad ()
  {
     return edad;
  }   
    
     public static  float  getaltura ()
          
  {
      return altura;
  } 
         
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
