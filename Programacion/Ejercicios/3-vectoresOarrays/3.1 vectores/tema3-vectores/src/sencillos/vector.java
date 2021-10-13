package sencillos;

public class vector {

    
     public static void main(String[] args) 
   {
    int suma=0;
    int vec[]=new int[4];       //a,b,c,d
    vec[0]=4;                   //a=4
    vec[1]=3;                   //b=3;
    vec[2]=10;                  //c=10
    vec[3]=7;                   //d=7;
    
    suma=vec[0]+vec[1]+vec[2]+vec[3]; //suma=a+b+c+d;
    
    System.out.println("los datos son : " +vec[0] +"   "+vec[1]+"   "+vec[2]+"   "+vec[3]);
    System.out.println("y su  suma  es "+ suma);
    
    
   }
}

