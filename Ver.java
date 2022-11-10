package EjercicioSeguroCoche;

public class Ver {
    public static void ver(){
        System.out.println("--------Presupuesto-del-seguro-del-coche----------");
        System.out.println("--------------------------------------------------");
        System.out.println("Nombre del asegurado: "+Seguro.getNombreAsegurado());
        System.out.println("--------------------------------------------------");
        System.out.println("Precio a abonar: $"+Seguro.tarifaBase);
        System.out.println("--------------------------------------------------");

    }
}
