
package sencillos;

public class vectorTmetodos {

    /**
     * para estudiar mas adelante conjuntamente con el tema de métodos */
    
    static int vec1[]=new int[8];


      static void rellenar()

      {for (int i=0;i<vec1.length;i++)
       vec1[i]=(int)(Math.random()*10);
          }
      
      
      static void verascendente()

      {for (int i=0;i<vec1.length;i++)
          System.out.println("a---"+vec1[i]);
          }

      
      static void verdescendente()

      {for (int i=vec1.length-1;i>=0;i--)
          System.out.println("d---"+vec1[i]);
          }
      
      static void salto(int s)

         {for (int i=0;i<vec1.length;i+=s)
          System.out.println("v["+i+"]="+vec1[i]);
          }      
              
       static int suma()
       {int suma=0 ;
        for (int i=vec1.length-1;i>=0;i--)
          suma=suma+vec1[i];
        return suma;
        }

     public static void main(String[] args) 
     {
           rellenar();
           verascendente();
           verdescendente();
           salto(3);
           System.out.println("la suma de los elementos es "+suma());
           



 

}}

    
