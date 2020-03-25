
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Named(value = "ticket")
@RequestScoped

public class BookingController implements Serializable {
    private String firstName;
    private String lastName;
    private String occupation;
    private String destinationSelected;
    private String classes;


    private List<String> destinationList = new ArrayList<>();
    private List<String> classList = new ArrayList<>();

    @PostConstruct
    public void initz(){
        destinationList.add("Stockholm");
        destinationList.add("Peking");
        destinationList.add("Tokyo");

        classList.add("First");
        classList.add("Business");
        classList.add("Economy");

    }


    public String getDestinationSelected() {
        return destinationSelected;
    }

    public void setDestinationSelected(String destinationSelected) {
        this.destinationSelected = destinationSelected;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getConfirmInfo(){
        return "Ticket booked! " + "\n" + "Welcome, " + occupation + " " + firstName + " " + lastName + " ."
                + "\nEnjoy your flight to " + destinationSelected + " in " + classes + " class.";
    }

    public List<String> getDestinationList() {
        return destinationList;
    }

    public void setDestinationList(List<String> destinationList) {
        this.destinationList = destinationList;
    }

    public List<String> getClassList() {
        return classList;
    }

    public void setClassList(List<String> classList) {
        this.classList = classList;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
