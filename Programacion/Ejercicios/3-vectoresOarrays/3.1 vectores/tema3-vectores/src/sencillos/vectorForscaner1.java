package sencillos;

import java.util.*;

public class vectorForscaner1 {

    
     public static void main(String[] args) 
   {Scanner x=new Scanner(System.in);
    
    int vec[]={4,3,10,7};   //lo lleno directamente    
    int vec2[]=new int[4]; //lo llenaré por teclado
    
            
      System.out.println("vamos a introducir datos: ");
      
      for(int i=0;i<4;i++)
         {System.out.println("dime el dato para la posición "+i+"  :") ;
          vec2[i]=x.nextInt();}
      
      System.out.println("vec---vec2");
      
      for (int i=0;i<vec.length;i++)
      { System.out.println(vec[i]+"-----"+vec2[i]); 
       }
          
   }
}

