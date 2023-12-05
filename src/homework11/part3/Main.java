package homework11.part3;

import jdk.management.resource.ResourceType;

import java.util.List;
import java.util.Comparator;
import java.util.stream.Stream;
import java.util.stream.Collectors;



public class Main {

    public static void main(String[] args){

       User user1 = new User("Taras", "Misiac", 35);
       User user2 = new User("Maria", "Zirka", 15);
       User user3 = new User("Olha", "Sonce", 27);
       User user4 = new User("Oleh", "More", 44);
       User user5 = new User("Andrii", "Gora", 29);
       User user6 = new User("Ivan", "Astra", 35);
       User user7 = new User("Maria", "Kvitka", 11);
       User user8 = new User("Kateryna", "Luna", 18);
       User user9 = new User("Oleksandr", "Ptaha", 40);
       User user10 = new User("Alla", "Mars", 21);



       List<User> users = Stream
               .of(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10)
               .collect(Collectors.toList());

       System.out.println("Collection a: ");
       users.forEach(System.out::println);



       List<User> usersByAge = users.stream()
               .sorted(Comparator.comparing(User::getAge)).collect(Collectors.toList());

       System.out.println("Collection b(sorted by Age): ");
       usersByAge.forEach(System.out::println);



       double averageAge = users.stream().mapToInt(User::getAge).average().orElse(0.0);

       System.out.println("Average age of users: " + averageAge);


       List<User> usersByFirstNameAndAge = users.stream()
               .sorted(Comparator.comparing(User::getFirstName).thenComparing(User::getAge))
               .collect(Collectors.toList());

       System.out.println("Collection d(sorted by FirstName and Age): ");
       usersByFirstNameAndAge.forEach(System.out::println);



       boolean secondNameStartWithSOrA = users.stream()
               .anyMatch(user -> user.getSecondName().startsWith("S") || user.getSecondName().startsWith("A"));

       System.out.println("Users with secondName starting with 'A' or 'S': " + secondNameStartWithSOrA + ":");

       List<User> usersSecondNameStartWith = users.stream()
               .filter(user -> user.getSecondName().startsWith("S") || user.getSecondName().startsWith("A"))
               .collect(Collectors.toList());

       usersSecondNameStartWith.forEach(System.out::println);



       boolean allUsersMoreThan18 = users.stream()
               .allMatch(user -> user.getAge() >= 18);

       System.out.println("All users are more than 18: " + allUsersMoreThan18);


    }

}
