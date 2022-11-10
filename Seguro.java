import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Seguro {
    public float tarifaBase = 300;
    public final int suplemento = 100;
    public float importeCoste;
    public String NombreAsegurado;
    public int Edad, AnosCarnet;
    public float PrecioCoche;


    //Getters&Setters

    public String getNombreAsegurado() {
        return NombreAsegurado;
    }

    public void setNombreAsegurado(String nombreAsegurado) {
        NombreAsegurado = nombreAsegurado;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public int getAnosCarnet() {
        return AnosCarnet;
    }

    public void setAnosCarnet(int anosCarnet) {
        AnosCarnet = anosCarnet;
    }

    public float getPrecioCoche() {
        return PrecioCoche;
    }

    public void setPrecioCoche(float precioCoche) {
        PrecioCoche = precioCoche;
    }


    public double seguro() throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduzca su nombre: ");
        setNombreAsegurado(br.readLine());
        System.out.println("Edad: ");
        setEdad(Integer.parseInt(br.readLine()));
        System.out.println("Años de carnet: ");
        setAnosCarnet(Integer.parseInt(br.readLine()));
        System.out.println("Precio del coche: ");
        setPrecioCoche(Float.parseFloat(br.readLine()));

//aqui meter toda la operacion para saber los datos
        public double operacion() {
            double tarifaBase1 = 0;
            double tarifaBase2 = 0;
            if (getAnosCarnet() < 5 || getEdad() < 28) {
                tarifaBase1 = tarifaBase1 + suplemento;
            }
            if (getPrecioCoche() > 15000) {
                tarifaBase2 = tarifaBase2 + importeCoste;
            }
            return tarifaBase1+tarifaBase2;
        }


        importeCoste = tarifaBase + (tarifaBase / 100 * 12);


        @Override
        public String toString () {
            Ver ver1 = new Ver(tarifaBase, "nombreAsegurado");
            return ver1.ver();
        }


    }
}
