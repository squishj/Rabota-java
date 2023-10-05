import java.util.Scanner;
public class ProgNum1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введи своё имя: ");
        String name = in.nextLine();
        System.out.print("Введи свой возраст: ");
        float age = in.nextFloat();
        System.out.print("Введи свой рост: ");
        float height = in.nextFloat();

        System.out.printf("Имя: %s Возраст: %.2f Рост: %.2f \n", name, age, height);
        in.close();
    }
}