package sencillos;

public class vectorSoluFallo {
    

    /* para ver mas tarde */
    
    
     public static void main(String[] args) 
     {

        float vs[]=new float[6];

        try 
        {
          vs[1]=150f;
          vs[6]=34;
               
           for (int i = 0; i <= 6; i++)
           {
             System.out.print(vs[i] + "----- ");
           }
        }

        catch (java.lang.ArrayIndexOutOfBoundsException      pepe)
             {System.out.println("*error error   error ************************************");
             }
         
         System.out.println("fin");

           
      }
}
