import java.util.Objects;
import java.util.UUID;

public class Reader {

    private UUID id;
    private String nickname;
    private String secretWord;


    public Reader() {
        this.id = UUID.randomUUID();
    }



    public Reader(UUID id, String nickname, String secretWord) {
        this.id = id;
        this.nickname = nickname;
        this.secretWord = secretWord;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSecretWord() {
        return secretWord;
    }

    public void setSecretWord(String secretWord) {
        this.secretWord = secretWord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reader reader = (Reader) o;
        return Objects.equals(id, reader.id) && Objects.equals(nickname, reader.nickname) && Objects.equals(secretWord, reader.secretWord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nickname, secretWord);
    }

    @Override
    public String toString() {
        return id + "," + nickname + "," + secretWord + " ";
    }
}
