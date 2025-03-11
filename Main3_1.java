import java.util.Scanner;

class User {
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return name + ", возраст " + age + " лет";
    }
}

public class Main3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя первого пользователя");
        String name1 = in.nextLine();
        System.out.println("Введите возраст первого пользователя");
        Integer age1 = in.nextInt();
        in.nextLine();
        User user1 = new User(name1, age1);

        System.out.println("Введите имя второго пользователя");
        String name2 = in.nextLine();
        System.out.println("Введите возраст второго пользователя");
        Integer age2 = in.nextInt();
        User user2 = new User(name2, age2);

        if (user1.getAge() < user2.getAge()) {
            System.out.println(user1.toString());
        } else {
            System.out.println(user2.toString());
        }
    }
}