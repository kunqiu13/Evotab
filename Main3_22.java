package Main3_223;

import java.util.*;

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

public class Main3_22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        for(int i = 1; i <= 5; i++) {
            System.out.println("Введите имя пользователя " + i);
            String name = in.nextLine();
            System.out.println("Введите возраст пользователя " + i);
            int age = in.nextInt();
            in.nextLine();
            User user = new User(name, age);
            users.add(user);
        }

        Collections.sort(users, new Comparator<User>() {
            public int compare(User user1, User user2) {
                return user1.getAge().compareTo(user2.getAge());
            }
        });
        for (User user : users) {
            System.out.println(user);
        }
    }
}
