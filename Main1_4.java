import java.util.Scanner;
    public class Main1_4 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите строку:");
            String str = in.nextLine();
            System.out.println("Введите подстроку:");
            String downstr = in.nextLine();

            int index = 0;
            int count = 0;
            while ((index = str.indexOf(downstr, index)) != -1) {
                index += downstr.length();
                count++;
            }
            System.out.println("Подстрока '" + downstr + "' встречается " + count + " раза");
        }
    }
