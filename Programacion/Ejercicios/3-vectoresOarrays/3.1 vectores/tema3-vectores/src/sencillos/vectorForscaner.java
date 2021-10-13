package sencillos;

import java.util.*;

public class vectorForscaner {

    
     public static void main(String[] args) 
   {  Scanner x=new Scanner(System.in);
      int i;
      
      int vec[]=new int[4]; //lo llenaré por teclado
               
      System.out.println("vamos a introducir datos: ");
      
      for(i=0;i<4;i++)
         {System.out.println("dime el dato para la posición "+i+"  :") ;
          vec[i]=x.nextInt();}
      
      System.out.println("Los datos introducuidos son ");
      
      for (i=0;i<vec.length;i++)
         System.out.println("-----"+vec[i]); 
       
      System.out.println("Los datos introducidos en orden inverso son ");
      
      for (i=vec.length-1;i>=0;i--)
         System.out.println("-----"+vec[i]); 
      
    }
}

