package homework8.part2;

public class Main {

    public static void main(String[] args){

        Book giperion = new Book("Giperion");
        Magazine vogue = new Magazine("Vogue");

        Printable[] printable = {giperion, vogue};

        for (Printable publication : printable) {

            publication.print();
        }

        Book.printBooks(printable);

        Magazine.printMagazines(printable);

    }
}
