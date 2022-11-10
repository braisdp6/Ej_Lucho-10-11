public class Ver {
    float tarifaBase = 0;
    String nombreAsegurado;
    String output;


    public Ver(float tarifaBase, String nombreAsegurado) {
        this.tarifaBase = tarifaBase;
        this.nombreAsegurado = nombreAsegurado;
    }

    public String ver() {
        output = "--------Presupuesto-del-seguro-del-coche----------\n"+"--------------------------------------------------\n"+"Nombre del asegurado: \n" + nombreAsegurado+"\n--------------------------------------------------"+"\nPrecio a abonar: $" + tarifaBase+"\n--------------------------------------------------";

        return output;
    }
}
