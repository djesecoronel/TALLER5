package Ejercicio1;

public class Persona {
    public String num;
    public String nombre;
    public String apellido;
    public int day;
    public int month; 
    public int year;
    public int edad;
    public String direccion1;
    public String direccion2;
    
     public Persona(String num, String nombre, String apellido, int day, int month,int year, int edad, String direccion1, String direccion2){
        this.num = num;
        this.nombre = nombre;
        this.apellido = apellido;
        this.day = day;
        this.month= month;
        this.year = year;
        this.edad = edad;
        this.direccion1 = direccion1;
        this.direccion2 = direccion2;
        
     }
     
     public void Datos(){
        System.out.println("//////INFORMACION PERSONAL//////");
         System.out.println("Persona "+num);
        System.out.println("Nobre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Fecha de nacimiento: "+day+"/"+month+"/"+year);
        System.out.println("Tiene "+edad+" años");
        System.out.println("Direccion del dominicilio "+direccion1);
        System.out.println("Direccion del trabajo "+direccion2+"\n");
     }
}