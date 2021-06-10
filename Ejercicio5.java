import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int muj = 0, hom = 0, per, edad, HM;
        System.out.print("Cuantos personas?");
        per = scanner.nextInt();
        
        for (int i = 0; i < per; i++) {
            System.out.print("1: Hombre y 2: Mujer ");
            HM = scanner.nextInt();

            System.out.print("Ingrese su edad: ");
            edad = scanner.nextInt();

            if (edad < 18 && HM == 1) {
                hom++;
            }
            if (edad >= 18 && HM == 2) {

                muj++;
            }
        }
        System.out.println("Hombres hay:" + hom + "menores de edad");
        System.out.println("Mujeres hay:" + muj + "menores de edad");
    }
}