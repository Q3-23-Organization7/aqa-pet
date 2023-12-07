package homework11.part2;

public class Main {

    public static void main(String[] args){

        Book giperion = new Book("Giperion");
        Magazine vogue = new Magazine("Vogue");

        Printable book = giperion::print;
        Printable magazine = vogue::print;

        book.print();
        magazine.print();


        Printable[] printable = {giperion, vogue};


        Book.printBooks(printable);

        Magazine.printMagazines(printable);

    }
}
