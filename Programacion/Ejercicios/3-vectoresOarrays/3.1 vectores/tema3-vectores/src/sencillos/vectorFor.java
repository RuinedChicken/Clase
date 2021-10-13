package sencillos;

public class vectorFor {

    
     public static void main(String[] args) 
   {
    int suma=0;
    int vec[]=new int[4];       //a,b,c,d
    vec[0]=4;                   //a=4
    vec[1]=3;                   //b=3;
    vec[2]=10;                  //c=10
    vec[3]=7;                   //d=7;
    
    
            
      System.out.println("los datos son : ");
      
      for(int i=0;i<4;i++)
           System.out.print( vec[i]+"  ");
             
      for (int i=0;i<vec.length;i++)
             suma=suma+vec[i];
        
      System.out.println(); 
      System.out.println("y su  suma  es "+ suma);
      
          
   }
}

