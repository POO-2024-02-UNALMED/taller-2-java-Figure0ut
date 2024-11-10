package test;

public class Auto {
    public String modelo;
    public int precio;
    public Asiento[] asientos;
    public String marca;
    public Motor motor;
    public int registro;
    public static String cantidadCreados;


    public Auto() {

    }

    public int cantidadAsientos() {
        int contador = 0;
        for (Asiento asiento : asientos) {
            if (asiento != null) {
                contador++;
            }
        }
        return contador;
    }

    public String verificarIntegridad() {
        if (motor.registro != registro) {
            return "Las piezas no son originales";
        }
        for (Asiento asiento : asientos) {
            if (asiento != null && asiento.registro != registro) {
                return "Las piezas no son originales";
            }
        }
        return "Auto original";
    }
}
