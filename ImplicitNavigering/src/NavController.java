import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Random;

@Named
@SessionScoped

public class NavController implements Serializable {

    private Random random = new Random();
    private int randNrOne = random.nextInt(100);
    private int randNrTwo = random.nextInt(100);
    private int sum;

    public void calculate(){
        setSum(randNrOne + randNrTwo);
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public int getRandNrOne() {
        return randNrOne;
    }

    public void setRandNrOne(int randNrOne) {
        this.randNrOne = randNrOne;
    }

    public int getRandNrTwo() {
        return randNrTwo;
    }

    public void setRandNrTwo(int randNrTwo) {
        this.randNrTwo = randNrTwo;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }
}
