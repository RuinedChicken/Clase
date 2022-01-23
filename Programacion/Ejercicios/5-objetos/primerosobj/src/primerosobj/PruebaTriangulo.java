/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package primerosobj;


public class PruebaTriangulo {
    public static void main(String[] args) 
    { //podemos trabajar con varios triangulos a la vez
      //creamos los triangulos instanciando a clase Triangulo
     
     Triangulo  tri1=new Triangulo();
     Triangulo tri2;
        tri2=new Triangulo();
     
  
    System.out.println("el area del 1º triangulo al principio es  : " + tri1.area());
    System.out.println("el area del 2º triangulo al principio es  : " + tri2.area());
    tri1.setbase(10);
    tri1.setaltura(15);
    tri2.setbase(3);
    tri2.setaltura(8);
    
    
    System.out.println("las areas depues de dar valores son  : " + tri1.area()+" y "+tri2.area());

           
    }    
    
    
}
