import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class ReaderRepository {

    private final String readersBankFile = "readersBank.csv";

    public ReaderRepository() {
        try {
            this.createReaderBankFile();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private void createReaderBankFile() throws IOException {
        File readerFile = new File(readersBankFile);
        readerFile.createNewFile();
    }

    public void addToReaderBankFile(Reader theReader) throws IOException {
        FileWriter readerToFile = new FileWriter(this.readersBankFile, true);
        readerToFile.write(theReader.toString());
        readerToFile.close();
    }

    public ArrayList<Reader> getReadersList() throws FileNotFoundException {
        File readerFile = new File(this.readersBankFile);
        Scanner reader = new Scanner(readerFile);

        ArrayList<Reader> readers = new ArrayList<>();
        while (reader.hasNextLine()) {
            String readerRowString = reader.nextLine();
            String[] singleReaderDetailsArray = readerRowString.split(",");
            readers.add(this.validateAndConvert(singleReaderDetailsArray));
        }
        return readers;
    }

    private Reader validateAndConvert(String[] singleReaderDetailsArray) {

        Reader reader = new Reader();
        reader.setId(UUID.fromString(singleReaderDetailsArray[0]));
        reader.setNickname(singleReaderDetailsArray[1]);
        reader.setSecretWord(singleReaderDetailsArray[2]);

        return reader;
    }
}



