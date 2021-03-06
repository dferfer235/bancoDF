package bancodavid;

import java.util.Scanner;

/**
 *
 * El Banco Tetimo quiere desarrollar un programa de estudio de viabilidad
 * hipotecaria para potenciales clientes de la entidad. Este programa debe
 * decidir si un cliente es "apto" para ser timado por el banco o por el
 * contrario, según los datos aportados por el cliente, el banco lo rechaza y lo
 * declara "no apto" por no ser rentable.
 *
 * Según los gerentes de Tetimo, cuando un cliente aterriza en su web para
 * solicitar una hipoteca, lo primero que deben saber es su edad y su sueldo
 * bruto mensual. Hay que tener en cuenta que no se conceden préstamos a menores
 * de edad y a mayores de 65 años.
 *
 * Si la edad es válida, el programa solicita al cliente la cantidad total de
 * pasta que necesita para su hipoteca. Si esa cantidad que se solicita supera
 * la cantidad resultante de multiplicar el sueldo bruto anual del cliente por
 * el factor multiplicativo, entonces la hipoteca se rechaza. En Tetimo el
 * factor multiplicativo es de 5,85. Por ejemplo, si un cliente gana al año
 * 30000 pavos, no podría pedir más de 30000*5,85.
 *
 * Si el cliente ha pasado el filtro de edad y el filtro de la cantidad a
 * solicitar , el programa le solicita el número de años en los que quiere
 * devolver la hipoteca. Tetimo no concede hipotecas a más de 30 años y a menos
 * de cinco. Además, si la edad de la persona sumada a los años a devolver el
 * préstamo supera los 75 años, el préstamo se rechaza.
 */
public class Banco {
    
    public static void main(String[] args) {
        final double VALOR_MULTIPLICATIVO = 5.85;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("¿Que edad tiene el cliente?");
        
        int edad = teclado.nextInt();
        
        if (edad < 18 || edad > 65) {
            
            System.out.println("El cliente no tiene una edad adecuada");
            
        } else {
            System.out.println("¿Cuento cobra mensualmente?");
            
            int cobroMensual = teclado.nextInt();
            
            System.out.println("Cuanta pasta necesita para el prestamo");
            
            int importePrestamo = teclado.nextInt();
            
            double limitePrestamo = cobroMensual * VALOR_MULTIPLICATIVO;
            
            System.out.println("El cliente no puede pedir mas de "
                    + limitePrestamo + " euros de prestamos");
            if (importePrestamo > limitePrestamo) {                
                System.out.println("No podemos conceder el prestamo");
            } else {
                
                System.out.println("El prestamo puede ser concedido");
                System.out.println("¿Cuantos años necesitas para devolverlo?");
                int tPrestamo = teclado.nextInt();
                
                if ((tPrestamo + edad) > 75) {
                    System.out.println("No se puede conceder el prestamo");
                } else {
                    System.out.println("Las condiciones son adecuadas,"
                            + " se concedera el prestamo");
                }
            }
        }
        
    }
    
}
