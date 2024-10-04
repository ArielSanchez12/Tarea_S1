import java.util.Scanner;
public class EjercicioIf {
    public static void main(String[] args) {

        int edad;
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        edad = input.nextInt();
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
    }
}