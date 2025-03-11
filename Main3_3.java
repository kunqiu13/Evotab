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

public class Main3_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Integer, List<User>> player = new HashMap<>();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Введите имя пользователя " + i);
            String name = in.nextLine();
            System.out.println("Введите возраст пользователя " + i);
            int age = in.nextInt();
            in.nextLine();
            User user = new User(name, age);
            if (player.containsKey(age)) {
                player.get(age).add(user);
            } else {
                List<User> newUser = new ArrayList<>();
                newUser.add(user);
                player.put(age, newUser);
            }
        }

        System.out.println("Введите требуемый возраст:");
        int findAge = in.nextInt();
        if (player.containsKey(findAge)) {
            List<User> users = player.get(findAge);
            Collections.sort(users, new Comparator<User>() {
                public int compare(User user1, User user2) {
                    return user1.getName().compareTo(user2.getName());
                }
            });
            for (User user : users) {
                System.out.println(user);
            }
        } else {
            System.out.println("Пользователь с возрастом '" + findAge + "' не найден");
        }
    }
}
