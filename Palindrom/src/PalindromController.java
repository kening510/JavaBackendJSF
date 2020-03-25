import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped

public class PalindromController implements Serializable {
    private String word;
    private boolean ifPalindrom;



    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public boolean isIfPalindrom() {
        return ifPalindrom;
    }

    public void setIfPalindrom(boolean ifPalindrom) {
        this.ifPalindrom = ifPalindrom;
    }
}
