/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerfunciones;

/**
 *
 * @author Administrador
 */
public class prueba {

    
     

    public static void main(String[] args) {
     int a=5,b=2,radio=3;
     
     double elevado;
     
    System.out.println("area triangulo : " +Areas.triangulo(a,b));
    System.out.println("area rectangulo : " +Areas.rectangulo(a,b));
    
    System.out.println("area circulo: " + Areas.circulo(radio));
    
     elevado = M.elevar(3, 3);
     
        System.out.println(elevado);
        // TODO code application logic here
    }
}
