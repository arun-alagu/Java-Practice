package interfaces;

public interface BankingServices {
    void withDraw();
    void deposit();
    void checkBalance(int acc);
    void checkBalance(String upi);

}
