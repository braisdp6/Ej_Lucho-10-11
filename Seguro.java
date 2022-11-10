package EjercicioSeguroCoche;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Seguro {
    public static float tarifaBase = 300;
    public static final int suplemento = 100;
    public static float importeCoste;

    public static String NombreAsegurado;
    public static int Edad, AnosCarnet;
    public static float PrecioCoche;


    //Getters&Setters

    public static String getNombreAsegurado() {return NombreAsegurado;}

    public static void setNombreAsegurado(String nombreAsegurado) {NombreAsegurado = nombreAsegurado;}

    public static int getEdad() {return Edad;}

    public static void setEdad(int edad) {Edad = edad;}

    public static int getAnosCarnet() {return AnosCarnet;}

    public static void setAnosCarnet(int anosCarnet) {AnosCarnet = anosCarnet;}

    public static float getPrecioCoche() {return PrecioCoche;}

    public static void setPrecioCoche(float precioCoche) {PrecioCoche = precioCoche;}





    public static void seguro()throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduzca su nombre: ");
        setNombreAsegurado(br.readLine());
        System.out.println("Edad: ");
        setEdad(Integer.parseInt(br.readLine()));
        System.out.println("Años de carnet: ");
        setAnosCarnet(Integer.parseInt(br.readLine()));
        System.out.println("Precio del coche: ");
        setPrecioCoche(Float.parseFloat(br.readLine()));

        if (getAnosCarnet()<5 ||  getEdad()<28){ tarifaBase = tarifaBase + suplemento;}

        importeCoste = tarifaBase + (tarifaBase/100*12);

        if (getPrecioCoche()>15000) { tarifaBase = tarifaBase + importeCoste; }

        Ver.ver();

    }
}
