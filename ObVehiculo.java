public class Vehiculo {

    private String marca;
    private String tipo;
    private int cilindraje;
    private double pagoAnterior;
    private double pagoActual;
    private int numeroCelda;

    public Vehiculo(String marca, String tipo, int cilindraje, double pagoAnterior, int numeroCelda) {
        this.marca = marca;
        this.tipo = tipo;
        this.cilindraje = cilindraje;
        this.pagoAnterior = pagoAnterior;
        this.numeroCelda = numeroCelda;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public double getPagoAnterior() {
        return pagoAnterior;
    }

    public void setPagoActual(double pagoActual) {
        this.pagoActual = pagoActual;
    }

    public void mostrarFactura() {
        System.out.println("\n===== FACTURA =====");
        System.out.println("Marca: " + marca);
        System.out.println("Tipo: " + tipo);
        System.out.println("Cilindraje: " + cilindraje);
        System.out.println("Pago anterior: $" + pagoAnterior);
        System.out.println("Pago actual: $" + pagoActual);
        System.out.println("Número de celda: " + numeroCelda);
        System.out.println("===================");
    }
}
