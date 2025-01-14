//programa que pida dos numeros al usuario y haga suma resta multiplicacion y division de los dos numeros 

import java.util.Scanner;

public class prueba4 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("introduzca un primer numero ");
    int primernumero = sc.nextInt();
    System.out.println("introduzca un segundo numero ");
    int segundonumero = sc.nextInt();

     var suma = primernumero + segundonumero;
     var resta = primernumero - segundonumero;
     var division = primernumero % segundonumero;
     var multiplicacion = primernumero * segundonumero;

    
    System.out.println(suma);
    System.out.println(resta);
    System.out.println(multiplicacion);
    System.out.println(division);

    if (primernumero>segundonumero){
        System.out.println("el " + primernumero + "es mayor que " + segundonumero);

    }else{
        System.out.println("el numero " + segundonumero + " es mayor");
    }
    if (primernumero > 0 ) System.out.println("el primer numero es positivo");
    if (segundonumero > 0 )System.out.println("el segundo numero es mayor de 0");
   } 
}
