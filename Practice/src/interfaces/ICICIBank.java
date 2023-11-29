package interfaces;

public class ICICIBank implements BankingServices{

    @Override
    public void withDraw() {
       System.out.println("WithDrawn from ICICI bank.");
    }

    @Override
    public void deposit() {
        System.out.println("Deposited to ICICI Bank.");
    }


    public void checkBalance(int acc) {
        System.out.println("Balance = 1000 using account number in ICICI Bank.");
    }

    public void checkBalance(String upi){
        System.out.println("Balance = 1000 using upi in ICICI Bank.");
    }
}
