class Prueba{

    /*public Object cualEsMayor(Object a, Object b){
        if (a > b){
            return a;
        }
    }*/
    public static void main(String[] args) {

 
        Persona manuel = new Persona();
        Persona pepe = new Persona();

        manuel.setEdad(20);
        manuel.setAltura(180);
        manuel.setDNI("12345678a");

        pepe.setEdad(60);
        pepe.setAltura(175);
        pepe.setDNI("00000001b");


       System.out.println(manuel);
       System.out.println(pepe);
    }
}