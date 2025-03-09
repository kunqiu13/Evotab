import java.text.*;
import java.util.*;
public class Main1_4_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дату в формате 'дд.мм.гггг'");
        String inputDate = in.nextLine();
        SimpleDateFormat inputFormat = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = inputFormat.parse(inputDate);
            String datex = outputFormat.format(date);
            System.out.println(datex);
        } catch (ParseException e) {
        }
    }
}
