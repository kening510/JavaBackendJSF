import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class NavController implements Serializable {
    private String number;
    private boolean numberOne;

    public void ifNumberIsOne() {
        if (number.equalsIgnoreCase("1")) {
            numberOne = true;
        } else {
            numberOne = false;
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isNumberOne() {
        return numberOne;
    }

    public void setNumberOne(boolean numberOne) {
        this.numberOne = numberOne;
    }
}
