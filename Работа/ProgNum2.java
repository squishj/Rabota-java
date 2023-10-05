import java.util.Scanner;
public class ProgNum2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Первое число: ");
        float chislo1 = in.nextFloat();

        System.out.print("Второе число: ");
        float chislo2 = in.nextFloat();

        System.out.print("Выберете оператора: \n" + "1)+ \n2)- \n3)* \n4)% \n ");
        Integer operator = in.nextInt();

        float tr = 0;

        switch (operator) {
            case 1:
                tr = chislo1 + chislo2;
                System.out.printf("%.2f + %.2f = %.2f",chislo1, chislo2, tr);
                break;
            case 2:
                tr = chislo1 - chislo2;
                System.out.printf("%.2f - %.2f = %.2f",chislo1, chislo2, tr);
                break;
            case 3:
                tr = chislo1 * chislo2;
                System.out.printf("%.2f * %.2f = %.2f",chislo1, chislo2, tr);
                break;
            case 4:
                if (chislo2 == 0) {
                System.out.print("Не надо дядя");
            }   else {
                tr = chislo1 / chislo2;
                System.out.printf("%.2f / %.2f = %.2f",chislo1, chislo2, tr);
                break;
            }
            default:
                System.out.print("Ты очень глупый, раз не умеешь правильно читать инструкции");
                break;
        }
    }
}
