<<<<<<< HEAD
=======
import javax.swing.*;
>>>>>>> 87c7ce7 (LibraryApp August 2023)
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
<<<<<<< HEAD
                new BookOfLibrary("Hellraise", "Barker", "Clive", "2006")
=======
                new BookOfLibrary("Hellraise", "Barker", "Clive", "2006"),
                new BookOfLibrary("Hellraiser2", "Barker", "Clive", "2009"),
                new BookOfLibrary("Hellraise2", "Barker", "Clive", "2009")
>>>>>>> 87c7ce7 (LibraryApp August 2023)
        );
        System.out.println("The books you may borrow at our library right now are: \n");
        this.showAllBooksInLibraryNow(listOfBooksInLibrary);

<<<<<<< HEAD

=======
        String userChoice = "";
        while (!userChoice.equals(" ")) {

            userChoice = JOptionPane.showInputDialog(
                    new StringBuilder()
                            .append("Choose an action please")
                            .append("\n1. Register new reader")
                            .append("\n2. See books list")
                            .append("\n3. Borrow a book")
                            .append("\n4. Return a book")
                            .append("\n5. Review reader's info")
                            .append("\n6. Finish work")
                            .toString()
            );
            switch (userChoice) {
                case "1":

            }
        }
>>>>>>> 87c7ce7 (LibraryApp August 2023)
    }
    public void showAllBooksInLibraryNow(List<BookOfLibrary> theListOfChoice) {
        for (BookOfLibrary currentItem : theListOfChoice) { //on right side the name of the list, on the left type of the item
            System.out.println(currentItem);
        }
    }
}

