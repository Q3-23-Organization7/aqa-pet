package homework8.part2;

public class Main {

    public static void main(String[] args){

        Book giperion = new Book();
        Magazine vogue = new Magazine();
        giperion.setName("Giperion");
        vogue.setName("Vogue");

        Printable[] printable = {giperion, vogue};

        for (Printable publication : printable) {

            publication.print();

            if (publication instanceof Book) {

                ((Book)publication).printBooks();
            }
            else {

                ((Magazine)publication).printMagazines();
            }
        }
    }
}
