import java.util.Scanner;
public class Imc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float peso, altura, imc;

        System.out.print("Ingrese su peso en kg: ");
        peso = input.nextFloat();
        System.out.print("Ingrese su altura en metros: ");
        altura = input.nextFloat();
        imc = peso/(altura*2);

        if(imc < 18.5) {
            System.out.println("Su IMC es " + imc + ", usted esta en el rango de Bajo peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Su IMC es " + imc + ", usted esta en el rango de Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Su IMC es " + imc + ", usted esta en el rango de Sobrepeso");
        } else {
            System.out.println("Su IMC es " + imc + ", usted esta en el rango de Obesidad");
        }
    }
}
