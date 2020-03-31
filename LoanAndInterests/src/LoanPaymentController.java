import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped

public class LoanPaymentController implements Serializable {
    private LoanPayment loanPayment = new LoanPayment();
    private List<LoanPayment> loanPaymentList = new ArrayList<>();

    public LoanPayment getLoanPayment() {
        return loanPayment;
    }

    public void setLoanPayment(LoanPayment loanPayment) {
        this.loanPayment = loanPayment;
    }


    public List<LoanPayment> getLoanPaymentList() {
        return loanPaymentList;
    }

    public void setLoanPaymentList(List<LoanPayment> loanPaymentList) {
        this.loanPaymentList = loanPaymentList;
    }

    public double getTotalPayment(){ // WRONG!
        double sum = loanPayment.getTotalLoan();
        double rate = loanPayment.getLoanInterest();
        int year = loanPayment.getNumberOfYears();

        for(int i = 0; i<=year; i++){
            sum = sum + sum*rate*0.01;
        }
        return sum;
    }

    public double getMonthlyPayment(){
        return (getTotalPayment()/loanPayment.getNumberOfYears())/12;
    }

    public void reset(){
        loanPayment.setTotalLoan(0);
        loanPayment.setLoanInterest(0);
        loanPayment.setNumberOfYears(0);
    }
}
