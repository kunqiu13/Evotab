import java.util.Scanner;
    public class Main1_4_2 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите строку:");
            String str = in.nextLine();
            String rep = str.replace("кака", "вырезано цензурой").replace("бяка", "вырезано цензурой");
            System.out.println(rep);
        }
    }

