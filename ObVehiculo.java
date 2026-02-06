import java.util.Scanner;

public class ObVehiculo {

    // Atributos
    private String marca;
    private String tipo;
    private int cilindraje;
    private double pagoAnt;
    private double pagoAct;
    private int nCelda;

    // Constructor vacío
    public ObVehiculo() {
    }

    // Método para ingresar datos y generar factura
    public void ingresarDatosYGenerarFactura() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== INGRESO DE DATOS DEL VEHÍCULO ===");

        System.out.print("Marca del vehículo: ");
        marca = sc.nextLine();

        System.out.print("Tipo de vehículo: ");
        tipo = sc.nextLine();

        System.out.print("Cilindraje: ");
        cilindraje = sc.nextInt();

        System.out.print("Pago anterior: ");
        pagoAnt = sc.nextDouble();

        System.out.print("Pago actual: ");
        pagoAct = sc.nextDouble();

        System.out.print("Número de celda: ");
        nCelda = sc.nextInt();

        generarFactura();
    }

    // Método para generar la factura
    private void generarFactura() {
        double totalPagar = pagoAct - pagoAnt;

        System.out.println("\n===== FACTURA =====");
        System.out.println("Marca: " + marca);
        System.out.println("Tipo: " + tipo);
        System.out.println("Cilindraje: " + cilindraje);
        System.out.println("Celda: " + nCelda);
        System.out.println("Pago anterior: $" + pagoAnt);
        System.out.println("Pago actual: $" + pagoAct);
        System.out.println("------------------------");
        System.out.println("TOTAL A PAGAR: $" + totalPagar);
        System.out.println("========================");
    }

    // Método main para ejecutar el programa
    public static void main(String[] args) {
        ObVehiculo vehiculo = new ObVehiculo();
        vehiculo.ingresarDatosYGenerarFactura();
    }
}
