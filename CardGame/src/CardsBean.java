import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.*;
import java.util.*;

@Named
@SessionScoped
public class CardsBean implements Serializable {

    private List<String> randomFourCards = new ArrayList<>();
    private List<String> allCards = new ArrayList<>();


    public void setRandomFourCards(List<String> randomFourCards) {
        this.randomFourCards = randomFourCards;
    }

    public List<String> getRandomFourCards() {
        return randomFourCards;
    }

    public void loadAllCards() {
        try {
            File[] files = new File("C:\\Users\\André\\Documents\\CardGame\\web\\resources\\cards").listFiles();
            assert files != null;
            for (File file : files) {
                allCards.add(file.getName());
            }

        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public void shuffle(){
        Collections.shuffle(allCards);
    }

    public void emptyList(){
        randomFourCards.clear();
    }

    public void pickFourRandomCards(){
        emptyList();
        randomFourCards.add(allCards.get(0));
        randomFourCards.add(allCards.get(1));
        randomFourCards.add(allCards.get(2));
        randomFourCards.add(allCards.get(3));
    }


    public void clickRefreshButton(){
        shuffle();
        pickFourRandomCards();
    }

    @PostConstruct
    public void init(){
        loadAllCards();
        shuffle();
        pickFourRandomCards();
    }

}
