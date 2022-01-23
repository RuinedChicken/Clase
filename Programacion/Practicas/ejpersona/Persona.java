import java.util.regex.Pattern;

class Persona{
    private int edad;
    private float altura;
    private String dni;

    public String toString(){
        return "Edad: "+this.edad+" Altura: "+this.altura+"cm "+"DNI: "+this.dni;
    }

    //  SETTERS
    public void setEdad(int a){
        if (a>0 && a <= 130){
            edad = a;
        }else{
            System.out.println("Edad: valor incorrecto.");
        }
    }

    public void setAltura(float a){
        if (a>0){
            altura = a;
        }else{
            System.out.println("Altura: Valor incorrecto.");
        }
    }

    public boolean setDNI(String a){  
        /* Comprobamos que los 8 primeros caracteres del dni sean numeros y que
        el ultimo sea una letra */      
        if (a.length() != 9 || !Pattern.compile("[0-9]{8}[a-zA-Z]{1}").matcher(a).find()){
            System.out.println("DNI: Valor incorrecto.");
            return false;
        }else{
            dni = a;
            return true;
        }
    }

    // GETTERS

    public int getEdad(){
        return edad;
    }

    public float getAltura(){
        return altura;
    }

    public String getDNI(){
        return dni;
    }
}