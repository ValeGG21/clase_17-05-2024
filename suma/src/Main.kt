import java.util.Scanner;

fun suma(){
    var Scanner = Scanner(System.`in`);

    System.out.print("Ingresa el primer número: ");
    var numero1 = Scanner.nextInt();

    System.out.print("Ingresa el segundo número: ");
    var numero2 = Scanner.nextInt();

    var suma = numero1 + numero2;

    System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);

}