package interfaces;

public class HDFCBank implements BankingServices{

    @Override
    public void checkBalance(int acc) {
        System.out.println("Balance = 1000 using account number in HDFC Bank.");
    }

    @Override
    public void checkBalance(String upi) {
        System.out.println("Balance = 1000 using upi in HDFC Bank.");
    }

    @Override
    public void deposit() {
        System.out.println("Deposited to HDFC Bank.");
    }

    @Override
    public void withDraw() {
        System.out.println("WithDrawn from HDFC Bank.");
    }
}
