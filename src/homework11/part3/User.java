package homework11.part3;

import java.util.Objects;

public class User {

    private String firstName;

    private String secondName;

    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getAge() == user.getAge() && Objects.equals(getFirstName(), user.getFirstName()) && Objects.equals(getSecondName(), user.getSecondName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getSecondName(), getAge());
    }

}
