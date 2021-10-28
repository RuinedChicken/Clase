
public class NumerosPrimos {
        public static void main(String[] args){
            int vectorPrimos[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
            int i = 0, j = 0;
            boolean esPrimo = true;

            int a = 13;

            for( i = 0; i<vectorPrimos.length; i++){
                for (j = 2; j<vectorPrimos.length && esPrimo; j++){
                    if (vectorPrimos[i] % j == 0){
                        esPrimo = false;
                }
                if(esPrimo){
                    System.out.println(vectorPrimos[i] + " Es primo");
                }
            }
            esPrimo = true;
        }
    }
}

