package homework8.part2;

public class Magazine implements Printable {

    static String name;

    public static void setName(String name) {
        Magazine.name = name;
    }

    public static String getName() {
        return name;
    }

    @Override
    public void print(){
        System.out.println("print magazine");
    }

    public static void printMagazines () {
        System.out.println("magazine name: " + name);
    }
}
