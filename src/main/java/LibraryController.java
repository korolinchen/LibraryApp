import myLovelyExceptions.ExceptionBadReaderInfo;

import javax.swing.*;

public class LibraryController {
    private final ReaderRepository readerRepository = new ReaderRepository();

    //Register new reader
    //See books list
    //Borrow a book
    //Return a book
    //Review reader's info
    //Finish work

    public void registerNewReaderInController() {
        try {
            this.readerRepository.addToReaderBankFile(collectReaderInfoMethod()); // create the method

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    private Reader collectReaderInfoMethod() throws ExceptionBadReaderInfo {
        Reader reader = new Reader();
        reader.setNickname(this.getUSerInput("Please enter your nickname"));
        reader.setSecretWord(this.getUSerInput("Please enter your secret word"));

        if (
                reader.getNickname() == null || reader.getSecretWord() == null ||
                        reader.getNickname().isBlank() || reader.getNickname().isEmpty()||
                        reader.getSecretWord().isBlank() || reader.getSecretWord().isEmpty()
        ) {
            int userChoice = JOptionPane.showConfirmDialog(
                    null,
                    "You did not provide the data required" +
                    "Would you like to start again? ");
            if (userChoice == JOptionPane.YES_OPTION) {
                return this.collectReaderInfoMethod();
            }
            throw new ExceptionBadReaderInfo("The data provided did not match the requirements");
        }
        return reader;
    }

    private String getUSerInput(String message) {
        return JOptionPane.showInputDialog(message);
    }


}
