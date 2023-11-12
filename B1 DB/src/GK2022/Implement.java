package GK2022;

public interface Implement {
    double checkAccount(String id, String accountNum);
    boolean transferMoney(Customer sender, Customer receiver, double amount);
    double addMoney(double moneyADD);
    double withdrawMoney(double moneyWD);
}
