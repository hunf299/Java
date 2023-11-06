package GK2022;

public interface Implement {
    public double checkAccount(String id, String accountNum);
    boolean transferMoney(String receiverId, String receiverAccountNumber, double amount);
    double addMoney(double moneyADD);
    double withdrawMoney(double moneyWD);
}
