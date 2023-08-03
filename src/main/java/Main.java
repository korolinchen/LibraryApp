import java.util.List;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        main.start();
    }

    void start() {
        System.out.println("\nWelcome to Sunny Ocean Library\n");

        List<BookOfLibrary> listOfBooksInLibrary = List.of( //frozen list
                new BookOfLibrary("1984", "Orwell", "George", "1949"),
                new BookOfLibrary("1984", "Orwell", "George", "1949"),
                new BookOfLibrary("Animal Farm", "Orwell", "George", "1945"),
                new BookOfLibrary("Animal Farm", "Orwell", "George", "1945"),
                new BookOfLibrary("Pan's Labyrinth", "del Toro", "Guillermo", "2019"),
                new BookOfLibrary("Pan's Labyrinth", "del Toro", "Guillermo", "2019"),
                new BookOfLibrary("Hellraiser", "Barker", "Clive", "2006"),
                new BookOfLibrary("Hellraise", "Barker", "Clive", "2006")
        );
        System.out.println("The books you may borrow at our library right now are: \n");
        this.showAllBooksInLibraryNow(listOfBooksInLibrary);


    }
    public void showAllBooksInLibraryNow(List<BookOfLibrary> theListOfChoice) {
        for (BookOfLibrary currentItem : theListOfChoice) { //on right side the name of the list, on the left type of the item
            System.out.println(currentItem);
        }
    }
}

