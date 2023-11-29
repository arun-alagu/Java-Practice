package interfaces;

public class Main {
    public static void main(String[] args) {
        HDFCBank hdfc = new HDFCBank();
        ICICIBank icici = new ICICIBank();

        PhonePe ph = new PhonePe(icici,"asdf13@upi");

        ph.pay();
        ph.checkBalance();
        ph.addUPI();
        ph.checkBalance(1);
    }
}
