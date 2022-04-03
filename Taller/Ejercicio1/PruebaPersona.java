package Ejercicio1;

public class PruebaPersona {
     
    public static void main(String [] args){
         
         Persona datop1 = new Persona("#1", "Julian","Hernandez",1,1,2004,17,"Calle9Numero12-78","Calle87Numero44-23");
         datop1.Datos();
         
         Persona datop2 = new Persona("#2", "Yaliana","Jimenez",13,3,2006,16,"Calle4Numero75-65","Calle13Numero75-36");
         datop2.Datos();
         
         Persona datop3 = new Persona("#3", "David","Ospino",17,4,2003,19,"Calle33Numero35-22","Calle87Numero47-55");
         datop3.Datos();
         
         Persona datop4 = new Persona("#4", "Leidys","Hernandez",16,6,2005,20,"Calle12Numero77-14","Calle87Numero74-32");
         datop4.Datos();
     }
}