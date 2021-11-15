/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package charstring;

/**
 *
 * @author pilarg
 */
public class prueba {

    public static void main(String[] args) {
    // comprobar el siguiente código:   
     // String cads="pepe";
      //char []cadc={'p','e','p','e'};
     String cads=new String();
      char []cadc=new char[30];
      cads="pepe";
      cadc[0]='j';
      cadc[1]='u';
      cadc[2]='a';
      cadc[3]='n';
      System.out.println(cads);
      System.out.println(cadc);
    
     for (int i=0;i<cads.length();i++)
       {
           System.out.println(cads.charAt(i));
       }
     for (int i=0;i<cadc.length;i++)
       {
           System.out.println(cadc[i]);
        } 
     System.out.println("fin")
             
    //investigar los métodos de la clase String         
             
             
}
