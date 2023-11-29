package interfaces;

public class PhonePe {
    BankingServices bankingServices;
    String upi;
    PhonePe(BankingServices bankingServices, String upi){
        this.bankingServices = bankingServices;
        this.upi = upi;
    }
    PhonePe(BankingServices bankingServices){
        this.bankingServices = bankingServices;
    }
    void addUPI(){
        System.out.println(this.upi+" UPI added.");
    }

    void checkBalance(int acc){
        bankingServices.checkBalance(acc);
    }

    void checkBalance(){
        bankingServices.checkBalance(this.upi);
    }

    void pay(){
        bankingServices.withDraw();
    }
}
