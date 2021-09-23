
package tema2;
import java.util.*;

public class ejemploTodo {

    public static void main(String[] args)
    
    {
         int a=1,op;
         Scanner x=new Scanner(System.in);
         System.out.println("dime opcion 1 o 2 o 3:");
         op=x.nextInt();
         
          if (op==1)
          {while (a<=10)
              {  System.out.println("--"+a);
                  a++;         
             }
          }
          else  if (op==2)
          { a=2;
            while (a<=20)             
            {
              System.out.println("--"+a);
              a=a+2;        
            }
        
          }
         else
          { for (a=3 ; a<33; a=a+3)
                  System.out.println("--"+a);
              }
}
}
