import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;


public class LoanPayment implements Serializable {
    private double totalLoan;
    private double loanInterest;
    private int numberOfYears;
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LoanPayment() {
    }

    public double getTotalLoan() {
        return totalLoan;
    }

    public void setTotalLoan(double totalLoan) {
        this.totalLoan = totalLoan;
    }

    public double getLoanInterest() {
        return loanInterest;
    }

    public void setLoanInterest(double loanInterest) {
        this.loanInterest = loanInterest;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

}
