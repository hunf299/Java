package GK2022;

public interface Implement {
    public double checkAccount(String id, String accountNum);
    boolean transferMoney(String senderId, String senderAccountNumber, String receiverId, String receiverAccountNumber, double amount);
    double addMoney(String receiverID, String receiverAccountNum, double moneyADD);
    double withdrawMoney(String wdID, String wdAccountNum, double moneyWD);
}
