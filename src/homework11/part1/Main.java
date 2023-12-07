package homework11.part1;


public class Main {

    public static void main(String[] args){

        Book giperion = new Book("Giperion");
        Magazine vogue = new Magazine("Vogue");

        Printable book = () -> System.out.println("Printing a book with lambda expression");
        Printable magazine = () -> System.out.println("Printing a magazine with lambda expression");

        book.print();
        magazine.print();

        Printable[] printable = {giperion, vogue};


        Book.printBooks(printable);

        Magazine.printMagazines(printable);

    }
}
