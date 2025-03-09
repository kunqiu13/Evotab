import java.util.Scanner;
    public class Main1_4_3 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите дату в формате 'дд.мм.гггг'");
            String date = in.nextLine();
            String[] part = date.split("\\.");
            String datex = part[2] + "-" + part[1] + "-" + part[0];
            System.out.println(datex);
        }
    }
