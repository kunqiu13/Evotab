import java.text.*;
import java.util.*;
public class Main1_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SimpleDateFormat org = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("Введите дату в формате dd.MM.yyyy:");
        String iDate = in.nextLine();

        try {
            Date date = org.parse(iDate);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(Calendar.DAY_OF_MONTH, 45);
            System.out.println("Дата после увеличения на 45 дней: " + org.format(calendar.getTime()));

            calendar.set(Calendar.DAY_OF_YEAR, 1);
            System.out.println("Дата после сдвига на начало года: " + org.format(calendar.getTime()));

            int count = 0;
            while (count < 10) {
                calendar.add(Calendar.DAY_OF_MONTH, 1);
                int day = calendar.get(Calendar.DAY_OF_WEEK);
                if (day != Calendar.SATURDAY && day != Calendar.SUNDAY) {
                    count++;
                }
            }
            System.out.println("Дата после увеличения на 10 рабочих дней: " + org.format(calendar.getTime()));

            System.out.println("Введите вторую дату в формате dd.MM.yyyy:");
            String iDate2 = in.nextLine();
            Date date2 = org.parse(iDate2);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(date2);

            int work = 0;
            while (calendar.before(calendar2)) {
                int day = calendar.get(Calendar.DAY_OF_WEEK);
                if (day != Calendar.SATURDAY && day != Calendar.SUNDAY) {
                    work++;
                }
                calendar.add(Calendar.DAY_OF_MONTH, 1);
            }
            System.out.println("Количество рабочих дней между введенными датами: " + work);

        } catch (Exception e) {
            System.out.println("Ошибка");
        }
    }
}