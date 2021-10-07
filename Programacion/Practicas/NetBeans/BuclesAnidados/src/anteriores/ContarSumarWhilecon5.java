/*
 * 20.	Escribir números aleatorios (entre 1 y 10)  en pantalla hasta que salga el 5, 
 *  contabilizando los que hay, su suma total y su media.

 */
package anteriores;

public class ContarSumarWhilecon5 {

    public static void main(String[] args) {
        int num=0, cont=0, suma=0, media;
        
        System.out.println("Números aleatorios entre 1 y 10 hasta que salga un 5");
         System.out.println("contabilizando  el 5");
         
         

        
        while (num!=5){
             num = (int)(((Math.random()*10)+1));  
            System.out.print(num + "  ");
            cont++;
            suma = suma + num;
          
        }
        media= suma/cont;
        System.out.println();
        System.out.println("Han aparecido " + cont + " números");
        System.out.println("La suma de todos ellos es " + suma);
        System.out.println("La media de todos ellos es " + media);
    }
    
}
