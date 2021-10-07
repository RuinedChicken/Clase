/*
 * 20.	Escribir números aleatorios (entre 1 y 10)  en pantalla hasta que salga el 5, 
 *  contabilizando los que hay, su suma total y su media.

 */
package anteriores;

public class ContarSumarFor {

    public static void main(String[] args) {
        int num, cont, suma=0, media;
        
        System.out.println("7 Números aleatorios entre 1 y 10 ");
      
        
        for(cont=1 ; cont<=7 ; cont++ )
        {   
            num = (int)(((Math.random()*10)+1));
            System.out.print(num + "  ");
            
            suma = suma + num;
          
        }
        media= suma/cont;
        System.out.println();

        System.out.println("La suma de los 7 numeros es " + suma);
        System.out.println("La media  es " + media);
    }
    
}
