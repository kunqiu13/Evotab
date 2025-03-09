import java.util.*;

public class Main1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите 3 числа:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int count = 0;
        if (a % 5 == 0) {
            System.out.println("a=" + a);
            count++;
        }
        if (b % 5 == 0) {
            System.out.println("b=" + b);
            count++;
        }
        if (c % 5 == 0) {
            System.out.println("c=" + c);
            count++;
        }
        if (count == 0) {
            System.out.println("нет значений, кратных 5");
        }

        System.out.println("Результат целочисленного деления a на b: " + (a / b));
        System.out.println("Результат деления a на b: " + ((double) a / b));
        System.out.println("Результат деления a на b с округлением в большую сторону: " + (int) Math.ceil((double) a / b));
        System.out.println("Результат деления a на b с округлением в меньшую сторону: " + (int) Math.floor((double) a / b));
        System.out.println("Результат деления a на b с математическим округлением: " + Math.round((double) a / b));
        System.out.println("Остаток от деления b на c: " + (b % c));
        System.out.println("Наименьшее значение из a и b: " + Math.min(a, b));
        System.out.println("Наибольшее значение из b и c: " + Math.max(b, c));
    }
}
