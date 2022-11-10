package EjercicioSeguroCoche;

import java.io.IOException;

public class Principal {
    public static void main(String[] args)throws IOException {

        Seguro seguro1 = new Seguro();
        Seguro seguro2 = new Seguro();
        Seguro seguro3 = new Seguro();

        Seguro.seguro();
        System.out.println(seguro1);

        Seguro.seguro();
        System.out.println(seguro2);

        Seguro.seguro();
        System.out.println(seguro3);

    }
}
