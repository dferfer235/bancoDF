package bancodavid;

import java.util.Scanner;

/**
 * @author davidfdez
 */
public class Banco2 {

    public static void main(String[] args) {
        final double VALOR_MULTIPLICATIVO = 5.85;
        boolean repetir = true;
        int seleccion;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("¿Que edad tiene el cliente?(Mayores de 18 y menores de 65)");

            int edad = teclado.nextInt();

            if (edad < 18 || edad > 65) {

                System.out.println("El cliente no tiene una edad adecuada");

            } else {
                System.out.println("¿Cuento cobra mensualmente?");

                int cobroMensual = teclado.nextInt();

                System.out.println("¿Cuanta pasta necesita para el prestamo?");
                double limitePrestamo = cobroMensual * VALOR_MULTIPLICATIVO;
                System.out.println("(El cliente no puede pedir mas de "
                        + limitePrestamo + " euros de prestamos)");
                int importePrestamo = teclado.nextInt();

                if (importePrestamo > limitePrestamo) {
                    System.out.println("No podemos conceder el prestamo");
                } else {

                    System.out.println("El prestamo puede ser concedido");
                    System.out.println("¿Cuantos años necesitas para devolverlo?(No puedes superar los 75 años)");
                    int tPrestamo = teclado.nextInt();

                    if ((tPrestamo + edad) > 75) {
                        System.out.println("No se puede conceder el prestamo");
                    } else {
                        System.out.println("Las condiciones son adecuadas,"
                                + " se concedera el prestamo");
                        System.out.println("Detalles del prestamo:\n"
                                + "Dinero solicitado: " + importePrestamo + " Euros\n"
                                + "Dinero por devolver: " + (importePrestamo + (importePrestamo * 0.4)) + "\n"
                                + "Plazo para la devolucion: " + tPrestamo + " Años\n"
                                + "Recuerde que si no cumple el plazo le buscaremos ");
                    }
                }
            }
            System.out.println("¿Desea realizar otro prestamo?\n"
                    + "1.-Si\n"
                    + "2.-No");
            seleccion = teclado.nextInt();
            if (seleccion != 1) {
                System.out.println("¿Estas seguro?\n"
                        + "1.-Si\n"
                        + "2.-No");
                seleccion = teclado.nextInt();
                if (seleccion != 2) {
                    System.out.println("¿¿SEGURO??\n"
                            + "1.-SEGURISIMO\n"
                            + "2.-He cambiado de idea");
                    seleccion = teclado.nextInt();
                    if (seleccion == 1) {
                        System.out.println("Vale :(");
                        repetir = false;
                    }
                }
            }

            if (repetir == true) {
                System.out.println("Repitiendo...");
            }

        } while (repetir == true);

    }
}
