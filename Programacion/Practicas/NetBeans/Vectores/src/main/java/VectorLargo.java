
public class VectorLargo {

    public static void main(String[] args) {
        /* int vectorLargo[] = new int [365];
        int i;
        
        for (i = 0; i < vectorLargo.length; i ++){
            System.out.println(vectorLargo[i] + " ");
        }*/
        
        int suma = 0, media = 0, i = 0;
        
        int vectorDefinido[] = {1, 2, 3000, 4, 5, 6, 400, 7, 8, 900, 9}; // 10
        
        int numeroMayor = vectorDefinido[0];
       
        
        for (i = vectorDefinido.length - 1; i >=0; i--){
            System.out.println(vectorDefinido[i] + " ");
            if (vectorDefinido[i] > numeroMayor){
                numeroMayor = vectorDefinido[i];
                System.out.println("El numero mayor por ahora es: "+numeroMayor);
            }
        }
        
        System.out.println("El numero de mas valor del vector finalmente es " + numeroMayor);
        
    }
    
}
