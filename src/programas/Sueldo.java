
package programas;
//**@author LATORREM
import java.util.Scanner;
public class Sueldo {
    public static void main(String[] args) {
     // Declarar variables
     String empleado;
     double ht, th, sb, descuento, sn;
    // Generar objeto de lectura
    Scanner lectura= new Scanner (System.in);
    //Entrada de datos
    System.out.print("Nombre del empleado: ");
    empleado = lectura.next();
    System.out.print("Horas Trabajadas: ");
    ht = lectura.nextDouble();
    System.out.print("Tarifa por hora: ");
    th = lectura.nextDouble();
    //Proceso de los datos
    sb=ht*th;
    descuento=sb*0.13;
    sn=sb-descuento;
    //SALIDA DE DATOS
    System.out.println("El sueldo bruto es: S/."+sb);
    System.out.println("El descuento es: S/. "+descuento);
    System.out.println("El sueldo neto es: S/."+sn);
    //Finalizacion
    }
}

