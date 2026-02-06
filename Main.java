import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Parqueadero parqueadero = new Parqueadero();

        System.out.print("Marca del vehículo: ");
        String marca = sc.nextLine();

        System.out.print("Tipo de vehículo: ");
        String tipo = sc.nextLine();

        System.out.print("Cilindraje: ");
        int cilindraje = sc.nextInt();

        System.out.print("Pago anterior: ");
        double pagoAnterior = sc.nextDouble();

        System.out.print("Número de celda (1-30): ");
        int celda = sc.nextInt();

        Vehiculo vehiculo = new Vehiculo(marca, tipo, cilindraje, pagoAnterior, celda);

        double base = parqueadero.calcularMensualidad(cilindraje);
        double pagoActual = parqueadero.aplicarIncremento(base);

        vehiculo.setPagoActual(pagoActual);
        vehiculo.mostrarFactura();
    }
}
