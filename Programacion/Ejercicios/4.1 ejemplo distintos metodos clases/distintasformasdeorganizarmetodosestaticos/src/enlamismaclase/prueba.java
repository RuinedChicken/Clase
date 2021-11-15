
package enlamismaclase;


public class prueba
{

    public static  int  potencia(int b,int e)
    {int i, resul;
      resul=b; 
      
      for(i=1;i<e;i++)  resul=resul*b;
      
      return resul;
    }
    
    public static void main(String[] args)
    {
        
        int a=2,b=5;
        System.out.println("la potencia de "+a +" elevado a "+b+" es "+ potencia(a,b));
       
    }
}
