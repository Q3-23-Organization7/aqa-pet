package homework8.part2;

public class Book implements Printable {

    static String name;

    public static void setName(String name) {
        Book.name = name;
    }

    public static String getName() {
        return name;
    }

    @Override
    public void print(){
        System.out.println("print book");
    }

    public static void printBooks () {
        System.out.println("book name: " + name);
    }

}
